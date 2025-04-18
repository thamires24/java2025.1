package aulaGuanabara2;

public class Caneta {
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	private boolean tampada;
	
	public void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Uma caneta " + this.cor);
		System.out.println("De ponta " + this.ponta + " com a carga " + this.carga);
		System.out.println("Está tampada? " + this.tampada);
	}
	
	public void rabiscar() {
		if (this.tampada == true) {
			System.out.println("Estou rabiscando!");
		} else {
			System.out.println("Erro! Não posso rabiscar!");
		}
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}

}
