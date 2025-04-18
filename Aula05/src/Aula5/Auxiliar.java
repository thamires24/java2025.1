package Aula5;

public abstract class Auxiliar extends Funcionario {
	protected String categoria;
	
	
	public Auxiliar(String cpf, String nome, Double salario, String categoria) {
		super(cpf, nome, salario);
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Auxiliar [categoria=" + categoria + ", cpf=" + cpf + ", nome=" + nome + ", salario=" + salario + "]";
	}

	public String getCategoria() {
		return categoria;
	}

	//colocar a classe como abstrata permite que não se inclua todos os métodos da classe mãe
	//no modo abstrato não se pode instanciar
	@Override
	public void reajusteSalarial(Double valor) {
		

	}

}
