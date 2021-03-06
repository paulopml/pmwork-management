package br.com.pmwork.controllers;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import br.com.pmwork.exception.ColaboradorInvalidoException;
import br.com.pmwork.model.entity.Acesso;
import br.com.pmwork.model.entity.Colaborador;
import br.com.pmwork.model.repositories.AcessoRepositories;
import br.com.pmwork.model.repositories.ColaboradorRepositories;
import br.com.pmwork.propertyeditors.AcessoPropertyEditor;

@Controller
@RequestMapping("/cadastrocolaborador")
public class ColaboradorController {

	@Autowired private AcessoPropertyEditor acessoPropertyEditor;
	@Autowired private ColaboradorRepositories colaboradorRepositories;
	@Autowired private AcessoRepositories acessoRepositories; 
	
	@RequestMapping(method=RequestMethod.GET)
	public String listaColaboradores(Model model){
				
		model.addAttribute("titulo", "Colaboradores");
		model.addAttribute("colaboradores", colaboradorRepositories.findAll());
		model.addAttribute("acessos", acessoRepositories.findAll());
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

	@InitBinder
	public void initBinder(WebDataBinder webDataBinder){
		 webDataBinder.registerCustomEditor(Acesso.class, acessoPropertyEditor);
		 SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		 dateFormat.setLenient(false);
		 webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}
}
