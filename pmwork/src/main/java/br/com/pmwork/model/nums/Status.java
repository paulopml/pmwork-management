package br.com.pmwork.model.nums;

public enum Status {
	EM_AN�LISE("Em an�lise"), AN�LISE_REALIZADA("An�lise realizada"), AN�LISE_APROVADA("An�lise aprovada"),
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