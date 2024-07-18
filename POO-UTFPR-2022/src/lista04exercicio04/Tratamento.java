package lista04exercicio04;

public class Tratamento {
	private String descricao, dataInicio, dataFinal;
	
	public Tratamento(String descricao, String dataInicio) {
		this.dataInicio = dataInicio;
		this.descricao = descricao;
	}

	public Tratamento(String descricao, String dataInicio, String dataFinal) {
		super();
		this.descricao = descricao;
		this.dataInicio = dataInicio;
		this.dataFinal = dataFinal;
	}

	@Override
	public String toString() {
		return "Tratamento [descricao=" + descricao + ", dataInicio=" + dataInicio + ", dataFinal=" + dataFinal + "]";
	}
	
	
}
