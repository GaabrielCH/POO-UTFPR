package lista04exercicio04;

public class Animal {
	private String nome, idade, sexo;
	private Dono dono;
	private Tratamento tratamento;
	
	
	public Animal(String nome, String idade, String sexo, Dono dono, Tratamento tratamento) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.dono = dono;
		this.tratamento = tratamento;
	}


	@Override
	public String toString() {
		return "Animal [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", dono=" + dono + ", tratamento="
				+ tratamento + "]";
	}
	
	
	public void emitirDados() {
		System.out.println("dados : " + nome + idade + sexo + dono + tratamento);
	}
	
	
	
	
}
