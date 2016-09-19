package br.com.pmwork.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Indicadores {

	@Id	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@NotEmpty
	private String nomeIndicador;
	
	@NotNull
	@NotEmpty
	private String tipoIndicador;
	
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
		
	public String getTipoIndicador() {
		return tipoIndicador;
	}
	public void setTipoIndicador(String tipoIndicador) {
		this.tipoIndicador = tipoIndicador;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nomeIndicador == null) ? 0 : nomeIndicador.hashCode());
		result = prime * result + ((tipoIndicador == null) ? 0 : tipoIndicador.hashCode());
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
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nomeIndicador == null) {
			if (other.nomeIndicador != null)
				return false;
		} else if (!nomeIndicador.equals(other.nomeIndicador))
			return false;
		if (tipoIndicador == null) {
			if (other.tipoIndicador != null)
				return false;
		} else if (!tipoIndicador.equals(other.tipoIndicador))
			return false;
		return true;
	}
	
	
	
}
