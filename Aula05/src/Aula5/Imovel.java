package Aula5;

public abstract class Imovel {
	protected String local;
	protected Double valor;
	protected Proprietario proprietario;
	
	
	public Imovel(String local, Double valor, Proprietario proprietario) {
		super();
		this.local = local;
		this.valor = valor;
		this.proprietario = proprietario;
		
	}
	

	@Override
	public String toString() {
		return "Imovel [local=" + local + ", valor=" + valor + ", proprietario=" + proprietario + "]";
	}




	public String getLocal() {
		return local;
	}

	public Double getValor() {
		return valor;
	}

	public Proprietario getProprietario() {
		return proprietario;
	}
	
	public Double calcularITBI() {
		return this.getValor() * 3.5 / 100;
		
	}
	
}
