package exercicio3;

import java.util.Scanner;

public class TesteFuncionario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Nome Funcionário: ");
		funcionario.nome = sc.next();
		System.out.println("Digite o Salário Bruto: ");
		funcionario.salarioBruto = sc.nextDouble();
		System.out.println("Digite o valor do desconto: ");
		funcionario.imposto = sc.nextDouble();
		System.out.println();
		System.out.println("Nome: " + funcionario.nome + "\n"
				+ "Salario Líquido: " + funcionario.DescontoSalarial());
		
		System.out.println("Digite a porcentagem do aumento: ");
		Double porcentagem = sc.nextDouble();
		funcionario.AumentoSalarial(porcentagem);
		
		System.out.println("Salário Atualizado: " + funcionario.nome
				+ ", $" + funcionario.salarioBruto);
		sc.close();
	}

}
