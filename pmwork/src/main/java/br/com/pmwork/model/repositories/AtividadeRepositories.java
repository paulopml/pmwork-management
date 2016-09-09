package br.com.pmwork.model.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.pmwork.model.entity.Atividade;

@Repository
public interface AtividadeRepositories extends CrudRepository<Atividade, Long>{

}
