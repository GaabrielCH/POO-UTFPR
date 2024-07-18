package lista02exercicio04;

public class Biblioteca {
	String titulo, autor, editora, numPag, anoPubli;
	boolean situacao;
	
	public Biblioteca(String titulo, String autor, String editora, String numPag, String anoPubli, boolean situacao) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.numPag = numPag;
		this.anoPubli = anoPubli;
		this.situacao = situacao;
	}
	public void realizarEmprestimo() {
		if(situacao == false) {
			System.out.println(titulo + "esta indisponivel \n");
		}
		else {
			System.out.println(titulo + "emprestimo realizado com sucesso \n");
			situacao = false;
		}
		
	}
	public void realizarDevolucao() {
		if(situacao == true) {
			System.out.println(titulo + "esta indisponivel \n");
		}
		else {
			System.out.println(titulo + "devolucao realizada com sucesso \n");
			situacao = true;
		}
	}
	public void imprimirDados() {
		System.out.println("dados : \n" + titulo + autor + editora + numPag + anoPubli + situacao);
	}
	@Override
	public String toString() {
		return "Biblioteca [titulo=" + titulo + ", autor=" + autor + ", editora=" + editora + ", numPag=" + numPag
				+ ", anoPubli=" + anoPubli + ", situacao=" + situacao + "]";
	}
	
}
