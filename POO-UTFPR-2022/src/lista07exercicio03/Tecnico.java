package lista07exercicio03;

public class Tecnico extends ProfissionalUTFPR{
	
	private Processo processo;
	private int adcNoturno;
	
	public Tecnico(int registro, int salarioBase, String nome, String dataAdmissao, Processo processo, int adcNoturno) {
		super(registro, salarioBase, nome, dataAdmissao);
		this.processo = processo;
		this.adcNoturno = adcNoturno;
	}
	
	public void calcularSalario() {
		int total = salarioBase + adcNoturno;
		System.out.println("salario tecnico utfpr : " + total);
	}

	public Processo getProcesso() {
		return processo;
	}

	public void setProcesso(Processo processo) {
		this.processo = processo;
	}

	public int getAdcNoturno() {
		return adcNoturno;
	}

	public void setAdcNoturno(int adcNoturno) {
		this.adcNoturno = adcNoturno;
	}

	@Override
	public String toString() {
		return "Tecnico [processo=" + processo + ", adcNoturno=" + adcNoturno + "]";
	}
	
	
	
	
	
	
}
