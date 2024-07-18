package aula13interface;

public class CarrinhoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Correios correio = new Correios();
		
		Carrinho ca1 = new Carrinho(100, 20, correio);
		System.out.println("valor da compra : " + ca1.realizarCompra());
		
		Sedex sedex = new Sedex();
		
		Carrinho ca2 = new Carrinho(200, 30, sedex);
		System.out.println("valor da compra : " + ca2.realizarCompra());
		
	}

}
