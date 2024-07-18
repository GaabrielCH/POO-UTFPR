package lista02exercicio05;

public class TelevisaoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Televisao tv1 = new Televisao("eletrobrax", "24", "1024x1024", 10, 20, true);

		//tv1.ligar();
		//tv1.desligar();
		tv1.alterarCima();
		tv1.alterarBaixo();
		tv1.aumentarVolume();
		tv1.abaixarVolume();
		
		tv1.imprimirDados();
	}

}
