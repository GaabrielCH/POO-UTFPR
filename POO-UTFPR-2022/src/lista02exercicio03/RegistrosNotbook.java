package lista02exercicio03;

public class RegistrosNotbook {
	String marca, modelo, polegadas, modeloProcessador, quantMemória, capArmazenamento;
	
	boolean ligar = false;
	
	public RegistrosNotbook(String marca, String modelo, String polegadas, String modeloProcessador,
			String quantMemória, String capArmazenamento) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.polegadas = polegadas;
		this.modeloProcessador = modeloProcessador;
		this.quantMemória = quantMemória;
		this.capArmazenamento = capArmazenamento;
	}
	
	
	public void ligar() {
		ligar = true;
		System.out.println("esta ligando \n" + modelo + marca);
	}
	public void desligar() {
		ligar = false;
		System.out.println("esta desligando \n" + modelo + marca);
	}
	public void processarInformacoes() {
		System.out.println("esta processando informações \n" + modelo + marca);
	}
	public void conectarInternet() {
		System.out.println("esta se conectando-se a internet \n" + modelo + marca);
	}


	@Override
	public String toString() {
		return "RegistrosNotbook [marca=" + marca + ", modelo=" + modelo + ", polegadas=" + polegadas
				+ ", modeloProcessador=" + modeloProcessador + ", quantMemória=" + quantMemória + ", capArmazenamento="
				+ capArmazenamento + ", ligar=" + ligar + "]";
	}
	
	
}
