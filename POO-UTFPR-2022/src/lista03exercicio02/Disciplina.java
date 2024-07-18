package lista03exercicio02;

public class Disciplina {
	private String codigo, nome, modalidade, conteudo;
	private int carga;
	
	
	public Disciplina(String codigo, String nome, String modalidade, String conteudo, int carga) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.modalidade = modalidade;
		this.conteudo = conteudo;
		this.carga = carga;
	}



	@Override
	public String toString() {
		return "Disciplina [codigo=" + codigo + ", nome=" + nome + ", modalidade=" + modalidade + ", conteudo="
				+ conteudo + ", carga=" + carga + "]";
	}
	
	
	
	
	
}
