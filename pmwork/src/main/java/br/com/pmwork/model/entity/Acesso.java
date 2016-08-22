package br.com.pmwork.model.entity;

import javax.persistence.Entity;

@Entity
public class Acesso {

	private Long id;
	private String cargo;
	private boolean incluirProjetos;
	private boolean cadastrarIndicador;
	private boolean controlarAcesso;
	private boolean manterStatus;
	private boolean excluirProjetos;
	private boolean associarIndicador;
	private boolean gerarRelatorios;
	private boolean manterAtividade;
	private boolean editarProjetos;
	private boolean manterEquipe;
	private boolean incluirFase;
	private boolean visualizarProjetos;
	private boolean manterColaborador;
	private boolean classificarRisco;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public boolean isIncluirProjetos() {
		return incluirProjetos;
	}
	public void setIncluirProjetos(boolean incluirProjetos) {
		this.incluirProjetos = incluirProjetos;
	}
	public boolean isCadastrarIndicador() {
		return cadastrarIndicador;
	}
	public void setCadastrarIndicador(boolean cadastrarIndicador) {
		this.cadastrarIndicador = cadastrarIndicador;
	}
	public boolean isControlarAcesso() {
		return controlarAcesso;
	}
	public void setControlarAcesso(boolean controlarAcesso) {
		this.controlarAcesso = controlarAcesso;
	}
	public boolean isManterStatus() {
		return manterStatus;
	}
	public void setManterStatus(boolean manterStatus) {
		this.manterStatus = manterStatus;
	}
	public boolean isExcluirProjetos() {
		return excluirProjetos;
	}
	public void setExcluirProjetos(boolean excluirProjetos) {
		this.excluirProjetos = excluirProjetos;
	}
	public boolean isAssociarIndicador() {
		return associarIndicador;
	}
	public void setAssociarIndicador(boolean associarIndicador) {
		this.associarIndicador = associarIndicador;
	}
	public boolean isGerarRelatorios() {
		return gerarRelatorios;
	}
	public void setGerarRelatorios(boolean gerarRelatorios) {
		this.gerarRelatorios = gerarRelatorios;
	}
	public boolean isManterAtividade() {
		return manterAtividade;
	}
	public void setManterAtividade(boolean manterAtividade) {
		this.manterAtividade = manterAtividade;
	}
	public boolean isEditarProjetos() {
		return editarProjetos;
	}
	public void setEditarProjetos(boolean editarProjetos) {
		this.editarProjetos = editarProjetos;
	}
	public boolean isManterEquipe() {
		return manterEquipe;
	}
	public void setManterEquipe(boolean manterEquipe) {
		this.manterEquipe = manterEquipe;
	}
	public boolean isIncluirFase() {
		return incluirFase;
	}
	public void setIncluirFase(boolean incluirFase) {
		this.incluirFase = incluirFase;
	}
	public boolean isVisualizarProjetos() {
		return visualizarProjetos;
	}
	public void setVisualizarProjetos(boolean visualizarProjetos) {
		this.visualizarProjetos = visualizarProjetos;
	}
	public boolean isManterColaborador() {
		return manterColaborador;
	}
	public void setManterColaborador(boolean manterColaborador) {
		this.manterColaborador = manterColaborador;
	}
	public boolean isClassificarRisco() {
		return classificarRisco;
	}
	public void setClassificarRisco(boolean classificarRisco) {
		this.classificarRisco = classificarRisco;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (associarIndicador ? 1231 : 1237);
		result = prime * result + (cadastrarIndicador ? 1231 : 1237);
		result = prime * result + ((cargo == null) ? 0 : cargo.hashCode());
		result = prime * result + (classificarRisco ? 1231 : 1237);
		result = prime * result + (controlarAcesso ? 1231 : 1237);
		result = prime * result + (editarProjetos ? 1231 : 1237);
		result = prime * result + (excluirProjetos ? 1231 : 1237);
		result = prime * result + (gerarRelatorios ? 1231 : 1237);
		result = prime * result + (incluirFase ? 1231 : 1237);
		result = prime * result + (incluirProjetos ? 1231 : 1237);
		result = prime * result + (manterAtividade ? 1231 : 1237);
		result = prime * result + (manterColaborador ? 1231 : 1237);
		result = prime * result + (manterEquipe ? 1231 : 1237);
		result = prime * result + (manterStatus ? 1231 : 1237);
		result = prime * result + (visualizarProjetos ? 1231 : 1237);
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
		Acesso other = (Acesso) obj;
		if (associarIndicador != other.associarIndicador)
			return false;
		if (cadastrarIndicador != other.cadastrarIndicador)
			return false;
		if (cargo == null) {
			if (other.cargo != null)
				return false;
		} else if (!cargo.equals(other.cargo))
			return false;
		if (classificarRisco != other.classificarRisco)
			return false;
		if (controlarAcesso != other.controlarAcesso)
			return false;
		if (editarProjetos != other.editarProjetos)
			return false;
		if (excluirProjetos != other.excluirProjetos)
			return false;
		if (gerarRelatorios != other.gerarRelatorios)
			return false;
		if (incluirFase != other.incluirFase)
			return false;
		if (incluirProjetos != other.incluirProjetos)
			return false;
		if (manterAtividade != other.manterAtividade)
			return false;
		if (manterColaborador != other.manterColaborador)
			return false;
		if (manterEquipe != other.manterEquipe)
			return false;
		if (manterStatus != other.manterStatus)
			return false;
		if (visualizarProjetos != other.visualizarProjetos)
			return false;
		return true;
	}
	
}
