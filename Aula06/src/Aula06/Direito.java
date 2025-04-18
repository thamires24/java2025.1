package Aula06;

public final class Direito extends Faculdade implements Oab, Eventos {
	public Direito(String nome, String nomeFaculdade, int bloco) {
		super(nome, nomeFaculdade, bloco);
		// TODO Auto-generated constructor stub
	}

	private int tempoDuracao;
	
	

	public int getTempoDuracao() {
		return tempoDuracao;
	}

	public void setTempoDuracao(int tempoDuracao) {
		this.tempoDuracao = tempoDuracao;
	}

	@Override
	public String toString() {
		return "Direito [tempoDuracao=" + tempoDuracao + "]";
	}

	@Override
	public String programacao() {
		return null;
	}

	@Override
	public void conteudoEventos() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean realizarProva() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void matrizCurricular() {
		// TODO Auto-generated method stub
		
	}
	
	
}
