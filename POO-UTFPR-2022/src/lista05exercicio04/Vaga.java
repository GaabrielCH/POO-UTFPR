package lista05exercicio04;

public class Vaga {
	private int numVaga;
	private Veiculo veiculo;
	private int horaInicial;
	
	public Vaga(int numVaga) {
		super();
		this.numVaga = numVaga;
		this.horaInicial = 0;
	}
	
	public void registrarCarro(String placa, int horaInicial) {
		if(veiculo == null) {
			Veiculo veiculo1 = new Veiculo(placa, horaInicial);
			this.horaInicial = horaInicial;
			this.veiculo = veiculo;
			
			System.out.println("vaga registrada" + placa);
		}
		else {
			System.out.println("vaga nao registrada");
		}
	}
	
	public void removerCarro(int horaFinal) {
		double valorMulta = 0;
		if(horaFinal - this.horaInicial <= 3) {
			System.out.println("vaga sem cobranca");
			
		}
		else {
			valorMulta = (horaFinal - horaInicial)*0.5;
			System.out.println("vaga com cobranca: " + valorMulta);
		}
		this.veiculo = null;
	}

	public int getNumVaga() {
		return numVaga;
	}

	public void setNumVaga(int numVaga) {
		this.numVaga = numVaga;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public int getHoraInicial() {
		return horaInicial;
	}

	public void setHoraInicial(int horaInicial) {
		this.horaInicial = horaInicial;
	}
	
	
}
