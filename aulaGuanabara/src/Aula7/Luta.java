package Aula7;

import java.util.Random;

public class Luta {
	//desafiado vai ser uma instancia de Lutador
	//uma relaçao entre tipo abstrato 
	//e uma instancia de uma determinada classe
	private Lutador desafiado;
	private Lutador desafiante;
	private int rouds;
	private boolean aprovada;

	

	/*public Luta(Lutador desafiado, Lutador desafiante, int rouds, boolean aprovada) {
		this.desafiado = desafiado;
		this.desafiante = desafiante;
		this.rouds = rouds;
		this.aprovada = aprovada;
	}*/

	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRouds() {
		return rouds;
	}

	public void setRouds(int rouds) {
		this.rouds = rouds;
	}

	public boolean isAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
	public void marcarLuta(Lutador l1, Lutador l2) {
		if(l1.getCategoria().contentEquals(l2.getCategoria()) && l1 != l2)   {
				this.aprovada = true;
				this.desafiado = l1;
				this.desafiante = l2;
		} else {
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
		}
		
	}
	
	public void lutar() {
		if(this.aprovada) {
			System.out.println("### DESAFIADO ####");
			this.desafiado.apresentar();
			System.out.println("### DESAFIANTE ###");
			this.desafiante.apresentar();
			
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3);
	
			switch (vencedor) {	
			case 0: //empate
				System.out.println("Empate!");
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
				break;
				
			case 1: //ganhouDesafio 
				System.out.println("Vitória do " + this.desafiado.getNome());
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				break;
				
			case 2: //perdeuLuta
				System.out.println("Vitória do " + this.desafiante.getNome());
				this.desafiado.perderLuta();
				this.desafiante.ganharLuta();
				break;
			}
				
				
		} else {
			System.out.println("A luta não pode acontecer!");
		}
		
	}
	
}

