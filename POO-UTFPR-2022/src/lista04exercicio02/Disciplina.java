package lista04exercicio02;

public class Disciplina {
	private String nome, modalidade;
	private int codigo, cargaHoraria;
	private Professor professor;
	
	
	

	public Disciplina(String nome, String modalidade, int codigo, int cargaHoraria, Professor professor) {
		super();
		this.nome = nome;
		this.modalidade = modalidade;
		this.codigo = codigo;
		this.cargaHoraria = cargaHoraria;
		this.professor = professor;
	}



	public void emitirDados() {
		System.out.println("dados : " + nome + modalidade + codigo + cargaHoraria);
	}




	@Override
	public String toString() {
		return "Disciplina [nome=" + nome + ", modalidade=" + modalidade + ", codigo=" + codigo + ", cargaHoraria="
				+ cargaHoraria + "]";
	}




	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public String getModalidade() {
		return modalidade;
	}




	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}




	public int getCodigo() {
		return codigo;
	}




	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}




	public int getCargaHoraria() {
		return cargaHoraria;
	}




	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	
	
	
}
