package lista07exercicio04;

import java.util.List;
import java.util.ArrayList;

public class Locadora {
	private List<Cliente> clientes;
	private List<Filme> filmes;
	
	public Locadora() {
		super();
		this.clientes = new ArrayList<Cliente>();
		this.filmes = new ArrayList<Filme>();
	}
	
	public void adicionarFilme(String titulo, String duracao, int preco) {
		Filme filme = new Filme(titulo,duracao,preco);
		filmes.add(filme);
	}
	
	public void adicionarCliente(String nome, String dataNasc, String telefone, Endereco endereco) {
		Cliente cliente = new Cliente(nome, dataNasc, telefone, endereco);
		clientes.add(cliente);
	}
	
	public void alocarFilme(String titulo, String nome, int dia) {
		for(Filme filme : filmes) {
			if(filme.getTitulo().equals(titulo)) {
				filme.alocacaoFilme(null, dia);
				return;
			}
		}
		System.out.println("nao achado");
	}
	
	public void desalocarFilme(String titulo, String nome, int dia) {
		for(Filme filme : filmes) {
			if(filme.getTitulo().equals(titulo)) {
				filme.devolucaoFilme(dia);
				return;
			}
		}
		System.out.println("nao achado");
	}
	
	
	
	
}
