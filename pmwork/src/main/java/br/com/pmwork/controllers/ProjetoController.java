package br.com.pmwork.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.pmwork.exception.ProjetoInvalidoException;
import br.com.pmwork.model.entity.Atividade;
import br.com.pmwork.model.entity.Fase;
import br.com.pmwork.model.entity.Projeto;
import br.com.pmwork.model.nums.ClassificacaoRisco;
import br.com.pmwork.model.nums.Status;
import br.com.pmwork.model.repositories.AtividadeRepositories;
import br.com.pmwork.model.repositories.ColaboradorRepositories;
import br.com.pmwork.model.repositories.FaseRepositories;
import br.com.pmwork.model.repositories.IndicadoresRepositories;
import br.com.pmwork.model.repositories.ProjetoRepositories;

@Controller
@RequestMapping("/projetos")
public class ProjetoController {
	
	@Autowired private ProjetoRepositories projetoRepositories;
	@Autowired private ColaboradorRepositories colaboradorRepositories; 
	@Autowired private IndicadoresRepositories indicadoresRepositories; 
	@Autowired private AtividadeRepositories atividadeRepositories;
	@Autowired private FaseRepositories faseRepositories;
	
	@RequestMapping(method=RequestMethod.GET)
	public String listarProjetos(Model model){
		Iterable<Projeto> projetos = projetoRepositories.findAll();

		
		model.addAttribute("titulo", "Projetos");
		model.addAttribute("projetos", projetos);
		model.addAttribute("status", Status.values());
		model.addAttribute("classificacaoRisco", ClassificacaoRisco.values());
		model.addAttribute("equipes", colaboradorRepositories.findAll());
		model.addAttribute("indicadores", indicadoresRepositories.findAll());
		return "projetos/lista-projetos";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String salvarProjetos(@Valid @ModelAttribute Projeto projeto, BindingResult bindingResult, Model model){
		
		if(bindingResult.hasErrors()){
			throw new ProjetoInvalidoException();
		}
		else {
			projetoRepositories.save(projeto);
		}
		model.addAttribute("projetos", projetoRepositories.findAll());
		return "projetos/tabela-projeto";
	}
	
	@RequestMapping(method=RequestMethod.DELETE)
	public ResponseEntity<String> deletarProjeto(@PathVariable Long id){
		try{
			projetoRepositories.delete(id);
			return new ResponseEntity<String>(HttpStatus.OK);

		}catch(Exception ex){
			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
		}
	}
	@RequestMapping(method=RequestMethod.GET, value="/{id}")
	@ResponseBody
	public Projeto buscarProjeto(@PathVariable Long id){
		Projeto projeto = projetoRepositories.findOne(id);
		return projeto;
	}
	
	//Atividades
	@RequestMapping(method=RequestMethod.GET)
	public String listarAtividades(Model model){
		Iterable<Projeto> projetos = projetoRepositories.findAll();
		
		model.addAttribute("titulo", "Projetos");
		model.addAttribute("projetos", projetos);
		model.addAttribute("atividades", atividadeRepositories.findAll());
		model.addAttribute("status", Status.values());
		model.addAttribute("classificacaoRisco", ClassificacaoRisco.values());
		model.addAttribute("equipes", colaboradorRepositories.findAll());
		return "detalheprojeto/lista-detalhe";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String salvarAtividade(@Valid @ModelAttribute Atividade atividade, BindingResult bindingResult, Model model){
		
		if(bindingResult.hasErrors()){
			throw new ProjetoInvalidoException();
		}
		else {
			atividadeRepositories.save(atividade);
		}
		model.addAttribute("atividade", atividadeRepositories.findAll());
		return "detalheprojeto/tabela-atividade";
	}
	
	@RequestMapping(method=RequestMethod.DELETE)
	public ResponseEntity<String> deletarAtividade(@PathVariable Long id){
		try{
			atividadeRepositories.delete(id);
			return new ResponseEntity<String>(HttpStatus.OK);

		}catch(Exception ex){
			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
		}
	}
	@RequestMapping(method=RequestMethod.GET, value="/{id}")
	@ResponseBody
	public Atividade buscarAtividade(@PathVariable Long id){
		Atividade atividade = atividadeRepositories.findOne(id);
		return atividade;
	}
	
	//Fase
	@RequestMapping(method=RequestMethod.GET)
	public String listarFase(Model model){
		
		model.addAttribute("titulo", "Fase");
		model.addAttribute("fase", faseRepositories.findAll());
		return "detalheprojeto/lista-detalhe";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String salvarFase(@Valid @ModelAttribute Fase fase, BindingResult bindingResult, Model model){
		
		if(bindingResult.hasErrors()){
			throw new ProjetoInvalidoException();
		}
		else {
			faseRepositories.save(fase);
		}
		model.addAttribute("fase", faseRepositories.findAll());
		return "detalheprojeto/tabela-atividade";
	}
	
	@RequestMapping(method=RequestMethod.DELETE)
	public ResponseEntity<String> deletarFase(@PathVariable Long id){
		try{
			faseRepositories.delete(id);
			return new ResponseEntity<String>(HttpStatus.OK);

		}catch(Exception ex){
			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
		}
	}
	@RequestMapping(method=RequestMethod.GET, value="/{id}")
	@ResponseBody
	public Fase buscarFase(@PathVariable Long id){
		Fase fase = faseRepositories.findOne(id);
		return fase;
	}
	
}