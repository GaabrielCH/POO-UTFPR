package lista07exercicio03;

public class Processo {
	private String nome, dataCriacao, descricao;

	public Processo(String nome, String dataCriacao, String descricao) {
		super();
		this.nome = nome;
		this.dataCriacao = dataCriacao;
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(String dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Processo [nome=" + nome + ", dataCriacao=" + dataCriacao + ", descricao=" + descricao + "]";
	}
	
	
	
}
