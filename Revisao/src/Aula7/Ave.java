package Aula7;

import java.time.LocalDate;

public abstract class Ave extends Animal {
	protected String cor;

	public Ave(String nome, LocalDate dataVacinacao, String cor) {
		super(nome, dataVacinacao);
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "Ave [cor=" + cor + "]";
	}
	//toString serve para imprimir um valor 
	
	public abstract String voar();
	
}
