package lista06exercicio05;

public class Funcionario extends Colaborador{
	protected String funcao;
	protected double salario;
	
	public Funcionario(String nome, String endereco, String data, String funcao, double salario) {
		super(nome, endereco, data);
		this.funcao = funcao;
		this.salario = salario;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("\ndados : " + funcao + " | " + salario);
	}

	@Override
	public String toString() {
		return "Funcionario [funcao=" + funcao + ", salario=" + salario + "]";
	}
	
	
	
	
}
