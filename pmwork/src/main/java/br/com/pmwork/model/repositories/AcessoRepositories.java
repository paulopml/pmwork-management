package br.com.pmwork.model.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.pmwork.model.entity.Acesso;

@Repository
public interface AcessoRepositories extends CrudRepository<Acesso, Long>{

}
