package aula13interface;

public class Correios implements Frete{
	
	public double calcularFrete(int distancia) {
		return distancia * 0.35 + 0.13;
	}
}
