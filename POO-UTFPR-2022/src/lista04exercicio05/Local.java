package lista04exercicio05;

public class Local {
	private String nomeLocal;
	private int quantMaxima;
	private Endereco endereco;
	
	
	public Local(String nomeLocal, int quantMaxima, Endereco endereco) {
		super();
		this.nomeLocal = nomeLocal;
		this.quantMaxima = quantMaxima;
		this.endereco = endereco;
	}


	@Override
	public String toString() {
		return "Local [nomeLocal=" + nomeLocal + ", quantMaxima=" + quantMaxima + ", endereco=" + endereco + "]";
	}


	public String getNomeLocal() {
		return nomeLocal;
	}


	public void setNomeLocal(String nomeLocal) {
		this.nomeLocal = nomeLocal;
	}


	public int getQuantMaxima() {
		return quantMaxima;
	}


	public void setQuantMaxima(int quantMaxima) {
		this.quantMaxima = quantMaxima;
	}


	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
	
	
	
	
	
}
