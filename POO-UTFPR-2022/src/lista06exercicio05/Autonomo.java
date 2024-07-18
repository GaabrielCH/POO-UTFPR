package lista06exercicio05;

public class Autonomo extends Prestador{
	private long cpf;

	public Autonomo(String nome, String endereco, String data, double valorHora, String tipoServico, long cpf) {
		super(nome, endereco, data, valorHora, tipoServico);
		this.cpf = cpf;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Autonomo [cpf=" + cpf + "]";
	}
	
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("\ndados : " + cpf);
	}
}
