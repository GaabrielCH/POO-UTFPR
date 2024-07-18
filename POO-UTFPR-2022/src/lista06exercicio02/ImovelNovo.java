package lista06exercicio02;

public class ImovelNovo extends Imovel{
	private int valorAdicional;

	public ImovelNovo(int endereco, int valorBase, int valorAdicional) {
		super(endereco, valorBase);
		this.valorAdicional = valorAdicional;
	}
	
	public void imprimirDados() {
		System.out.println("dados : " + endereco + " | " + valorBase + " | " + valorAdicional);
	}

	public int getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(int valorAdicional) {
		this.valorAdicional = valorAdicional;
	}

	@Override
	public String toString() {
		return "ImovelNovo [valorAdicional=" + valorAdicional + "]";
	}
	
	
}
