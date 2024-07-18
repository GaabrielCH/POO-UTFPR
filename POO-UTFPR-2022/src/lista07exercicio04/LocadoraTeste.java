package lista07exercicio04;

public class LocadoraTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locadora locadora1 = new Locadora();
		Endereco endereco = new Endereco("123", "123", "233", "3242", "2342", "2324");
		locadora1.adicionarCliente("joao da silva", "23/12/2001", "1234556789", endereco);
		locadora1.adicionarFilme("peter jackson", "1h20", 10);
		
		locadora1.alocarFilme("peter jackson", "joao da silva", 10);
		locadora1.desalocarFilme("peter jackson", "joao da silva", 20);
	}	

}
