package exercicios;

public class TesteFuncionario {

	public static void main(String[] args) {
		//Variável de instancia
		Funcionario f1 = new Funcionario("Amanda", 5000);
		Funcionario f2 = new Funcionario("Anna", 2890);
		Funcionario f3 = new Funcionario("Jorge", 3200);
		Funcionario f4 = new Funcionario("José", 3500);


		System.out.println(f1.getNome());
		System.out.println(f2.getNome());
		System.out.println(f3.getNome());
		System.out.println(f4.getNome());
		
		System.out.println("Total Geral de Funcionários:" + Funcionario.getContador());
	


	}


}
