package br.com.pmwork.model.servicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.pmwork.model.repositories.ColaboradorRepositories;

@Service
public class ServicoAutenticacao implements UserDetailsService{

	@Autowired ColaboradorRepositories colaboradorRepositories;
	
	@Override
	public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
		return colaboradorRepositories.findOneByLogin(login);
	}

	
}
