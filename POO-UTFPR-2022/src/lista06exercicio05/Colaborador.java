package lista06exercicio05;

public class Colaborador {
	protected String nome, endereco, data;

	public Colaborador(String nome, String endereco, String data) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.data = data;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	public void imprimirDados() {
		System.out.println("dados : " + nome + " | " + endereco + " | " + data);
	}
}
