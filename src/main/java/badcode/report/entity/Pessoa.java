package badcode.report.entity;

public class Pessoa {
	
	private String nome;
	private String cpf;
	private String telefoneCelular;
	private String telefoneFixo;
	
	public Pessoa(String nome, String cpf, String telefoneCelular, String telefoneFixo) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefoneCelular = telefoneCelular;
		this.telefoneFixo = telefoneFixo;
	}

	public Pessoa() {	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String name) {
		this.nome = name;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefoneCelular() {
		return telefoneCelular;
	}

	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}

	public String getTelefoneFixo() {
		return telefoneFixo;
	}

	public void setTelefoneFixo(String telefoneFixo) {
		this.telefoneFixo = telefoneFixo;
	}
}