package br.com.pmwork.model.entity;

import java.sql.Date;
import javax.persistence.Entity;

@Entity
public class Fase {

	private Long id;
	private String nomeFase;
	private Date dataInicio;
	private Date dataTermino;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeFase() {
		return nomeFase;
	}
	public void setNomeFase(String nomeFase) {
		this.nomeFase = nomeFase;
	}
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getDataTermino() {
		return dataTermino;
	}
	public void setDataTermino(Date dataTermino) {
		this.dataTermino = dataTermino;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataInicio == null) ? 0 : dataInicio.hashCode());
		result = prime * result + ((dataTermino == null) ? 0 : dataTermino.hashCode());
		result = prime * result + ((nomeFase == null) ? 0 : nomeFase.hashCode());
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
		Fase other = (Fase) obj;
		if (dataInicio == null) {
			if (other.dataInicio != null)
				return false;
		} else if (!dataInicio.equals(other.dataInicio))
			return false;
		if (dataTermino == null) {
			if (other.dataTermino != null)
				return false;
		} else if (!dataTermino.equals(other.dataTermino))
			return false;
		if (nomeFase == null) {
			if (other.nomeFase != null)
				return false;
		} else if (!nomeFase.equals(other.nomeFase))
			return false;
		return true;
	}
	
}
