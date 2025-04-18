package org.serratec;

public class TesteAtleta {

	public static void main(String[] args) {
		Time time = new Time("Cruzeiro");
		
		Atleta a1 = new Atleta("Marcos", 1.68);
		Atleta a2 = new Atleta("Fábio", 1.82);
		Atleta a3 = new Atleta("Alexandre", 1.75);
		Atleta a4 = new Atleta("Arnaldo", 1.90);
		

		time.adicionarAtleta(a1);
		time.adicionarAtleta(a2);
		time.adicionarAtleta(a3);
		time.adicionarAtleta(a4);
		
		System.out.println(time.getAtletas());
		
	}

}
