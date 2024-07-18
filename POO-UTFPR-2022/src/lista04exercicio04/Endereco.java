package lista04exercicio04;

public class Endereco {
	private String logradouro, numero, bairro, cidade, estado;

	public Endereco(String logradouro, String numero, String bairro, String cidade, String estado) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Endereco [logradouro=" + logradouro + ", numero=" + numero + ", bairro=" + bairro + ", cidade=" + cidade
				+ ", estado=" + estado + "]";
	}
	
	
	
}
