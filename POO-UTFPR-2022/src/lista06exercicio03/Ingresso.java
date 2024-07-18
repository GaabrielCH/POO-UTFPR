package lista06exercicio03;

public class Ingresso {
	protected double valor;
	protected String tipoIngresso;
	
	
	public Ingresso(double valor, String tipoIngresso) {
		super();
		this.valor = valor;
		this.tipoIngresso = tipoIngresso;
	}
	
	
	public void imprimirDados() {
		System.out.println("dados : " + valor + " | " + tipoIngresso);
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public String getTipoIngresso() {
		return tipoIngresso;
	}


	public void setTipoIngresso(String tipoIngresso) {
		this.tipoIngresso = tipoIngresso;
	}


	@Override
	public String toString() {
		return "Ingresso [valor=" + valor + ", tipoIngresso=" + tipoIngresso + "]";
	}
	
	
	
}
