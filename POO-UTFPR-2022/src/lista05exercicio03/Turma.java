package lista05exercicio03;

import java.util.List;
import java.util.ArrayList;

public class Turma {
	private String nomeTurma;
	private List<Aluno> alunos;
	
	public Turma(String nomeTurma) {
		super();
		this.nomeTurma = nomeTurma;
		this.alunos = new ArrayList<Aluno>();
	}
	
	public void adicionarAluno(String nome, int ra, double nota1, double nota2, double nota3, double nota4) {
		Aluno aluno = new Aluno(nome, ra, new double[]{nota1, nota2, nota3, nota4});
		this.alunos.add(aluno);
	}
	
	public void calcularMediaAluno() {
		for(Aluno aluno : alunos) {
			aluno.calcularMedia();
		}
	}
	
	public void calcularMediaTurma() {
		double somaMedias = 0;
		for(Aluno aluno : alunos) {
			aluno.calcularMediaTurma();
		}
		System.out.println("valor media da turma : " + alunos.size());
	}
	
	
}
