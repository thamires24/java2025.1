package util;

import java.util.Scanner;

public class TesteCalculo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		 
		System.out.println("insira o raio: ");
		Double raio = sc.nextDouble();
		
		//chamar o nome da classe e após o . colocar 
		//o que precisa calcular
		Double c = Calculo.circunferencia(raio);
		Double v = Calculo.volume(raio);
		
		System.out.printf("Circunferencia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Valor de PI: %.2f%n", Calculo.PI);
	
		sc.close();
	}

}
