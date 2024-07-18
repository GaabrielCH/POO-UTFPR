package prova02;

public class AlugarTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alugar carro1 = new Alugar(10, 232424);
		
		carro1.alocarCarro(20);
		carro1.desalocarCarro(10);
		carro1.alocarCarro(10);
		carro1.desalocarCarro(5);
	}

}
