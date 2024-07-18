package lista05exercicio04;

public class EstacionamentoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estacionamento est1 = new Estacionamento();
		est1.adicionarVaga(111);
		
		est1.registrarCarro(111, "242425", 10);
		
		est1.removerCarro(111, 230);
	}

}
