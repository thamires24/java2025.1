package Aula7;

public class Lutador {
	private String nome;
	private String nacionalidade;
	private int idade;
	private Double altura;
	private Double peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	
	public Lutador(String nome, String nacionalidade, int idade, Double altura, Double peso, int vitorias, int derrotas, int empates) {
		super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		//this.categoria = categoria;
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
		this.setCategoria(categoria);
		
	}
	protected String getCategoria() {
		if (this.peso < 52.2) {
			this.categoria = "Categoria Inválida";
		} else if (this.peso <= 70.3) {
			this.categoria = "LEVE";
		} else if(this.peso <= 83.9) {
			this.categoria = "MÉDIO";
		} else if (this.peso >= 120.2) {
			this.categoria = "PESADO";
		} else {
			this.categoria = "Categoria Inválida";
		}
		return this.categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
	}
	
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}
	
	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
	
	}
	
	public void apresentar() {
		System.out.println("-----------------------------------");
		System.out.println("Chegou a hora, estamos apresentendo: ");
		System.out.println("Lutador: " + getNome());
		System.out.println("Origem: " + getNacionalidade());
		System.out.println(getIdade() + " anos");
		System.out.println(getAltura() + "m em altura");
		System.out.println("Pesando: " + getPeso());
		System.out.println("Ganhou: " + getVitorias());
		System.out.println("Perdeu: " + getDerrotas());
		System.out.println("Empatou: " + getEmpates());
		}
	
	public void status() {
		System.out.print(getNome());
		System.out.print(" é um peso " + getCategoria() + ", ");
		System.out.print(getVitorias() + " vitórias, ");
		System.out.print(getDerrotas() + " derrotas ");
		System.out.print("e " + getEmpates() + " empates.");
	}
}
