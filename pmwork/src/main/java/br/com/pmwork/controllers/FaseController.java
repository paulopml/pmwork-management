package br.com.pmwork.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.pmwork.exception.FaseInvalidoException;
import br.com.pmwork.model.entity.Fase;
import br.com.pmwork.model.repositories.AtividadeRepositories;
import br.com.pmwork.model.repositories.ColaboradorRepositories;
import br.com.pmwork.model.repositories.FaseRepositories;
import br.com.pmwork.model.repositories.IndicadoresRepositories;
import br.com.pmwork.model.repositories.ProjetoRepositories;

@Controller
@RequestMapping("/fase")
public class FaseController {

	@Autowired private ProjetoRepositories projetoRepositories;
	@Autowired private ColaboradorRepositories colaboradorRepositories; 
	@Autowired private IndicadoresRepositories indicadoresRepositories; 
	@Autowired private AtividadeRepositories atividadeRepositories;
	@Autowired private FaseRepositories faseRepositories;
	

	@RequestMapping(method=RequestMethod.GET)
	public String listarFase(Model model){
		
		model.addAttribute("titulo", "Fase");
		model.addAttribute("fase", faseRepositories.findAll());
		return "detalheprojeto/lista-detalhe";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String salvarFase(@Valid @ModelAttribute Fase fase, BindingResult bindingResult, Model model){
		
		if(bindingResult.hasErrors()){
			throw new FaseInvalidoException();
		}
		else {
			faseRepositories.save(fase);
		}
		model.addAttribute("fase", faseRepositories.findAll());
		return "detalheprojeto/tabela-atividade";
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/{id}")
	@ResponseBody
	public Fase buscarFase(@PathVariable Long id){
		Fase fase = faseRepositories.findOne(id);
		return fase;
	}
}
