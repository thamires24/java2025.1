package aulaGuanabara;

public class Aula2 {
	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.cor = "Azul";
		c1.ponta = 0.5f;
		c1.tampar ();
		
		c1.status(); 
		c1.rabiscar();
		
		
		Caneta c2 = new Caneta();
		c2.modelo = "Hostnet";
		c2.cor = "Preta";
		c2.ponta = 0.5f;
		c2.destampar();
		c2.rabiscar();
		c2.status();
		c2.tampar ();
	}

}
