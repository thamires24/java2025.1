package org.serratec.exemplos;

public class Empregado {
	private Integer id;
	private String nome;
	private String cargo;
	private Double salario;
	
	
	

	public Empregado(Integer id, String nome, String cargo, Double salario) {
		super();
		this.id = id;
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empregado [nome=" + nome + ", cargo=" + cargo + ", salario=" + salario + "]";
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCargo() {
		return cargo;
	}
	
	public Double getSalario() {
		return salario;
	}

	public Integer getId() {
		return id;
	}

	

}
