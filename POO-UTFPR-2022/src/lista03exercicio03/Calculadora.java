package lista03exercicio03;

public class Calculadora {
	private String modelo, marca, tipo;
	private int memoria;
	
	public Calculadora(String modelo, String marca, String tipo, int memoria) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.tipo = tipo;
		this.memoria = memoria;
	}
	
	public void somar(int a, int b) {
		int x;
		x = a+b;
		System.out.println("resultado : " + x);
	}
	public void subtrair(int a, int b) {
		int x;
		x = a-b;
		System.out.println("resultado : " + x);
	}
	public void multiplicar(int a, int b) {
		int x;
		x = a*b;
		System.out.println("resultado : " + x);
	}
	public void dividir(int a, int b) {
		int x;
		x = a/b;
		System.out.println("resultado : " + x);
	}
	
	
}
