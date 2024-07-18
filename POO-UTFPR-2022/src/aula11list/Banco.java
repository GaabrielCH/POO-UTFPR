package aula11list;

import java.util.List;
import java.util.ArrayList;


public class Banco {
	private int cnpj;
	private String nomeBanco;
	private List<Conta> contas;
	private boolean valido;
	
	public Banco(int cnpj, String nomeBanco) {
		super();
		this.cnpj = cnpj;
		this.nomeBanco = nomeBanco;
		this.contas = new ArrayList<Conta>();
	}
	
	public void adicionarConta(int numConta, String nome, int senha) {
		Conta conta1 = new Conta(numConta, nome, senha);
		this.contas.add(conta1);
	}
	
	public void verificarSaldoConta(int numConta, int senha) {
		for(Conta conta1 : contas) {
			if(conta1.getNumConta() == numConta && conta1.getSenha() == senha) {
				conta1.verificarSaldo();
				break;
			}
			else if(conta1.getNumConta() != numConta) {
				System.out.println("conta nao é sua");
				break;
			}
			else if(conta1.getSenha() != senha) {
				System.out.println("conta nao é sua");
				break;
			}
		}
	}
	
	public void realizarSaqueConta(int numConta, double saldo, int senha) {
		for(Conta conta1 : contas) {
			if(conta1.getNumConta() == numConta && conta1.getSenha() == senha) {
				conta1.realizarSaque(saldo);
				break;
			}
			else if(conta1.getNumConta() != numConta) {
				System.out.println("conta nao é sua");
				break;
			}
			else if(conta1.getSenha() != senha) {
				System.out.println("conta nao é sua");
				break;
			}
		}
	}
	
	public void realizarDepositoConta(int numConta, double saldo) {
		for(Conta conta1 : contas) {
			if(conta1.getNumConta() == numConta) {
				conta1.realizarDeposito(saldo);
				break;
			}
		}
	}

	@Override
	public String toString() {
		return "Banco [cnpj=" + cnpj + ", nomeBanco=" + nomeBanco + ", contas=" + contas + "]";
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public String getNomeBanco() {
		return nomeBanco;
	}

	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
	
	
	
}
