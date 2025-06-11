package exercicio3;

import java.util.Scanner;

public class TesteRetangulo {

	public static void main(String[] args) {
		Retangulo ret = new Retangulo();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da base do Retangulo: ");
		ret.b = sc.nextDouble();
		System.out.println("Digite a Altura do Retangulo: ");
		ret.h = sc.nextDouble();
		
		System.out.println("Area: " + ret.area() + ", "
						+ "Perímetro: " + ret.perimetro() + 
						" e a Diagonal: " + ret.diagonal());
		
		
		sc.close();
	}

}
