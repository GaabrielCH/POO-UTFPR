package lista06exercicio02;

public class Imovel {
	protected int endereco, valorBase;

	public Imovel(int endereco, int valorBase) {
		super();
		this.endereco = endereco;
		this.valorBase = valorBase;
	}
	
	public void imprimirDados() {
		System.out.println("dados : " + endereco + " | " + valorBase);
	}

	public int getEndereco() {
		return endereco;
	}

	public void setEndereco(int endereco) {
		this.endereco = endereco;
	}

	public int getValorBase() {
		return valorBase;
	}

	public void setValorBase(int valorBase) {
		this.valorBase = valorBase;
	}

	@Override
	public String toString() {
		return "Imovel [endereco=" + endereco + ", valorBase=" + valorBase + "]";
	}
	
	
}
