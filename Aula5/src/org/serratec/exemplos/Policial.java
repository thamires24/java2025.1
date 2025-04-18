package org.serratec.exemplos;


//classe declarada como final, não pode ter filhos
public /*final*/ class Policial {
	protected String nome;
	//final no atributo, é uma variável fixa
	//protected final String LOTACAO = "Brasília";
	protected final String LOTACAO;
	
		
	public Policial(String nome, String lOTACAO) {
		super();
		this.nome = nome;
		LOTACAO = lOTACAO;
	}


	

	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getLOTACAO() {
		return LOTACAO;
	}



	//o método com FINAL não pode ser sobrescrito, não pode ser modificado
	public final void imprimir() {
		System.out.println("Dados do Policial: ");
	}
}
