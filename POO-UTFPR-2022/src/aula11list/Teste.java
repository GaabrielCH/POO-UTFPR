package aula11list;

import java.util.List;
import java.util.ArrayList;


public class Teste {

	private String nome;
	private int idade;
	private double peso;
	
	public Teste(String nome, int idade, double peso) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Teste [nome=" + nome + ", idade=" + idade + ", peso=" + peso + "]";
	}
	
	
	
	
	

}
