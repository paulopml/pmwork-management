package br.com.pmwork.model.entity;

import javax.persistence.Entity;

@Entity
public class Atividade {

	private Long id;
	private String nomeAtividade;
	private String descricao;
	private String estimativa;
	private Colaborador responsavel;
	private String faseAtual;
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
	public String getEstimativa() {
		return estimativa;
	}
	public void setEstimativa(String estimativa) {
		this.estimativa = estimativa;
	}
	public Colaborador getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(Colaborador responsavel) {
		this.responsavel = responsavel;
	}
	public String getFaseAtual() {
		return faseAtual;
	}
	public void setFaseAtual(String faseAtual) {
		this.faseAtual = faseAtual;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((estimativa == null) ? 0 : estimativa.hashCode());
		result = prime * result + ((faseAtual == null) ? 0 : faseAtual.hashCode());
		result = prime * result + ((nomeAtividade == null) ? 0 : nomeAtividade.hashCode());
		result = prime * result + ((responsavel == null) ? 0 : responsavel.hashCode());
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
		if (nomeAtividade == null) {
			if (other.nomeAtividade != null)
				return false;
		} else if (!nomeAtividade.equals(other.nomeAtividade))
			return false;
		if (responsavel == null) {
			if (other.responsavel != null)
				return false;
		} else if (!responsavel.equals(other.responsavel))
			return false;
		return true;
	}
}