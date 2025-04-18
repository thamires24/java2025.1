package revisao;

public class Marca {
	private String nome;

	public Marca(String nome) {
		super();
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Marca " + nome;
	}

	public String getNome() {
		return nome;
	}
	
	
}
