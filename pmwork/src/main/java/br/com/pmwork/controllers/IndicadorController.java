package br.com.pmwork.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	

}
