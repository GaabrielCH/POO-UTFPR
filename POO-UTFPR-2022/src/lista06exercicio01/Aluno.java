package lista06exercicio01;

public class Aluno extends Pessoa{
	private int numMatricula;

	public Aluno(String nascimento, String nome, long rg, long cpf, int numMatricula) {
		super(nascimento, nome, rg, cpf);
		this.numMatricula = numMatricula;
	}
	
	public void imprimirDados() {
		System.out.println("dados : " + nascimento + " | " + nome + " | " + rg + " | " + cpf + " | " + numMatricula);
	}

	public int getNumMatricula() {
		return numMatricula;
	}

	public void setNumMatricula(int numMatricula) {
		this.numMatricula = numMatricula;
	}

	@Override
	public String toString() {
		return "Aluno [numMatricula=" + numMatricula + "]";
	}
	
}
