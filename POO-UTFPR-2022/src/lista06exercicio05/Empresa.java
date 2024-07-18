package lista06exercicio05;

public class Empresa extends Prestador{
	private int cnpj;

	public Empresa(String nome, String endereco, String data, double valorHora, String tipoServico, int cnpj) {
		super(nome, endereco, data, valorHora, tipoServico);
		this.cnpj = cnpj;
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "Empresa [cnpj=" + cnpj + "]";
	}
	
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("\ndados : " + cnpj);
	}
}
