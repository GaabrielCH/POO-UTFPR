package lista07exercicio04;

public class Socio extends Cliente{
	//private Cliente cliente;
	private String cpf;

	public Socio(String nome, String dataNasc, String telefone, Endereco endereco, String cpf) {
		super(nome, dataNasc, telefone, endereco);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Socio [cpf=" + cpf + "]";
	}
	
	
}
