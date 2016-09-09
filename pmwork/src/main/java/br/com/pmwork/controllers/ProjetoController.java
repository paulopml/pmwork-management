package br.com.pmwork.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.pmwork.model.repositories.ProjetoRepositories;

@Controller
@RequestMapping("/projeto")
public class ProjetoController {
	
	@Autowired private ProjetoRepositories projetoRepositories;
	
	@RequestMapping("/quantas")
	@ResponseBody
	public String quantosProjetos(){
		return "Atualmente há "+projetoRepositories.count()+" cadastrados!";
	}
}