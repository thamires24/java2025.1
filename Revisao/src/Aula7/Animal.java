package Aula7;

import java.time.LocalDate;

//uma classe abstrata não pode ser instanciada, não podemos dar new
//classe abstrata só serve para ser usada como Herança
public abstract class Animal {
	protected String nome;
	protected LocalDate dataVacinacao;
	
		
	public Animal(String nome, LocalDate dataVacinacao) {
		this.nome = nome;
		this.dataVacinacao = dataVacinacao;
	}
	
	@Override
	public String toString() {
		return "Animal [nome=" + nome + ", dataVacinacao=" + dataVacinacao + "]";
	}
	
	public abstract String emitirSom();

	public void amamentar() {
		// TODO Auto-generated method stub
		
	}
	
}
