package Aula7;

import java.time.LocalDate;

public class Cachorro extends Mamifero implements AnimalDomestico {
	private Boolean castrado;

	public Cachorro(String nome, LocalDate dataVacinacao, Boolean castrado) {
		super(nome, dataVacinacao);
		this.castrado = castrado;
	}

	@Override
	public String toString() {
		return "Cachorro [castrado=" + castrado + "]";
	}

	@Override
	public Boolean levarVeterinatio() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean alimentar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void amamentar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String emitirSom() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
