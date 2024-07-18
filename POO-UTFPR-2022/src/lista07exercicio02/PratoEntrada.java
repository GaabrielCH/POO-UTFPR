package lista07exercicio02;

public class PratoEntrada {
	private int numero;
	private String descricao, nomePrato;
	private double preco;
	
	public PratoEntrada(int numero, String nomePrato, String descricao, double preco) {
		super();
		this.numero = numero;
		this.nomePrato = nomePrato;
		this.descricao = descricao;
		this.preco = preco;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNumPrato() {
		return nomePrato;
	}

	public void setNumPrato(int numPrato) {
		this.nomePrato = nomePrato;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "PratoEntrada [numero=" + numero + ", numPrato=" + nomePrato + ", descricao=" + descricao + ", preco="
				+ preco + "]";
	}
	
	
	
	
}
