package aula13interface;

public class Pac implements Frete{
	public double calcularFrete(int distancia) {
		return distancia * 0.30 + 0.10;
	}
}
