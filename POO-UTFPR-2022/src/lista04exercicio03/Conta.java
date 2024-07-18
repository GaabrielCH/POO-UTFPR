package lista04exercicio03;

public class Conta {
	private String nome;
	private int saldo;
	private Titular titular;
	
	
	
	public Conta(String nome, int saldo, Titular titular) {
		super();
		this.nome = nome;
		this.saldo = saldo;
		this.titular = titular;
	}
	

	public void realizarSaque(int valorSaque) {
		if(valorSaque > saldo) {
			System.out.println("saque inproprio" + saldo);
		}
		else {
			valorSaque -= this.saldo;
			System.out.println("saque feito" + saldo);
		}
	}
	
	public void realizarDeposito(int valorDeposito) {
		valorDeposito += this.saldo;
		System.out.println("Deposito feito" + saldo);
	}
	
	public void emissaoDados() {
		System.out.println("dados : " + nome + titular);
	}


	@Override
	public String toString() {
		return "Conta [nome=" + nome + ", saldo=" + saldo + ", titular=" + titular + "]";
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getSaldo() {
		return saldo;
	}


	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}


	public Titular getTitular() {
		return titular;
	}


	public void setTitular(Titular titular) {
		this.titular = titular;
	}
	
	
	
}
