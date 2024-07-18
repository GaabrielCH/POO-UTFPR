package lista02exercicio04;

public class BibliotecaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Biblioteca livro1 = new Biblioteca("2342425", "2425452", "23442552", "242552", "4225452", true);
		
		livro1.realizarEmprestimo();
		livro1.realizarDevolucao();
		livro1.imprimirDados();
		
	}

}
