package org.serratec;

//classe genérica aceita qualquer tipo de dados
//que é declarado na hora de instanciar
public class Generico<T> {
	private T valor;

	public Generico(T valor) {
		super();
		this.valor = valor;
	}

	public T getValor() {
		return valor;
	}

	public void setValor(T valor) {
		this.valor = valor;
	}
	
	
}
