package lista05exercicio01;

import java.util.List;
import java.util.ArrayList;


public class Biblioteca {
	private List<Conta> contas;
	
	public void adicionarConta(int numConta, String nome, int cpf) {
		Conta conta = new Conta(numConta, nome, cpf);
		this.contas.add(conta);
	}
	
	public Biblioteca() {
		super();
		this.contas = new ArrayList<Conta>();
	}
	
	public void realizarSaqueConta(int numConta, double saque) {
		for(Conta conta : contas) {
			if(conta.getNumConta() == numConta) {
				conta.realizarSaque(saque);
				return;
			}
		}
		System.out.println("nao achado");
	}
	
	public void realizarDepositoConta(int numConta, double saque) {
		for(Conta conta : contas) {
			if(conta.getNumConta() == numConta) {
				conta.realizarDeposito(saque);
				return;
			}
		}
		System.out.println("nao achado");
	}
	
	public void verificarSaldoConta(int numConta) {
		for(Conta conta : contas) {
			if(conta.getNumConta() == numConta) {
				conta.verificarSaldo();
				return;
			}
		}
		System.out.println("nao achado");
	}

	@Override
	public String toString() {
		return "Biblioteca [contas=" + contas + "]";
	}
	
	
}
