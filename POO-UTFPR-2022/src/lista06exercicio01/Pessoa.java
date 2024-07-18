package lista06exercicio01;

public class Pessoa {
	protected String nascimento, nome;
	protected long rg, cpf;
	
	public Pessoa(String nascimento, String nome, long rg, long cpf) {
		super();
		this.nascimento = nascimento;
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
	}
	
	
	public void imprimirDados() {
		System.out.println("dados : " + nascimento + " | " + nome + " | " + rg + " | " + cpf);
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getRg() {
		return rg;
	}

	public void setRg(long rg) {
		this.rg = rg;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Pessoa [nascimento=" + nascimento + ", nome=" + nome + ", rg=" + rg + ", cpf=" + cpf + "]";
	}
	
	
	
	
}
