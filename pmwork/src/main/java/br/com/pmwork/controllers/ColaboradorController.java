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

import br.com.pmwork.exception.ColaboradorInvalidoException;
import br.com.pmwork.exception.IndicadorInvalidoException;
import br.com.pmwork.model.entity.Colaborador;
import br.com.pmwork.model.entity.Indicadores;
import br.com.pmwork.model.repositories.ColaboradorRepositories;

@Controller
@RequestMapping("/cadastrocolaborador")
public class ColaboradorController {

	@Autowired ColaboradorRepositories colaboradorRepositories;
	
	@RequestMapping(method=RequestMethod.GET)
	public String listaColaboradores(Model model){
		Iterable<Colaborador> colaboradores = colaboradorRepositories.findAll();
		
		model.addAttribute("titulo", "Colaboradores");
		model.addAttribute("colaboradores", colaboradores);
		return "cadastrocolaborador/lista-colaborador";
	}
	@RequestMapping(method=RequestMethod.POST)
	public String salvarColaborador(@Valid @ModelAttribute Colaborador colaboradores, BindingResult bindingResult,Model model){
		if(bindingResult.hasErrors()){
			throw new ColaboradorInvalidoException();
		}
		else{
			colaboradorRepositories.save(colaboradores);
		}
		model.addAttribute("colaboradores", colaboradorRepositories.findAll());
		return "cadastrocolaborador/tabela-colaborador";
	}
	@RequestMapping(method=RequestMethod.DELETE, value="/{id}")
	public ResponseEntity<String> deletarColaborador(@PathVariable Long id){
		
		try{
			colaboradorRepositories.delete(id);
			return new ResponseEntity<String>(HttpStatus.OK);

		}catch(Exception ex){
			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
		}
	}
	@RequestMapping(method=RequestMethod.GET, value="/{id}")
	@ResponseBody
	public Colaborador buscarColabordor(@PathVariable Long id){
		Colaborador colaboradores = colaboradorRepositories.findOne(id);
		return colaboradores;
	}
}
