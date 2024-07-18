package lista02exercicio03;

public class RegistrosNotbookTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegistrosNotbook not1 = new RegistrosNotbook("2324254", "2424254", "234425", "422545", "2425", "425252");
		
		not1.ligar();
		not1.processarInformacoes();
		
		System.out.println(not1);
	}

}
