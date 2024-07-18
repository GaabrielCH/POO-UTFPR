package lista06exercicio05;

public class Prestador extends Colaborador{
	protected double valorHora;
	protected String tipoServico;
	
	public Prestador(String nome, String endereco, String data, double valorHora, String tipoServico) {
		super(nome, endereco, data);
		this.valorHora = valorHora;
		this.tipoServico = tipoServico;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public String getTipoServico() {
		return tipoServico;
	}

	public void setTipoServico(String tipoServico) {
		this.tipoServico = tipoServico;
	}

	@Override
	public String toString() {
		return "Prestador [valorHora=" + valorHora + ", tipoServico=" + tipoServico + "]";
	}
	
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("\ndados : " + valorHora + " | " + tipoServico);
	}
}
