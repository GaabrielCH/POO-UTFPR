package aula13interface;

public class Carrinho {
	private double valorCompra;
	private int distancia;
	private Frete frete;
	
	public Carrinho(double valorCompra, int distancia, Frete frete) {
		super();
		this.valorCompra = valorCompra;
		this.distancia = distancia;
		this.frete = frete;
	}
	
	public double realizarCompra() {
		double valor = this.getFrete().calcularFrete(distancia);
		
		return this.getValorCompra() + valor;
	}

	public double getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}

	public int getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}

	public Frete getFrete() {
		return frete;
	}

	public void setFrete(Frete frete) {
		this.frete = frete;
	}
	
	
	
	
}
