package lista04exercicio04;

public class Dono {
	private String nome, cpf, telefone, email;
	private Endereco endereco;
	
	public Dono(String nome, String cpf, String telefone, String email, Endereco endereco) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
	}
	@Override
	public String toString() {
		return "Dono [nome=" + nome + ", cpf=" + cpf + ", telefone=" + telefone + ", email=" + email + ", endereco="
				+ endereco + "]";
	}
	
	
	
}
