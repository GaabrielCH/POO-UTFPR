package lista05exercicio02;

public class BibliotecaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Biblioteca bib1 = new Biblioteca();
		bib1.adicionarLivro("turmamonica", "mauricio de souza", "panini", 1986, 100);
		bib1.adicionarLivro("senhordosaneis", "debrox", "eua", 1945, 200);
		
		bib1.realizarEmprestimoLivro("turmamonica", 5);
		bib1.realizarDevolucaoLivro("turmamonica", 11);
	}

}
