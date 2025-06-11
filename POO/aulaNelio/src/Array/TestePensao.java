package Array;

import java.util.Scanner;

public class TestePensao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Pensao[] vet = new Pensao[10];
		
		System.out.println("Quantos quartos você quer ocupar? ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Quarto " + (i) + ": ");
			System.out.println("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.next();
			System.out.println("Quarto");
			Pensao pensao = new Pensao(nome, email);
			int numQuarto = sc.nextInt();
			
			vet[numQuarto] = new Pensao(nome, email);
			
		}
		for (int i = 0; i < vet.length; i++) {
				System.out.println(vet[i]);
			}

		System.out.println("Quartos ocupados: ");
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] != null) {
				System.out.println(i + ":" + vet[i]);
			}
		}
		
		sc.close();

	}

}
