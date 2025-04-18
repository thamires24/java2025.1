package exercicios;

public class Produto {
	private int codigo;
	private String descricao;
	private double valor;
	
	//
	
	//Construtor Default - Padrão 
	public Produto() {
		System.out.println("Construtor Inicializado");
		
	}
	
	
	//Construtor cheio - Atributos
	public Produto(int codigo, String descricao, double valor) {
		System.out.println("Construtor Cheio");
		this.codigo = codigo;
		this.descricao = descricao;
		this.valor = valor;
	}



	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
}
