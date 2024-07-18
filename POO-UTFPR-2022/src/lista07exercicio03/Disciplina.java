package lista07exercicio03;

public class Disciplina {
	private int codigo, cargaHoraria;
	private String nome, ementa;
	
	public Disciplina(int codigo, int cargaHoraria, String nome, String ementa) {
		super();
		this.codigo = codigo;
		this.cargaHoraria = cargaHoraria;
		this.nome = nome;
		this.ementa = ementa;
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmenta() {
		return ementa;
	}

	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}

	@Override
	public String toString() {
		return "Disciplina [codigo=" + codigo + ", cargaHoraria=" + cargaHoraria + ", nome=" + nome + ", ementa="
				+ ementa + "]";
	}
	
	
}
