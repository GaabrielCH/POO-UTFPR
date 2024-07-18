package lista02exercicio05;

public class Televisao {
	String marca, polegadas, resolucao;
	int canal, volumeGeral;
	boolean ligar = false;
	
	
	public Televisao(String marca, String polegadas, String resolucao, int canal, int volumeGeral, boolean ligar) {
		super();
		this.marca = marca;
		this.polegadas = polegadas;
		this.resolucao = resolucao;
		this.canal = canal;
		this.volumeGeral = volumeGeral;
		this.ligar = ligar;
	}
	
	
	public void ligar() {
		ligar = true;
		System.out.println("esta ligando \n " + marca);
	}
	public void desligar() {
		ligar = false;
		System.out.println("esta desligando \n " + marca);
	}
	public void alterarCima() {
		if(ligar == true) {
		System.out.println("canal antes : \n" + canal);
		canal++;
		System.out.println("canal : \n" + canal);
		}
	}
	public void alterarBaixo() {
		if(ligar == true) {
		System.out.println("canal antes : \n" + canal);
		canal--;
		System.out.println("canal : \n" + canal);
		}
	}
	public void aumentarVolume() {
		if(ligar == true) {
		System.out.println("volume antes : \n" + volumeGeral);
		volumeGeral++;
		System.out.println("volume : \n" + volumeGeral);
		}
	}
	public void abaixarVolume() {
		if(ligar == true) {
		System.out.println("volume antes : \n" + volumeGeral);
		volumeGeral--;
		System.out.println("volume : \n" + volumeGeral);
		}
	}
	public void imprimirDados() {
		System.out.println("dados : \n" + marca + "\n" + polegadas + "\n" + resolucao + "\n" + canal + "\n" +volumeGeral);
	}
}
