package lista07exercicio04;

public class Endereco {
	private String logradouro, numResidencia, bairro, cep, cidade, uniFederativa;

	public Endereco(String logradouro, String numResidencia, String bairro, String cep, String cidade,
			String uniFederativa) {
		super();
		this.logradouro = logradouro;
		this.numResidencia = numResidencia;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
		this.uniFederativa = uniFederativa;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumResidencia() {
		return numResidencia;
	}

	public void setNumResidencia(String numResidencia) {
		this.numResidencia = numResidencia;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUniFederativa() {
		return uniFederativa;
	}

	public void setUniFederativa(String uniFederativa) {
		this.uniFederativa = uniFederativa;
	}

	@Override
	public String toString() {
		return "Endereco [logradouro=" + logradouro + ", numResidencia=" + numResidencia + ", bairro=" + bairro
				+ ", cep=" + cep + ", cidade=" + cidade + ", uniFederativa=" + uniFederativa + "]";
	}
	
	
}
