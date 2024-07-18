package aula13interface;

public class Sedex implements Frete {
	
	public double calcularFrete(int distancia) {
		return distancia * 0.45 + 0.15;
	}
}
