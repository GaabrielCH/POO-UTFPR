package lista03exercicio04;

public class Banco {
	private String numAgencia, numConta;
	double saldo;

	public Banco(String numAgencia, String numConta, double saldo) {
		super();
		this.numAgencia = numAgencia;
		this.numConta = numConta;
		this.saldo = saldo;
	}
	
	
	public void saquar(double valorSaque) {
		if(saldo > valorSaque) {
			saldo -= valorSaque;
			System.out.println("Saque ocorrido : " + saldo + valorSaque);
		}
		else {
			System.out.println("valor passou do saldo" + valorSaque);
		}
		
	}
	
	public void depositar(double valorDeposito) {
		saldo += valorDeposito;
		System.out.println("deposito : " + saldo + valorDeposito);
	}
	
	public void verificarSaldo() {
		System.out.println("saldo : " + saldo);
	}
	

	
	
	@Override
	public String toString() {
		return "Banco [numAgencia=" + numAgencia + ", numConta=" + numConta + ", saldo=" + saldo + "]";
	}
	
	
}
