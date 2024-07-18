package prova02;

public class Alugar {
	private int numero, horaInicial, horaFinal;
	private boolean disponivel;
	private double taxaTotal, taxaMinima, taxaMulta, horaTotal;
	
	public Alugar(int numero, int placa) {
		this.numero = numero;
		this.horaFinal = 0;
		this.horaInicial = 0;
		this.disponivel = true;
		this.taxaTotal = 0;
		this.taxaMulta = 0.50;
		this.taxaMinima = 2.00;
		this.horaTotal=0;
	}
	
	
	int verificar;
	public void verificarCarro() {
		this.numero = verificar;
		
		if(this.disponivel == true) {
			System.out.println("carro disponivel");
		}
		else {
			System.out.println("carro nao disponivel");
		}
	}
	
	int numAlocar;
	public void alocarCarro(int horaInicial) {
		this.horaInicial = horaInicial;
		if(this.disponivel == true) {
			verificarCarro();
			this.numero = numAlocar;
			System.out.println("carro alocado ");
			
		}
		else if(numAlocar == numAlocar){
			System.out.println("carro ja alocado");
		}
		this.disponivel = false;
	}
	
	int numDesalocar;
	public void desalocarCarro(int horaFinal) {
		this.horaFinal = horaFinal;
		if(this.disponivel == false){
			verificarCarro();
			this.numero = numDesalocar;
			System.out.println("carro desalocado");
			
			calcularMedia(horaInicial, horaFinal);
		}
		else if(numDesalocar == numDesalocar) {
			System.out.println("carro ja desalocado");
		}
		this.disponivel = true;
	}
	
	public void calcularMedia(int horaInicio, int horaFinal) {
		if(this.horaInicial - this.horaFinal > 3) {
		horaTotal = horaInicio - horaFinal;
		taxaTotal = horaTotal * taxaMulta;
		System.out.println("taxa total : " + taxaTotal);
		}
		else {
			System.out.println("taxa" + this.taxaMinima);
		}
	}
	
}
