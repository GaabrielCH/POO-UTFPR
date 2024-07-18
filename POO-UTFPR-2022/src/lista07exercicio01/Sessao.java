package lista07exercicio01;

public class Sessao {
	private int data,hora,numIngresso;
	private Sala sala;
	private Filme filme;
	
	public Sessao(int data, int hora, int numIdent, int capacidadeMax, String titulo, int duracao) {
		super();
		this.data = data;
		this.hora = hora;
		this.numIngresso = capacidadeMax;
		this.sala = new Sala(numIdent, capacidadeMax);
		this.filme = new Filme(titulo, duracao);
	}
	
	public void venderIngressos(int ingresso) {
		try {
		if(ingresso < numIngresso){
			int total = numIngresso - ingresso;
			System.out.println("venda bem sucessida : " + total);
		}
		else {
			System.out.println("sem ingresso suficiente : " + numIngresso);
		}
		}catch(ArithmeticException ae) {
			System.out.println("erro aritmetico ");
		}
	}
	
	public void imprimirRelatorio() {
		System.out.println("dados : " + data + "|" + hora + "|" + sala + "|" + filme + "|" + numIngresso);
	}

	@Override
	public String toString() {
		return "Sessao [data=" + data + ", hora=" + hora + ", numIngresso=" + numIngresso + ", sala=" + sala
				+ ", filme=" + filme + "]";
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getNumIngresso() {
		return numIngresso;
	}

	public void setNumIngresso(int numIngresso) {
		this.numIngresso = numIngresso;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}
	
}
