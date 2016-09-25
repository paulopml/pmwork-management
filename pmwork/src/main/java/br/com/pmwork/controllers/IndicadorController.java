package br.com.pmwork.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.pmwork.exception.IndicadorInvalidoException;
import br.com.pmwork.model.entity.Indicadores;
import br.com.pmwork.model.repositories.IndicadoresRepositories;

@Controller
@RequestMapping("/indicador")
public class IndicadorController {

	@Autowired private IndicadoresRepositories indicadoresRepositorio;
	
	@RequestMapping(method = RequestMethod.GET)
	public String listarIndicadores(Model model) {
		Iterable<Indicadores> indicadores = indicadoresRepositorio.findAll();
		
		model.addAttribute("titulo", "Listagem");
		model.addAttribute("indicadores", indicadores);
		return "indicador/listagem";
	}
	@RequestMapping(method = RequestMethod.POST)
	public String salvarIndicador(@Valid @ModelAttribute Indicadores indicadores, BindingResult bindingResult, Model model){
		
		if(bindingResult.hasErrors()){
			throw new IndicadorInvalidoException();
		}
		else{
			indicadoresRepositorio.save(indicadores);
		}
		model.addAttribute("indicadores", indicadoresRepositorio.findAll());
		return "indicador/tabela-indicador";
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/{id}")
	public ResponseEntity<String> deletarIndicador(@PathVariable Long id){
		
		try{
			indicadoresRepositorio.delete(id);
			return new ResponseEntity<String>(HttpStatus.OK);

		}catch(Exception ex){
			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
		}
	}
	@RequestMapping(method=RequestMethod.GET, value="/{id}")
	@ResponseBody
	public Indicadores buscarIndicador(@PathVariable Long id){
		Indicadores indicadores = indicadoresRepositorio.findOne(id);
		return indicadores;
	}

}
