package lista04exercicio05;

public class Artista {
	private String nome, nacionalidade, biografia;

	public Artista(String nome, String nacionalidade, String biografia) {
		super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.biografia = biografia;
	}

	@Override
	public String toString() {
		return "Artista [nome=" + nome + ", nacionalidade=" + nacionalidade + ", biografia=" + biografia + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getBiografia() {
		return biografia;
	}

	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}
	
	
	
	
	
	
}
