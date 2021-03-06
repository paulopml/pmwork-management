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

import br.com.pmwork.exception.AtividadeInvalidoException;
import br.com.pmwork.model.entity.Atividade;
import br.com.pmwork.model.entity.Projeto;
import br.com.pmwork.model.nums.ClassificacaoRisco;
import br.com.pmwork.model.nums.Status;
import br.com.pmwork.model.repositories.AtividadeRepositories;
import br.com.pmwork.model.repositories.ColaboradorRepositories;
import br.com.pmwork.model.repositories.ProjetoRepositories;

@Controller
@RequestMapping("/detalheprojeto")
public class AtividadeController {

	@Autowired private ProjetoRepositories projetoRepositories;
	@Autowired private ColaboradorRepositories colaboradorRepositories; 
	@Autowired private AtividadeRepositories atividadeRepositories;
	
	@RequestMapping(method=RequestMethod.GET)
	public String listarAtividades(Model model){
		Iterable<Projeto> projetos = projetoRepositories.findAll();
		
		model.addAttribute("titulo", "Detalhe");
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
			throw new AtividadeInvalidoException();
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
		
}
