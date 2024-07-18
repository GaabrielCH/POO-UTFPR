package lista07exercicio02;

public class Conta {
	private PratoPrincipal principal;
	private PratoEntrada entrada;
	private Sobremesa sobremesa;
	private double valorConta;
	
	public Conta() {
	}
		
		public void adicionarPratoEntrada(int numero, String nomePrato, String descricao, double preco) {
			this.entrada = new PratoEntrada(numero, nomePrato, descricao, preco);
		}
		
		public void adicionarPratoPrincipal(int numero, String nomePrato, String descricao, double preco) {
			this.principal = new PratoPrincipal(numero, nomePrato, descricao, preco);
		}
		
		public void adicionarSobremesa(int numero, String nomePrato, String descricao, double preco) {
			this.sobremesa = new Sobremesa(numero, nomePrato, descricao, preco);
		}
		
		public double calcularTotal() {
			if(entrada.getPreco() != 0 && principal.getPreco() != 0 && sobremesa.getPreco() != 0) {
			this.valorConta = ((entrada.getPreco() + principal.getPreco() + sobremesa.getPreco()) * 0.1) + entrada.getPreco() + principal.getPreco() + sobremesa.getPreco();
			}
			else {
				System.out.println("nao realizado a compra");
			}
			return this.valorConta;
		}

		@Override
		public String toString() {
			return "Conta [principal=" + principal + ", entrada=" + entrada + ", sobremesa=" + sobremesa
					+ ", valorConta=" + valorConta + "]";
		}

		public PratoPrincipal getPrincipal() {
			return principal;
		}

		public void setPrincipal(PratoPrincipal principal) {
			this.principal = principal;
		}

		public PratoEntrada getEntrada() {
			return entrada;
		}

		public void setEntrada(PratoEntrada entrada) {
			this.entrada = entrada;
		}

		public Sobremesa getSobremesa() {
			return sobremesa;
		}

		public void setSobremesa(Sobremesa sobremesa) {
			this.sobremesa = sobremesa;
		}

		public double getValorConta() {
			return valorConta;
		}

		public void setValorConta(double valorConta) {
			this.valorConta = valorConta;
		}
		

		
}
