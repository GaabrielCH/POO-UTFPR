package lista05exercicio02;

public class Livro {
	private String titulo;
	private String autor;
	private String editora;
	private int ano;
	private int numPag;
	private boolean disponivel;
	private int diaEmprestimo;
	
	public Livro(String titulo, String autor, String editora, int ano, int numPag) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.ano = ano;
		this.numPag = numPag;
		this.disponivel = true;
		this.diaEmprestimo = 0;
	}
	
	public void verificarDisponivel() {
		if(disponivel == true) {
			System.out.println("livro esta disponivel");
		}
		else {
			System.out.println("livro nao esta disponivel");
		}
	}
	
	public void efetuarEmprestimo(int dia) {
		if(disponivel == true) {
			this.diaEmprestimo = dia;
			
			this.disponivel = false;
			
			System.out.println("livro emprestado" + dia + titulo);
		}
		else {
			System.out.println("livro nao disponivel" + dia + titulo);
		}
	}
	
	public void efetuarDevolucao(int dia) {
		if(disponivel == false) {
			
			this.disponivel = true;
			double valorMulta;
			valorMulta = (dia - diaEmprestimo)*1.5;
			if(valorMulta > 7) {
				System.out.println("valor da multa : " + valorMulta + titulo); 
			}
			else {
				System.out.println("livro nao passou do prazo : " + titulo);
			}
		}
	}

	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", editora=" + editora + ", ano=" + ano + ", numPag="
				+ numPag + ", disponivel=" + disponivel + ", diaEmprestimo=" + diaEmprestimo + "]";
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getNumPag() {
		return numPag;
	}

	public void setNumPag(int numPag) {
		this.numPag = numPag;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	public int getDiaEmprestimo() {
		return diaEmprestimo;
	}

	public void setDiaEmprestimo(int diaEmprestimo) {
		this.diaEmprestimo = diaEmprestimo;
	}

	
	
	
	
}
