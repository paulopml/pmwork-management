package br.com.pmwork.model.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.pmwork.model.entity.Indicadores;

@Repository
public interface IndicadoresRepositories extends CrudRepository<Indicadores, Long>{

}
