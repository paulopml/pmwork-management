package br.com.pmwork.propertyeditors;

import java.beans.PropertyEditorSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.pmwork.model.entity.Acesso;
import br.com.pmwork.model.repositories.AcessoRepositories;

@Component
public class AcessoPropertyEditor extends PropertyEditorSupport {

	@Autowired private AcessoRepositories acessoRepositories;
	
	public void setAsText(String text) throws IllegalArgumentException{
		long idAcesso = Long.parseLong(text);
		Acesso acesso = acessoRepositories.findOne(idAcesso);
		setValue(acesso);
	}
}
