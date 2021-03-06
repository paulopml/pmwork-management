package br.com.pmwork.model.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import br.com.pmwork.model.nums.Status;
import br.com.pmwork.model.nums.StatusAtividade;

@Entity
public class Atividade {

	@Id	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@NotEmpty
	private String nomeAtividade;
	
	@NotNull
	@NotEmpty
	private String descricao;
	
	private Double estimativa;
	
	private Double realizado;
	
	@ManyToMany
	private Set<Colaborador> responsavel;
	
	@ManyToMany
	private Set<Fase> faseAtual;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	private StatusAtividade statusAtividade;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeAtividade() {
		return nomeAtividade;
	}
	public void setNomeAtividade(String nomeAtividade) {
		this.nomeAtividade = nomeAtividade;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getEstimativa() {
		return estimativa;
	}
	public Double getRealizado() {
		return realizado;
	}
	public void setRealizado(Double realizado) {
		this.realizado = realizado;
	}
	public void setEstimativa(Double estimativa) {
		this.estimativa = estimativa;
	}

	public Set<Colaborador> getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(Set<Colaborador> responsavel) {
		this.responsavel = responsavel;
	}
	public Set<Fase> getFaseAtual() {
		return faseAtual;
	}
	public void setFaseAtual(Set<Fase> faseAtual) {
		this.faseAtual = faseAtual;
	}
	
	public StatusAtividade getStatusAtividade() {
		return statusAtividade;
	}
	public void setStatusAtividade(StatusAtividade statusAtividade) {
		this.statusAtividade = statusAtividade;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((estimativa == null) ? 0 : estimativa.hashCode());
		result = prime * result + ((faseAtual == null) ? 0 : faseAtual.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nomeAtividade == null) ? 0 : nomeAtividade.hashCode());
		result = prime * result + ((realizado == null) ? 0 : realizado.hashCode());
		result = prime * result + ((responsavel == null) ? 0 : responsavel.hashCode());
		result = prime * result + ((statusAtividade == null) ? 0 : statusAtividade.hashCode());
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
		Atividade other = (Atividade) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (estimativa == null) {
			if (other.estimativa != null)
				return false;
		} else if (!estimativa.equals(other.estimativa))
			return false;
		if (faseAtual == null) {
			if (other.faseAtual != null)
				return false;
		} else if (!faseAtual.equals(other.faseAtual))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nomeAtividade == null) {
			if (other.nomeAtividade != null)
				return false;
		} else if (!nomeAtividade.equals(other.nomeAtividade))
			return false;
		if (realizado == null) {
			if (other.realizado != null)
				return false;
		} else if (!realizado.equals(other.realizado))
			return false;
		if (responsavel == null) {
			if (other.responsavel != null)
				return false;
		} else if (!responsavel.equals(other.responsavel))
			return false;
		if (statusAtividade != other.statusAtividade)
			return false;
		return true;
	}
}
