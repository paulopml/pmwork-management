package br.com.pmwork.model.entity;

import javax.persistence.Entity;

@Entity
public class Equipe {

	private Long id;
	private Colaborador colaboradores;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Colaborador getColaboradores() {
		return colaboradores;
	}
	public void setColaboradores(Colaborador colaboradores) {
		this.colaboradores = colaboradores;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((colaboradores == null) ? 0 : colaboradores.hashCode());
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
		Equipe other = (Equipe) obj;
		if (colaboradores == null) {
			if (other.colaboradores != null)
				return false;
		} else if (!colaboradores.equals(other.colaboradores))
			return false;
		return true;
	}
	
}
