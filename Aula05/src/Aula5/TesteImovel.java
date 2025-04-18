package Aula5;

public class TesteImovel{


	public static void main(String[] args) {
		Proprietario p1 = new Proprietario("Ana");
		Casa casa1 = new Casa("Centro", 200000., p1, true);
		
	System.out.println("Valor do Itbi: " + casa1.calcularITBI());
	System.out.println(casa1);		

	}

}
