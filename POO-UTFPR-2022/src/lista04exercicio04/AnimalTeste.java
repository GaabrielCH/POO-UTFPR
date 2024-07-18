package lista04exercicio04;

public class AnimalTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tratamento trat1 = new Tratamento("chiwawa", "32/1/2012", "02/3/2012");
		Endereco end1 = new Endereco("sijadad", "2342", "3242", "24225", "432542");
		Dono dono1 = new Dono("adoadk", "2ok3ds", "324254", "3242254", end1);
		Animal dog1 = new Animal("melu", "2", "machao", dono1, trat1);
		
		dog1.emitirDados();
		System.out.println(trat1);
		System.out.println(end1);
		System.out.println(dono1);
	}

}
