package unidade04;

import java.util.Locale;
import java.util.Scanner;

public class TesteConta {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.println("Digite Número da Conta: ");
		String num = sc.next();
		System.out.println("Digite Nome cliente: ");
		String nome = sc.next();
		System.out.println("Depósito inicial? s/n ");
		char resposta = sc.next().charAt(0);
		
		
		if (resposta == 's') {
			System.out.println("Digite o valo do depósito: ");
			Double depInicial = sc.nextDouble();
			conta = new Conta(resposta, nome, depInicial);
		} else {
			conta = new Conta(resposta, nome);
		}
		
		System.out.println();
		System.out.println("Conta: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.println("Digite o valor do depósito: ");
		Double deposito = sc.nextDouble();
		conta.depositar(deposito);

		System.out.println("Dados Atualizados:");
		System.out.println();
		System.out.println(conta);
		
		
		System.out.println();
		System.out.println("Digite o valor do saque: ");
		Double saque = sc.nextDouble();
		conta.sacar(saque);
		System.out.println("Daddos Atualizados: ");
		System.out.println(conta);
		
		sc.close();
	}

}
