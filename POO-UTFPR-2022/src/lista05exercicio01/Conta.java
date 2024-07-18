package lista05exercicio01;

public class Conta {
	private int numConta;
	private double saldo;
	private Cliente cliente;
	
	public Conta(int numConta, String nome, int cpf) {
		super();
		this.numConta = numConta;
		this.saldo = 0.00;
		Cliente cliente1 = new Cliente(nome, cpf);
	}
	
	public void verificarSaldo() {
		System.out.println("dados : " + numConta + saldo + cliente);
	}
	
	public void realizarSaque(double saque) {
		if(saque <= saldo) {
			this.saldo -= saque;
			System.out.println("dados do saque: " + saque + saldo);
		}
		else {
			System.out.println("nao realizavel: ");
		}
	}
	
	public void realizarDeposito(double deposito) {
		this.saldo += deposito;
		System.out.println("dados do saque: " + deposito + saldo);
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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Conta [numConta=" + numConta + ", saldo=" + saldo + ", cliente=" + cliente + "]";
	}
	
}
