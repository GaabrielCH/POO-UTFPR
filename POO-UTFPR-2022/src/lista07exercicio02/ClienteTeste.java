package lista07exercicio02;

public class ClienteTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta conta1 = new Conta();
		Cliente cliente1 = new Cliente("joao da silva", "232342429");
		
		cliente1.adicionarPratoEntrada(12345, "carne de onça", "carne crua", 20);
		cliente1.adicionarPratoPrincipal(123456, "barriado", "farofa e carne panela", 30);
		cliente1.adicionarSobremesa(4321, "gelatina", "gelatina", 8);
		
		cliente1.fecharConta();
	}

}
