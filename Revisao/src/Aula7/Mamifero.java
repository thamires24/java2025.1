package Aula7;

import java.time.LocalDate;


public abstract class Mamifero extends Animal{
	protected String raca;
	
	public Mamifero(String nome, LocalDate dataVacinacao) {
		super(nome, dataVacinacao);
		// TODO Auto-generated constructor stub
	}
	
	public Mamifero(String nome, LocalDate dataVacinacao, String raca) {
		super(nome, dataVacinacao);
		this.raca = raca;
	}

	public abstract void amamentar();
}
