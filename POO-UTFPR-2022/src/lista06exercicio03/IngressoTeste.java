package lista06exercicio03;

public class IngressoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IngressoNormal ing1 = new IngressoNormal(200, "show");
		ing1.imprimirDados();
		IngressoVip ingVip1 = new IngressoVip(500, "show", 300, "Sao-Paulo");
		ingVip1.imprimirDados();
	}	

}
