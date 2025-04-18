package org.serratec;

public class TesteSorteio {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Anna", 5);
		Aluno aluno2 = new Aluno("Bernardo", 11);
		Aluno aluno3 = new Aluno("Geovane", 40);
		
		Sorteio<Aluno> sortear = new Sorteio<>();
		
		sortear.adicionar(aluno1);
		sortear.adicionar(aluno2);
		sortear.adicionar(aluno3);
		
		System.out.println("Aluno Sorteado: " + sortear.sorteio());
		
		
		Sorteio<Integer> sortearNumeros = new Sorteio<>();
		
		sortearNumeros.adicionarVarios(1, 5, 11, 36, 90, 120);
		
		System.out.println("O número sorteado: " + sortearNumeros.sorteio());
	}

}
