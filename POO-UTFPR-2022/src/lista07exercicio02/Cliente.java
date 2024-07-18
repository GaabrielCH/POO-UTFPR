package lista07exercicio02;

public class Cliente {
	private String nome, cpf;
	
	private Conta conta;

	public Cliente(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.conta = new Conta();
	}
	
	
	public void adicionarPratoEntrada(int numero, String nomePrato, String descricao, double preco) {
		this.conta.adicionarPratoEntrada(numero, nomePrato, descricao, preco);
	}
	
	public void adicionarPratoPrincipal(int numero, String nomePrato, String descricao, double preco) {
		this.conta.adicionarPratoPrincipal(numero, nomePrato, descricao, preco);
	}
	
	public void adicionarSobremesa(int numero, String nomePrato, String descricao, double preco) {
		this.conta.adicionarSobremesa(numero, nomePrato, descricao, preco);
	}
	
	public void fecharConta() {
		System.out.println("nome : " + nome + "|" + "cpf : " + cpf);
		conta.toString();
		System.out.println("o total foi : " + conta.calcularTotal());
	}
	
}
