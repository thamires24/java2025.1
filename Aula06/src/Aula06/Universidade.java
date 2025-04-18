package Aula06;

public abstract class Universidade {
	protected String nome;

	public Universidade(String nome) {
		super();
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Universidade [nome=" + nome + "]";
	}

	public String getNome() {
		return nome;
	}
	 public abstract void fazerMatricula();
	
}
