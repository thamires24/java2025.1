package Aula06;

import java.util.Iterator;

public class ControleRemoto implements Controlador {
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	
	public ControleRemoto() {
		super();
		this.volume = 50;
		this.ligado = true;
		this.tocando = false;
	}
	
	@Override
	public String toString() {
		return "ControleRemoto [volume=" + volume + ", ligado=" + ligado + ", tocando=" + tocando + "]";
	}




	public int getVolume() {
		return volume;
	}


	public void setVolume(int volume) {
		this.volume = volume;
	}


	public boolean isLigado() {
		return ligado;
	}


	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}


	public boolean isTocando() {
		return true;
	}


	public void setTocando(boolean tocando) {
		this.tocando = tocando;
	}


	@Override
	public void ligar() {
		this.setLigado(true);	
	}

	@Override
	public void desligar() {
		this.setLigado(false);
	}

	@Override
	public void abrirMenu() {
		System.out.println("--------MENU--------");
		System.out.println("Está Ligado? " + this.isLigado());
		System.out.println("Está Tocando? " + this.isTocando());
		System.out.println("Volume: " + this.getVolume());
		for (int i = 0; i <= this.getVolume(); i+=10) {
			System.out.print(i + "[°]");
		}
			
	}


	@Override
	public void fecharMenu() {
		System.out.println("Fechando Menu!");
		
	}


	@Override
	public void maisVolume() {
		if (this.isLigado()) {
			this.setVolume(this.getVolume() + 5);
		}
		
	}


	@Override
	public void menosVolume() {
		if (this.isLigado()) {
			this.setVolume(this.getVolume() - 5);
			
		}
			
	}


	@Override
	public void ligarMudo() {
		if (this.isLigado() && this.getVolume() > 0){
			this.setVolume(0);
		}
		
	}


	@Override
	public void desligarMudo() {
		if (this.isLigado() && this.getVolume() == 0) {
			this.setVolume(volume);
		}
	}


	@Override
	public void play() {
		if (this.isLigado() && !(this.isTocando())) {
			this.setTocando(true);
		}
		
	}


	@Override
	public void pause() {
		if (this.isLigado() && this.isTocando()) {
			this.setTocando(false);
		}
		
	}
	
	

}
