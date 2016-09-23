package br.com.pmwork.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	public String salvarIndicador(@Valid @ModelAttribute Indicadores indicadores, BindingResult bindingResult,
			RedirectAttributes redirectAttributes){
		
		if(bindingResult.hasErrors()){
			FieldError error = bindingResult.getFieldErrors().get(0);
			redirectAttributes.addFlashAttribute("mensagemErro", "Não foi possível salvar o indicador, existem campos vazios ");
		}
		else{
			indicadoresRepositorio.save(indicadores);
			redirectAttributes.addFlashAttribute("mensagemInfo", "O indicador foi salvo com sucesso.");
		}
				
		return "redirect:/app/indicador";
	}

}
