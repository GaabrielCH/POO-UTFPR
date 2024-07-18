package lista06exercicio03;

public class IngressoVip extends Ingresso{
	protected double valorAdicional;
	protected String localizacao;
	
	public IngressoVip(double valor, String tipoIngresso, double valorAdicional, String localizacao) {
		super(valor, tipoIngresso);
		this.valorAdicional = valorAdicional;
		this.localizacao = localizacao;
	}
	
	public double calcularValorIngressoVip() {
		return valorAdicional + valor;
	}
	
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("valor adicional : " + valorAdicional + "localizacao : " + localizacao + "valor do ingresso vip : " + calcularValorIngressoVip());
	}
	
	
	
	
	
}
