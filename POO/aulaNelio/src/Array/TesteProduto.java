package Array;

import java.util.Locale;
import java.util.Scanner;

public class TesteProduto {
	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Produto[] vet = new Produto[n];
		
		
		//este FOR percorre e preenche o vetor
		for (int i = 0; i < vet.length; i++) {
             sc.nextLine();
			String nome = sc.next();
            double preco = sc.nextDouble();
            vet[i] = new Produto(nome, preco);
		}
		
		Double soma = 0.0;
		for (int i = 0; i < vet.length; i++) {
			soma += vet[i].getPreco();
		}
		
		Double media = soma / vet.length;
		System.out.printf("Média de Preço = %.2f%n", media);
		sc.close();
	}
}
