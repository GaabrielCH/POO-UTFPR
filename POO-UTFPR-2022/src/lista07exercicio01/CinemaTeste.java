package lista07exercicio01;

public class CinemaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cinema cinema = new Cinema();
		//Sessao sessao1 = new Sessao();
		
		cinema.adicionarSessao(23032003, 2303, 13579, 20, "matrix", 130);
		cinema.venderIngresso(10, 23032003, 2303);
		cinema.venderIngresso(25, 23032003, 2303);
	}

}
