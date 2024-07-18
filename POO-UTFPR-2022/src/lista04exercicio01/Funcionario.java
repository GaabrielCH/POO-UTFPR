package lista04exercicio01;

public class Funcionario {
	private int registro;
	private String nome;
	private  String dataNasc;
	private String sexo, setor, telefone;
	
	
	public Funcionario(int registro, String nome, String dataNasc, String sexo, String setor, String telefone) {
		super();
		this.registro = registro;
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.sexo = sexo;
		this.setor = setor;
		this.telefone = telefone;
	}


	public void emitirDados() {
		System.out.println("dados : " + registro + nome + dataNasc + sexo + setor + telefone);
	}


	@Override
	public String toString() {
		return "Funcionario [registro=" + registro + ", nome=" + nome + ", dataNasc=" + dataNasc + ", sexo=" + sexo
				+ ", setor=" + setor + ", telefone=" + telefone + "]";
	}


	public int getRegistro() {
		return registro;
	}


	public void setRegistro(int registro) {
		this.registro = registro;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDataNasc() {
		return dataNasc;
	}


	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public String getSetor() {
		return setor;
	}


	public void setSetor(String setor) {
		this.setor = setor;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
	
	
	
}
