package lista04exercicio03;

public class Endereco {
	private String logradouro, número, bairro, cidade, estado;

	public Endereco(String logradouro, String número, String bairro, String cidade, String estado) {
		super();
		this.logradouro = logradouro;
		this.número = número;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Endereco [logradouro=" + logradouro + ", número=" + número + ", bairro=" + bairro + ", cidade=" + cidade
				+ ", estado=" + estado + "]";
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNúmero() {
		return número;
	}

	public void setNúmero(String número) {
		this.número = número;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
}
