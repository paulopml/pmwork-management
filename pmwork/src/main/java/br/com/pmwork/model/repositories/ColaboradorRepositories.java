package br.com.pmwork.model.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.pmwork.model.entity.Colaborador;

@Repository
public interface ColaboradorRepositories extends CrudRepository<Colaborador, Long> {

	public Colaborador findOneByLogin(String login);
}
