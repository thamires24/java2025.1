package org.serratec;

public class TesteGenerico {
	public static void main(String[] args) {
		Generico<Integer> numero = new Generico<Integer>(400);
		Generico<String> texto = new Generico<String>("Aula");
		
		
	System.out.println(numero.getValor());
	System.out.println(texto.getValor());
	}
}
