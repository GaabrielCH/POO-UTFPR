package lista04exercicio05;

public class EventoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Endereco end1 = new Endereco("pr", "32254", "st", "pg", "mg");
		Local local1 = new Local("jacare", 100, end1);
		Artista artista1 = new Artista("jair", "brasileiro", "advogado");
		Evento evento1 = new Evento("jacare mix", "23/11/2014", "+18", 100, artista1, local1);
		
		evento1.vendaIngresso(200);
	}

}
