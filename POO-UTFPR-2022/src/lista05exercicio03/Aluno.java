package lista05exercicio03;

public class Aluno {
	private String nome;
	private int ra;
	private double[] nota = new double[4];
	
	
	public Aluno(String nome, int ra, double[] nota) {
		super();
		this.nome = nome;
		this.ra = ra;
		this.nota = nota;
	}
	
	
	public void calcularMedia() {
		double notas = 0;
		for(int i=0; i<4; i++) {
			notas += this.nota[i];
		}
		System.out.println("a media : " + nome + notas);
	}
	
	public void calcularMediaTurma() {
		double notas = 0;
		for(int i=0; i<4; i++) {
			notas += this.nota[i];
		}
		double notasTurma;
		notasTurma = notas/4;
		System.out.println("a media da turma: " + nome + notasTurma);
		
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getRa() {
		return ra;
	}


	public void setRa(int ra) {
		this.ra = ra;
	}


	public double[] getNota() {
		return nota;
	}


	public void setNota(double[] nota) {
		this.nota = nota;
	}
	
	
	
	
}
