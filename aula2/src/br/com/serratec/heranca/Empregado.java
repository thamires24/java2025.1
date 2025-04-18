package br.com.serratec.heranca;

public class Empregado {
	private String nome;
	private String email;
	private String telefone;
	protected Double salario;

	public Empregado(String nome, String email, String telefone, Double salario) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.salario = salario;
	}

	public Double getSalario() {
		return salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public Double aumentarSalario(Double valor) {
		return this.salario += this.salario * valor/100;
	}

}
