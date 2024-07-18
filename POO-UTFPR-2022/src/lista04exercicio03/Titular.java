package lista04exercicio03;

public class Titular {
	private String cpf, rg, nome, dataNasc, sexo;
	private int rendaMensal;
	private Endereco endereco;
	
	
	
	public Titular(String cpf, String rg, String nome, String dataNasc, String sexo, int rendaMensal,
			Endereco endereco) {
		super();
		this.cpf = cpf;
		this.rg = rg;
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.sexo = sexo;
		this.rendaMensal = rendaMensal;
		this.endereco = endereco;
	}



	@Override
	public String toString() {
		return "Titular [cpf=" + cpf + ", rg=" + rg + ", nome=" + nome + ", dataNasc=" + dataNasc + ", sexo=" + sexo
				+ ", rendaMensal=" + rendaMensal + ", endereco=" + endereco + "]";
	}



	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public String getRg() {
		return rg;
	}



	public void setRg(String rg) {
		this.rg = rg;
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



	public int getRendaMensal() {
		return rendaMensal;
	}



	public void setRendaMensal(int rendaMensal) {
		this.rendaMensal = rendaMensal;
	}



	public Endereco getEndereco() {
		return endereco;
	}



	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
	
	
	
	
}
