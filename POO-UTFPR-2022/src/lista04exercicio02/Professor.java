package lista04exercicio02;

public class Professor {
	private String nome, dataNasc;
	private double salario;
	private int registro;
	
	
	
	public Professor(String nome, String dataNasc, double salario, int registro) {
		super();
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.salario = salario;
		this.registro = registro;
	}


	public void emitirDados() {
		System.out.println("dados : " + nome + dataNasc + salario + registro);
	}


	@Override
	public String toString() {
		return "Professor [nome=" + nome + ", dataNasc=" + dataNasc + ", salario=" + salario + ", registro=" + registro
				+ ", disciplina=" + "]";
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDataNasc() {
		return dataNasc;
	}


	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public int getRegistro() {
		return registro;
	}


	public void setRegistro(int registro) {
		this.registro = registro;
	}

	
	
	
}
