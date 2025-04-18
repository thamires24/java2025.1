package exercicios;

public class Pessoa {
	private int id;
	private String nome;
	private double peso, altura;
	
	public void setNome(String nome) {
		this.nome = nome;	
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso >= 0) {
			this.peso = peso;
		}else {
			System.out.println("Você digitou um valor inválido, digite um novo valor");
		}
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	private double calcularIMC() {
		return peso / (altura * altura);
	}
	
	public String resultado() {
		if (calcularIMC() < 18.5) {
			return "Abaixo do Peso Ideal";
		}else if(calcularIMC() <= 24.9) {
			return "Peso Ideal";
			
		}else{
			return "Acima do Peso Ideal";
		}
	}
	
}
