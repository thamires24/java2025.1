package org.serratec;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TesteAluno {

	public static void main(String[] args) {
		//Set<Aluno> alunos = new HashSet<>();
		Set<Aluno> alunos = new TreeSet<>();
				
		alunos.add(new Aluno("Antônio","a@gmail.com", 45));
		alunos.add(new Aluno("Larissa","l@gmail.com", 23));
		alunos.add(new Aluno("Fábio","f@gmail.com", 65));
		alunos.add(new Aluno("Maria","m@gmail.com", 26));
		alunos.add(new Aluno("Eugênio","e@gmail.com", 35));

		
		for (Aluno a : alunos) {
			System.out.println(a);
		}
	}

}
