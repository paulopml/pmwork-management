package br.com.pmwork.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.pmwork.model.entity.Projeto;
import br.com.pmwork.model.nums.ClassificacaoRisco;
import br.com.pmwork.model.nums.Status;
import br.com.pmwork.model.repositories.ColaboradorRepositories;
import br.com.pmwork.model.repositories.IndicadoresRepositories;
import br.com.pmwork.model.repositories.ProjetoRepositories;

@Controller
@RequestMapping("/relatorio")
public class RelatorioController {

	
	@Autowired private ProjetoRepositories projetoRepositories;
	@Autowired private ColaboradorRepositories colaboradorRepositories; 
	@Autowired private IndicadoresRepositories indicadoresRepositories; 
	
	@RequestMapping(method=RequestMethod.GET)
	public String listarRelatorios(Model model){

		
		model.addAttribute("titulo", "Relatorios");
		model.addAttribute("projetos", projetoRepositories.findAll());
		model.addAttribute("status", Status.values());
		model.addAttribute("classificacaoRisco", ClassificacaoRisco.values());
		model.addAttribute("equipes", colaboradorRepositories.findAll());
		model.addAttribute("indicadores", indicadoresRepositories.findAll());
		return "relatorio/lista-relatorios";
	}
	@RequestMapping(method=RequestMethod.GET, value="/{id}")
	@ResponseBody
	public Projeto buscarRelatorio(@PathVariable Long id){
		Projeto projeto = projetoRepositories.findOne(id);
		return projeto;
	}
}
