package lista05exercicio04;

public class Veiculo {
	private String placa;
	private int horaInicial;
	
	public Veiculo(String placa, int horaInicial) {
		super();
		this.placa = placa;
		this.horaInicial = horaInicial;
	}

	@Override
	public String toString() {
		return "Veiculo [placa=" + placa + ", horaInicial=" + horaInicial + "]";
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getHoraInicial() {
		return horaInicial;
	}

	public void setHoraInicial(int horaInicial) {
		this.horaInicial = horaInicial;
	}
	
	
	
	
}
