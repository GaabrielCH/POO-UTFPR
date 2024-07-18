package lista06exercicio05;

public class TesteColaborador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Colaborador col1 = new Colaborador("joao da silva", "sp", "24/12/2012");
		col1.imprimirDados();
		Funcionario fun1 = new Funcionario("maria da silva", "pr", "23/11/2002", "administradora", 2000);
		fun1.imprimirDados();
		Prestador prest1 = new Prestador("joao da silva", "rj", "12/10/2008", 20, "gerente");
		prest1.imprimirDados();
		Empregado emp1 = new Empregado("david de matos", "mt", "23/11/2006", "marketeiro", 2500, 23824874);
		emp1.imprimirDados();
		Estagiario est1 = new Estagiario("tais sa", "pm", "23/12/2005", "programadora", 1500, 24879247);
		est1.imprimirDados();
		Empresa empresa1 = new Empresa("plaza1", "deodoro da fonseca", "12/04/2003", 30, "venda", 23092489);
		empresa1.imprimirDados();
		Autonomo aut1 = new Autonomo("luis de souza", "rs", "23/03/2022", 15, "professor", 293828932);
		aut1.imprimirDados();
	}

}
