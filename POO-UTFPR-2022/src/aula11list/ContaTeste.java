package aula11list;

public class ContaTeste {

	public static void main(String[] args) {
		Banco b1 = new Banco(2325453, "Itau SA");
		
		b1.adicionarConta(111, "Joao da silva", 101);
		b1.adicionarConta(222, "mariana da silva", 202);
		
		b1.verificarSaldoConta(111, 101);
		b1.verificarSaldoConta(111, 202);
		
		b1.realizarDepositoConta(111, 1000);
		b1.realizarSaqueConta(111, 400, 101);
		
		b1.verificarSaldoConta(111, 101);
		
	}

}
