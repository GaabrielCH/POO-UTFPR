package lista05exercicio04;

import java.util.List;
import java.util.ArrayList;


public class Estacionamento {
	private List<Vaga> vagas;
	
	public void adicionarVaga(int numVaga) {
		Vaga vaga = new Vaga(numVaga);
		vagas.add(vaga);
	}

	public Estacionamento() {
		super();
		this.vagas = new ArrayList<Vaga>();
	}
	
	public void registrarCarro(int numVaga, String placa, int horaInicial) {
		for(Vaga vaga : vagas) {
			if(vaga.getNumVaga() == numVaga) {
				vaga.registrarCarro(placa, horaInicial);
				return;
			}
		}
		System.out.println("nao acahaod");
	}
	
	public void removerCarro(int numVaga, int horaFinal) {
		for(Vaga vaga : vagas) {
			if(vaga.getNumVaga() == numVaga) {
				vaga.removerCarro(horaFinal);
				return;
			}
		}
	}
	
	
	
	
}
