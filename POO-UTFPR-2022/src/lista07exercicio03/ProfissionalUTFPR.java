package lista07exercicio03;

public class ProfissionalUTFPR {
	protected int registro, salarioBase;
	protected String nome, dataAdmissao;
	
	public ProfissionalUTFPR(int registro, int salarioBase, String nome, String dataAdmissao) {
		super();
		this.registro = registro;
		this.salarioBase = salarioBase;
		this.nome = nome;
		this.dataAdmissao = dataAdmissao;
	}

	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		this.registro = registro;
	}

	public int getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(int salarioBase) {
		this.salarioBase = salarioBase;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	@Override
	public String toString() {
		return "ProfissionalUTFPR [registro=" + registro + ", salarioBase=" + salarioBase + ", nome=" + nome
				+ ", dataAdmissao=" + dataAdmissao + "]";
	}
	
	
}
