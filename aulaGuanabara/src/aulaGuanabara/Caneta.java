package aulaGuanabara;

public class Caneta {
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	
	void status() {
		System.out.println("Modelo: ");
		System.out.println("Uma caneta " + this.cor);
		System.out.println("De ponta " + this.ponta + " com a carga " + this.carga);
		System.out.println("Está tampada? " + this.tampada);
	}
	
	void rabiscar() {
		if (this.tampada == true) {
			System.out.println("Estou rabiscando!");
		} else {
			System.out.println("Erro! Não posso rabiscar!");
		}
	}
	
	void tampar() {
		this.tampada = true;
	}
	
	void destampar() {
		this.tampada = false;
	}

}
