package lista07exercicio03;

public enum Titulacao {
	MESTRE(1, 1000),
	DOUTOR(2, 2000);
	
	private int num,valor;

	private Titulacao(int num, int valor) {
		this.num = num;
		this.valor = valor;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
}
