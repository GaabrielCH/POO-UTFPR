package lista07exercicio04;

public class Cliente {
	protected String nome, dataNasc, telefone;
	protected Endereco endereco;
	
	public Cliente(String nome, String dataNasc, String telefone, Endereco endereco) {
		super();
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.telefone = telefone;
		this.endereco = endereco;
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
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", dataNasc=" + dataNasc + ", telefone=" + telefone + ", endereco=" + endereco
				+ "]";
	}
	
	
}	
