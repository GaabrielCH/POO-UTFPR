package lista07exercicio03;

public class Professor extends ProfissionalUTFPR{
	
	private Titulacao titulacao;
	private Disciplina disciplina;
	
	public Professor(int registro, int salarioBase, String nome, String dataAdmissao, Titulacao titulacao,
			Disciplina disciplina) {
		super(registro, salarioBase, nome, dataAdmissao);
		this.titulacao = titulacao;
		this.disciplina = disciplina;
	}
	
	public void calcularSalario() {
		int total = salarioBase + titulacao.getValor();
		System.out.println("salario do professor utfpr : " + total);
	}

	public Titulacao getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(Titulacao titulacao) {
		this.titulacao = titulacao;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	@Override
	public String toString() {
		return "Professor [titulacao=" + titulacao + ", disciplina=" + disciplina + "]";
	}
	
	
}
