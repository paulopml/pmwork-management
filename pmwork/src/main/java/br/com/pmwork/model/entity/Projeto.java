package br.com.pmwork.model.entity;

import java.sql.Date;
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
import org.springframework.format.annotation.DateTimeFormat;

import br.com.pmwork.model.nums.ClassificacaoRisco;
import br.com.pmwork.model.nums.Status;

@Entity
public class Projeto {

	@Id	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@NotEmpty
	private String nome;
	
	@NotNull
	@NotEmpty
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dataInicio;
	
	@NotNull
	@NotEmpty
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dataTermino;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dataRealTermino;
	
	@NotNull
	@NotEmpty
	private String descricaoEscopo;
	
	@NotNull
	@NotEmpty
	private Double orcamentoTotal;
	
	@NotNull
	@ManyToMany
	private Set<Colaborador> gerenteProjeto;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	private ClassificacaoRisco classificacaoRisco;
	
	@ManyToMany
	private Set<Fase> fase;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	private Status status;
	
	@ManyToMany
	private Set<Equipe> equipe;
	
	@ManyToMany
	private Set<Indicadores> indicadores;
	
	@ManyToMany
	private Set<Atividade> atividade;
	
	private String justificativa;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dataUltAlteracao;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
	public Date getDataRealTermino() {
		return dataRealTermino;
	}
	public void setDataRealTermino(Date dataRealTermino) {
		this.dataRealTermino = dataRealTermino;
	}
	public String getDescricaoEscopo() {
		return descricaoEscopo;
	}
	public void setDescricaoEscopo(String descricaoEscopo) {
		this.descricaoEscopo = descricaoEscopo;
	}
	public Double getOrcamentoTotal() {
		return orcamentoTotal;
	}
	public void setOrcamentoTotal(Double orcamentoTotal) {
		this.orcamentoTotal = orcamentoTotal;
	}
	public Set<Colaborador> getGerenteProjeto() {
		return gerenteProjeto;
	}
	public void setGerenteProjeto(Set<Colaborador> gerenteProjeto) {
		this.gerenteProjeto = gerenteProjeto;
	}
	public Set<Fase> getFase() {
		return fase;
	}
	public void setFase(Set<Fase> fase) {
		this.fase = fase;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	
	public Set<Equipe> getEquipe() {
		return equipe;
	}
	public void setEquipe(Set<Equipe> equipe) {
		this.equipe = equipe;
	}
	public Set<Indicadores> getIndicadores() {
		return indicadores;
	}
	public void setIndicadores(Set<Indicadores> indicadores) {
		this.indicadores = indicadores;
	}
	public Set<Atividade> getAtividade() {
		return atividade;
	}
	public void setAtividade(Set<Atividade> atividade) {
		this.atividade = atividade;
	}
	public String getJustificativa() {
		return justificativa;
	}
	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}
	public Date getDataUltAlteracao() {
		return dataUltAlteracao;
	}
	public void setDataUltAlteracao(Date dataUltAlteracao) {
		this.dataUltAlteracao = dataUltAlteracao;
	}	
	public ClassificacaoRisco getClassificacaoRisco() {
		return classificacaoRisco;
	}
	public void setClassificacaoRisco(ClassificacaoRisco classificacaoRisco) {
		this.classificacaoRisco = classificacaoRisco;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((atividade == null) ? 0 : atividade.hashCode());
		result = prime * result + ((classificacaoRisco == null) ? 0 : classificacaoRisco.hashCode());
		result = prime * result + ((dataInicio == null) ? 0 : dataInicio.hashCode());
		result = prime * result + ((dataRealTermino == null) ? 0 : dataRealTermino.hashCode());
		result = prime * result + ((dataTermino == null) ? 0 : dataTermino.hashCode());
		result = prime * result + ((descricaoEscopo == null) ? 0 : descricaoEscopo.hashCode());
		result = prime * result + ((equipe == null) ? 0 : equipe.hashCode());
		result = prime * result + ((fase == null) ? 0 : fase.hashCode());
		result = prime * result + ((gerenteProjeto == null) ? 0 : gerenteProjeto.hashCode());
		result = prime * result + ((indicadores == null) ? 0 : indicadores.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((orcamentoTotal == null) ? 0 : orcamentoTotal.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((dataUltAlteracao == null) ? 0 : dataUltAlteracao.hashCode());
		result = prime * result + ((justificativa == null) ? 0 : justificativa.hashCode());
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
		Projeto other = (Projeto) obj;
		if (atividade == null) {
			if (other.atividade != null)
				return false;
		} else if (!atividade.equals(other.atividade))
			return false;
	    if (classificacaoRisco != other.classificacaoRisco)
			return false;
		if (dataInicio == null) {
			if (other.dataInicio != null)
				return false;
		} else if (!dataInicio.equals(other.dataInicio))
			return false;
		if (dataRealTermino == null) {
			if (other.dataRealTermino != null)
				return false;
		} else if (!dataRealTermino.equals(other.dataRealTermino))
			return false;
		if (dataTermino == null) {
			if (other.dataTermino != null)
				return false;
		} else if (!dataTermino.equals(other.dataTermino))
			return false;
		if (descricaoEscopo == null) {
			if (other.descricaoEscopo != null)
				return false;
		} else if (!descricaoEscopo.equals(other.descricaoEscopo))
			return false;
		if (equipe == null) {
			if (other.equipe != null)
				return false;
		} else if (!equipe.equals(other.equipe))
			return false;
		if (fase == null) {
			if (other.fase != null)
				return false;
		} else if (!fase.equals(other.fase))
			return false;
		if (gerenteProjeto == null) {
			if (other.gerenteProjeto != null)
				return false;
		} else if (!gerenteProjeto.equals(other.gerenteProjeto))
			return false;
		if (indicadores == null) {
			if (other.indicadores != null)
				return false;
		} else if (!indicadores.equals(other.indicadores))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (orcamentoTotal == null) {
			if (other.orcamentoTotal != null)
				return false;
		} else if (!orcamentoTotal.equals(other.orcamentoTotal))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (dataUltAlteracao == null) {
			if (other.dataUltAlteracao != null)
				return false;
		} else if (!dataUltAlteracao.equals(other.dataUltAlteracao))
			return false;
		if (justificativa == null) {
			if (other.justificativa != null)
				return false;
		} else if (!justificativa.equals(other.justificativa))
			return false;
		return true;
	}
	
	
}
