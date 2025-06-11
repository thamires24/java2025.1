package exercicio3;

import java.util.Scanner;

public class TesteAluno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Nome Aluno: ");
		aluno.nome = sc.next();
		System.out.println("Digite as notas do Aluno: ");
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		System.out.printf("Resultado Final: %.2f%n", aluno.somaNota());
	
		if (aluno.somaNota() < 60.0) {
			System.out.println("Reprovado");
			System.out.printf("Faltou %.2f pontos%n", aluno.Reprovacao());
		} else {
			System.out.println("Aprovado!");
		}
		
		sc.close();
	}

}
