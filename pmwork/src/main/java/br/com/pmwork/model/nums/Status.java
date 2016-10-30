package br.com.pmwork.model.nums;

public enum Status {
	EM_ANÁLISE("Em análise"), ANÁLISE_REALIZADA("Análise realizada"), ANÁLISE_APROVADA("Análise aprovada"),
	INICIADO("Iniciado"), PLANEJADO("Planejado"), EM_ANDAMENTO("Em andamento"), ENCERRADO("Encerrado"),
	CANCELADO("Cancelado");
	
	private String statusProj;
	
	Status (final String status){
		this.statusProj = status; 
	}

	public String getStatusProj() {
		return statusProj;
	}
	
	@Override
    public String toString() {
        return this.getStatusProj();
    }
}