package org.serratec;

import java.util.concurrent.ForkJoinPool;

public class ExemploVarArgs {

	public static void main(String[] args) {
		int total = somar(10, 20, 50, 100, 120);
		System.out.println("Total: " + total);
	
		int total2 = somar(25, 36, 10, 15);
		System.out.println("Total: " + total2);
	}
	//a diferença de um vetro é limitado ao espaço que é declarado
	//VarArgs cria um vetor internamente,
	public static int somar(int... numeros) {		
	int soma = 0;
	
	for (int i : numeros) {
		soma += i;
	}
	return soma;
	}
	
	//nesta chamada, o primeiro parametro vai pegar o primeiro numero informado 
	//e o restante entra para o VarArgs
	public static int somar2(int numero, int... numeros) {		
	int soma = 0;
	
	for (int i : numeros) {
		soma += i;
	}
	return soma * numero;
}
}

