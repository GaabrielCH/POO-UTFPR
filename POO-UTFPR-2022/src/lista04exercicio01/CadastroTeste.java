package lista04exercicio01;

public class CadastroTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario fun1 = new Funcionario(2342, "23425", "23442", "3424", "4224", "234242");
		Endereco end1 = new Endereco("dada", "23224", "sdsf", "addada", 3114, fun1);
		
		fun1.emitirDados();
		end1.emitirDados();
	}

}
