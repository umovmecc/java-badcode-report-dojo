package cc.code.model;

public class Pessoa {
	
	private static final String FORMATO_SAIDA = "Nome: %s \nFone: %s \nCPF: %s";
	private String nome;
	private String cpf;
	private String telefone;
	
	public Pessoa(String nome, String cpf, String telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
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
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return String.format(FORMATO_SAIDA, nome, telefone, cpf);
	}
}