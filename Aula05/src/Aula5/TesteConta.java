package Aula5;

public class TesteConta {

	public static void main(String[] args) {
		ContaCorrente cc1 = new ContaCorrente("Amanda", 3500.);
	
		cc1.saque(1500.);
		cc1.deposito(2000.);
		
		

	}

	public TesteConta() {
		super();
		// TODO Auto-generated constructor stub
	}

}
