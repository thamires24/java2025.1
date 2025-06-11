package exercicio3;

public class Aluno {
	protected String nome;
	protected Double nota1, nota2, nota3;
	
	public Double somaNota() {
		return nota1 + nota2 + nota3;
	}
	
	
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + "]";
	}



	public Double Reprovacao() {
		if (somaNota() < 60.0) {
			return 60.0 - somaNota();
		} else {
			return 0.0;
		}
	}
}
