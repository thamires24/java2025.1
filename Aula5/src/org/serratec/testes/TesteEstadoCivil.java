package org.serratec.testes;

import org.serratec.exemplos.EstadoCivil;
import org.serratec.exemplos.Pessoa;

public class TesteEstadoCivil {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Marcos", 100000.);
		pessoa1.setEstadoCivil(EstadoCivil.DIVORCIADO);
		

		System.out.println(pessoa1.getEstadoCivil().getSigla());
		System.out.println(pessoa1.getEstadoCivil().ordinal());
		
		for (EstadoCivil ec : EstadoCivil.values()) {
			System.out.println(ec);
		}
	}

}
