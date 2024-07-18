package lista06exercicio02;

public class TestaImovel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImovelNovo imovelNovo1 = new ImovelNovo(1313242, 2000, 1000);
		
		ImovelVelho imovelVelho1 = new ImovelVelho(2332245, 1500, 500);
		
		imovelNovo1.imprimirDados();
		imovelVelho1.imprimirDados();
	}	

}
