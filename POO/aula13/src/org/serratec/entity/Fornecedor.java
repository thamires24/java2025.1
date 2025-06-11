package org.serratec.entity;

import java.io.Serializable;
// a classe ter um controle para que não seja corrompido
// 
public class Fornecedor implements Serializable {
	/**
	 * Classe apra ciraç~çao de fornecedor
	 * @author Thamires
	 * @since 2025
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * identifica o nome da empresa
	 */
	private String nome;
	private String cnpj;
	
	/**
	 * Construtor cheio
	 * @param nome
	 * @param cnpj
	 */
	public Fornecedor(String nome, String cnpj) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
	}
	
	/**
	 * @author Thamires
	 * @param valor double - valor passado para pagamento
	 * @return
	 * @throws IllegalArgumentException
	 */
	
	public Double calcularPagamento(Double valor) throws IllegalArgumentException{
		return 0.0;
	}

	@Override
	public String toString() {
		return "Fornecedor " + nome + ", CNPJ" + cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
}
