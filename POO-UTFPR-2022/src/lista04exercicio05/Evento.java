package lista04exercicio05;

public class Evento {
	private String nomeEvento, data, classificacao;
	private int ingresso;
	private Artista artista;
	private Local local;
	
	
	
	public Evento(String nomeEvento, String data, String classificacao, int ingresso, Artista artista, Local local) {
		super();
		this.nomeEvento = nomeEvento;
		this.data = data;
		this.classificacao = classificacao;
		this.ingresso = local.getQuantMaxima();
		this.artista = artista;
		this.local = local;
	}




	public void vendaIngresso(int ingressoQuant) {
		if(ingressoQuant < this.ingresso) {
			this.ingresso -= ingressoQuant;
			System.out.println("venda concluida " + ingressoQuant + ingresso);
		}
		else {
			System.out.println("venda nao concluida ");
		}
	}
	
	
}
