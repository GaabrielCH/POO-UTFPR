package lista05exercicio02;

import java.util.List;
import java.util.ArrayList;


public class Biblioteca {
	private List<Livro> livros;
	
	public void adicionarLivro(String titulo, String autor, String editora, int ano, int numPag) {
		Livro livro = new Livro(titulo, autor, editora, ano, numPag);
		this.livros.add(livro);
	}

	public Biblioteca() {
		super();
		this.livros = new ArrayList<Livro>();
	}
	
	public void verificarDisponibilidade(String titulo) {
		for(Livro livro : livros) {
			if(livro.getTitulo().equals(titulo)) {
				livro.verificarDisponivel();
				return;
			}
		}
		System.out.println("nao achado");
	}
	
	public void realizarEmprestimoLivro(String titulo, int dia) {
		for(Livro livro : livros) {
			if(livro.getTitulo().equals(titulo)) {
				livro.efetuarEmprestimo(dia);
				return;
			}
		}
		System.out.println("nao achado");
	}
	
	public void realizarDevolucaoLivro(String titulo, int dia) {
		for(Livro livro : livros) {
			if(livro.getTitulo().equals(titulo)) {
				livro.efetuarDevolucao(dia);
				return;
			}
		}
		System.out.println("nao achado");
	}

	@Override
	public String toString() {
		return "Biblioteca [livros=" + livros + "]";
	}
	
	
	
	
}
