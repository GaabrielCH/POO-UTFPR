package lista05exercicio01;

public class BibliotecaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Biblioteca bib1 = new Biblioteca();
		
		bib1.adicionarConta(111, "joao da silva", 29784924);
		bib1.adicionarConta(222, "mariana da silva", 23924084);
		
		bib1.realizarDepositoConta(111, 1000);
		bib1.realizarDepositoConta(2389, 3928);
		bib1.realizarSaqueConta(111, 300);
	}

}
