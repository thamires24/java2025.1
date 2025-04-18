package org.serratec.exemplos;

public class Pessoa implements Tributos {
	private String nome;
	private Double rendimentos;
	private EstadoCivil estadoCivil;
	
	
	public Pessoa(String nome, Double rendimentos) {
		super();
		this.nome = nome;
		this.rendimentos = rendimentos;
	}
	
	

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}



	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}



	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", rendimentos=" + rendimentos + "]";
	}



	@Override
	public Double calcularIR() {
		return rendimentos * IRPESSOAFISICA;
	}

	@Override
	public Double calcularICMS() {
		return 0.0;
	}

	public String getNome() {
		return nome;
	}

	public Double getRendimentos() {
		return rendimentos;
	}
	
	
	

}
