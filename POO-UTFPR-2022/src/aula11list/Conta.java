package aula11list;

public class Conta {
	private Integer numConta;
	private double saldo;
	private String nome;
	private Integer senha;
	private Cliente cliente;
	
	public Conta(int numConta, String nome, int senha) {
		super();
		this.numConta = numConta;
		this.nome = nome;
		this.senha = senha;
		this.saldo = 0;
	}
	
	public void verificarSaldo() {
		System.out.println("dados da conta : " + numConta  + saldo  + nome);
	}
	
	public void realizarSaque(double valorSaque) {
		if(valorSaque > this.saldo) {
			System.out.println("deu merda");
		}
		else {
			this.saldo -= valorSaque;
			System.out.println("saque bem ocorrido : " + saldo);
		}
	}
	
	public void realizarDeposito(double valorDeposito) {
		this.saldo += valorDeposito;
		System.out.println("deposito bem ocorrido : " + saldo);
	}

	@Override
	public String toString() {
		return "Conta [numConta=" + numConta + ", saldo=" + saldo + ", nome=" + nome + "]";
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
	
}
