package lista04exercicio01;

public class Endereco {
	private String logradouro, bairro, cidade, uniFederativa;
	private int numero;
	private Funcionario funcionario;
	
	public Endereco(String logradouro, String bairro, String cidade, String uniFederativa, int numero,
			Funcionario funcionario) {
		super();
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uniFederativa = uniFederativa;
		this.numero = numero;
		this.funcionario = funcionario;
	}
	
	public void emitirDados() {
		System.out.println("dados : " + logradouro + bairro + cidade + uniFederativa + numero);
	}

	@Override
	public String toString() {
		return "Endereco [logradouro=" + logradouro + ", bairro=" + bairro + ", cidade=" + cidade + ", uniFederativa="
				+ uniFederativa + ", numero=" + numero + ", funcionario=" + funcionario + "]";
	}
	
	
	
	
	
	
	
}
