package util;

import java.util.Locale;
import java.util.Scanner;

public class TesteDolar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do Dolar:");
		Double precoDolar = sc.nextDouble();
		System.out.println("Quantos dólares deseja comprar?");
		Double total = sc.nextDouble();
		
		Double resultado = ConverDolar.dolarReal(total, precoDolar);
		System.out.printf("O valor em Reais é: %.2f%n",  resultado);
		
		sc.close();
	}

}
