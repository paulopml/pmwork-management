package br.com.pmwork.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class ConfigSeguranca extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
		   .withUser("admin").password("admin").roles("PROJETO");
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
					.defaultSuccessUrl("/app/indicador")
					.failureUrl("/login.jsp?semacesso=true")
					.usernameParameter("login")
					.passwordParameter("senha")
					
					.and()
						.logout()
							.logoutUrl("/sair")
							.logoutSuccessUrl("/login.jsp?saiu=true");
	}
	
}
