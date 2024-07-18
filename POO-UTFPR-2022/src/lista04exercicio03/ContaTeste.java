package lista04exercicio03;

public class ContaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Endereco end1 = new Endereco("2329", "24342", "2342", "242452", "432245");
		Titular titular1 = new Titular("2324542-93", "3224542-1", "jair", "23/1/3245", "masculino", 23443 ,end1);
		Conta conta1 = new Conta("jair", 2000, titular1);
		
		
		conta1.realizarSaque(1000);
		conta1.realizarDeposito(50000);
		conta1.emissaoDados();
		

	}

}
