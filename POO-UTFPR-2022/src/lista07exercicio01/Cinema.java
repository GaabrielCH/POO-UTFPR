package lista07exercicio01;

import java.util.List;
import java.util.ArrayList;

public class Cinema {
	private List<Sessao> sessoes;

	public Cinema() {
		super();
		this.sessoes = new ArrayList<Sessao>();
	}
	
	public void adicionarSessao(int data, int hora, int numIdent, int capacidadeMax, String titulo, int duracao) {
		Sessao sessao = new Sessao(data, hora, numIdent, capacidadeMax, titulo, duracao);
		this.sessoes.add(sessao);
	}

	public void venderIngresso(int ingressos, int data, int hora) {
		for(Sessao sessao: sessoes ) {
			if(sessao.getData() == data && sessao.getHora() == hora) {
				sessao.venderIngressos(ingressos);
				return;
			}
		}
		System.out.println("Sessao nao encontrada");
	}
	
	public void imprimirRelatorio(int data, int hora) {
		for(Sessao sessao : sessoes) {
			if(sessao.getData() == data && sessao.getHora() == hora) {
				sessao.imprimirRelatorio();
				return;
			}
		}
		System.out.println("Sessao nao encontrada");
	}
	
}
