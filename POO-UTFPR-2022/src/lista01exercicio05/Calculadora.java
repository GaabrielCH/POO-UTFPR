package lista01exercicio05;

public class Calculadora {
	String marca, modelo, tipo, memInterna;
	boolean ligar = false;
	
	public void efetuarLiga() {
		ligar = true;
	}
	public void efetuarDesliga() {
		ligar = false;
	}
	public void realizarSoma(int valor1, int valor2) {
		int valorTotal;
		valorTotal = valor1 + valor2;
		System.out.println("valor" + valorTotal);
	}
	public void realizarSubtracao() {
		
	}
	public void realizarMulti() {
		
	}
	public void realizarDiv() {
		
	}
	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", modelo=" + modelo + ", tipo=" + tipo + ", memInterna=" + memInterna
				+ ", ligar=" + ligar + "]";
	}
	
	
}
