package br.com.pmwork.model.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.pmwork.model.entity.Projeto;

@Repository
public interface ProjetoRepositories extends CrudRepository<Projeto,Long>{

}