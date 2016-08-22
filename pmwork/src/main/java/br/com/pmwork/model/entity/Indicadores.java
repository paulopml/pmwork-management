package br.com.pmwork.model.entity;

import javax.persistence.Entity;

@Entity
public class Indicadores {

	private Long id;
	private String nomeIndicador;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeIndicador() {
		return nomeIndicador;
	}
	public void setNomeIndicador(String nomeIndicador) {
		this.nomeIndicador = nomeIndicador;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomeIndicador == null) ? 0 : nomeIndicador.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Indicadores other = (Indicadores) obj;
		if (nomeIndicador == null) {
			if (other.nomeIndicador != null)
				return false;
		} else if (!nomeIndicador.equals(other.nomeIndicador))
			return false;
		return true;
	}
	
	
	
}
