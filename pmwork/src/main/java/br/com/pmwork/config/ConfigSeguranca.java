package br.com.pmwork.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import br.com.pmwork.model.servicos.ServicoAutenticacao;

@Configuration
@EnableWebSecurity
public class ConfigSeguranca extends WebSecurityConfigurerAdapter{
	
	@Autowired private ServicoAutenticacao servicoAutenticacao;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	//	auth.inMemoryAuthentication().withUser("admin").password("admin").roles("PROJETO");
		auth
			.userDetailsService(servicoAutenticacao)
			.passwordEncoder(encoder());
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
				.antMatchers("/app/**").hasRole("PROJETO")
				.anyRequest().permitAll()
				.and()
					.formLogin().loginPage("/login.jsp")
					.loginProcessingUrl("/autenticar")
					.defaultSuccessUrl("/home.jsp")
					.failureUrl("/login.jsp?semacesso=true")
					.usernameParameter("login")
					.passwordParameter("senha")
					
					.and()
						.logout()
							.logoutUrl("/sair")
							.logoutSuccessUrl("/login.jsp?saiu=true");
	}
	@Bean
	public BCryptPasswordEncoder encoder(){
		return new BCryptPasswordEncoder();
	}
	/*public static void  main(String[] args){
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		System.out.println(encoder.encode("admin"));
	}*/
}
