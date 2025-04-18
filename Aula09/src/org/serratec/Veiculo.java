package org.serratec;

public class Veiculo {
	protected String marca;
	protected String modelo;
	int ano;
	
	public Veiculo(String marca, String modelo, int ano) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "Veiculo [marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + "]";
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public int getAno() {
		return ano;
	}
	
	
}
