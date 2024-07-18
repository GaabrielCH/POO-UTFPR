package lista07exercicio04;

public class Filme {
	private String titulo, duracao; 
	private int preco;
	private int diaLocacao, diaPrevisto, diaDevolucao;
	private Cliente cliente;
	private int valorTotal, valorMulta;
	private boolean disp;
	
	public Filme(String titulo, String duracao, int preco) {
		super();
		this.titulo = titulo;
		this.duracao = duracao;
		this.preco = preco;
		this.valorTotal = 0;
		this.valorMulta = 2;
		this.disp = true;
	}
	
	
	public void alocacaoFilme(Cliente cliente, int alocacao) {
		if(this.disp == true) {
			this.cliente = cliente;
			this.diaLocacao = alocacao;
			this.preco = valorTotal;
			this.diaPrevisto = alocacao + 3;
			
			System.out.println("emprestimo feito");
			
			//this.disp = false;
		}
		else {
			System.out.println("emprestado nao feito");
			//disp = false;
		}
		this.disp = false;
	}
	
	public void devolucaoFilme(int devolver) {
		if(this.disp == false) {
			this.disp = true;
			
			int total2 = devolver - diaPrevisto;
			valorTotal = (preco + (valorMulta)*total2);
			
			System.out.println("valor foi : " + valorTotal);
			
			this.cliente = null;
			
			disp = true;
			
		}else {
			System.out.println("filme nao emprestado");
			
		}
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getDuracao() {
		return duracao;
	}


	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}


	public int getPreco() {
		return preco;
	}


	public void setPreco(int preco) {
		this.preco = preco;
	}


	public int getDiaLocacao() {
		return diaLocacao;
	}


	public void setDiaLocacao(int diaLocacao) {
		this.diaLocacao = diaLocacao;
	}


	public int getDiaPrevisto() {
		return diaPrevisto;
	}


	public void setDiaPrevisto(int diaPrevisto) {
		this.diaPrevisto = diaPrevisto;
	}


	public int getDiaDevolucao() {
		return diaDevolucao;
	}


	public void setDiaDevolucao(int diaDevolucao) {
		this.diaDevolucao = diaDevolucao;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public int getValorTotal() {
		return valorTotal;
	}


	public void setValorTotal(int valorTotal) {
		this.valorTotal = valorTotal;
	}


	public int getValorMulta() {
		return valorMulta;
	}


	public void setValorMulta(int valorMulta) {
		this.valorMulta = valorMulta;
	}


	public boolean isDisp() {
		return disp;
	}


	public void setDisp(boolean disp) {
		this.disp = disp;
	}
	
	
	
	
}
