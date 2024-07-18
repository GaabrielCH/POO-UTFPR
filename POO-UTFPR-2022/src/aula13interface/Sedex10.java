package aula13interface;

public class Sedex10 implements Frete{
	
	public double calcularFrete(int distancia) {
		return distancia * 0.48 + 0.16;
	}
}
