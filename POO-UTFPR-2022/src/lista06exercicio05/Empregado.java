package lista06exercicio05;

public class Empregado extends Funcionario{
	private int carteira;

	public Empregado(String nome, String endereco, String data, String funcao, double salario, int carteira) {
		super(nome, endereco, data, funcao, salario);
		this.carteira = carteira;
	}

	public int getCarteira() {
		return carteira;
	}

	public void setCarteira(int carteira) {
		this.carteira = carteira;
	}

	@Override
	public String toString() {
		return "Empregado [carteira=" + carteira + "]";
	}
	
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("\ndados : " + carteira);
	}
}
