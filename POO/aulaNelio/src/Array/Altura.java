package Array;

import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class Altura {
	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	double[] vetor = new double[n];
	
	//para percorrer e preencher o vetro, necessário usar o FOR
	for (int i = 0; i < n; i++) {
        vetor[i] = sc.nextDouble();
    }
	
	Double soma = 0.0;
	for (int i = 0; i < vetor.length; i++) {
		soma += vetor[i];
	}
	double media = soma / n;
	System.out.printf("A média de altura é: %.2f%n", media);
	
	
	sc.close();
	}
}
	
