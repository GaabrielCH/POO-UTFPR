package lista06exercicio02;

public class ImovelVelho extends Imovel{
	private int desconto;

	public ImovelVelho(int endereco, int valorBase, int desconto) {
		super(endereco, valorBase);
		this.desconto = desconto;
	}
	
	public void imprimirDados() {
		System.out.println("dados : " + endereco + " | " + valorBase + " | " + desconto);
	}

	public int getDesconto() {
		return desconto;
	}

	public void setDesconto(int desconto) {
		this.desconto = desconto;
	}

	@Override
	public String toString() {
		return "ImovelVelho [desconto=" + desconto + "]";
	}
	
	
}
