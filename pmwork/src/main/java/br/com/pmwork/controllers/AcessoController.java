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

import br.com.pmwork.exception.AcessoInvalidoException;
import br.com.pmwork.model.entity.Acesso;
import br.com.pmwork.model.nums.RegraProjeto;
import br.com.pmwork.model.repositories.AcessoRepositories;

@Controller
@RequestMapping("/controleacesso")
public class AcessoController {

	@Autowired private AcessoRepositories acessoRepositories;
	
	@RequestMapping(method = RequestMethod.GET)
	public String listarAcesso(Model model) {
		Iterable<Acesso> acessos = acessoRepositories.findAll();
		
		model.addAttribute("titulo", "Acessos");
		model.addAttribute("acessos", acessos);
		model.addAttribute("regra", RegraProjeto.values());
		return "controleacesso/lista-controle-acesso";
	}
	@RequestMapping(method = RequestMethod.POST)
	public String salvarAcesso(@Valid @ModelAttribute Acesso acessos, BindingResult bindingResult, Model model){
		
		if(bindingResult.hasErrors()){
			throw new AcessoInvalidoException();
		}
		else{
			acessoRepositories.save(acessos);
		}
		model.addAttribute("acessos", acessoRepositories.findAll());
		return "controleacesso/tabela-controle";
	}
	@RequestMapping(method=RequestMethod.DELETE, value="/{id}")
	public ResponseEntity<String> deletarAcesso(@PathVariable Long id){
		try{
			acessoRepositories.delete(id);
			return new ResponseEntity<String>(HttpStatus.OK);

		}catch(Exception ex){
			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
		}
	}
	@RequestMapping(method=RequestMethod.GET, value="/{id}")
	@ResponseBody
	public Acesso buscarAcesso(@PathVariable Long id){
		Acesso  acessos = acessoRepositories.findOne(id);
		return acessos;
	}
}
