package org.serratec;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TesteSet {

	public static void main(String[] args) {
		//não permite elementso iguais
		//Não mantém ordem
		Set<String> times = new HashSet<>();
		//ordena por inserção
		//Set<String> times = new LinkedHashSet<String>();
		//Ordena os elementos
		//Set<String> times = new TreeSet<>();
		Set<Integer> numeros = new HashSet<>();
		numeros.add(20);
		numeros.add(40);
		numeros.add(60);
		numeros.add(20);
		numeros.add(10);
		System.out.println(numeros);
		
		
		
		times.add("Flamengo");
		times.add("Vasco");
		times.add("Bangu");
		times.add("Fluminense");
		times.add("Botafogo");
		times.add("Flamengo");
		
		for (String time : times) {
			System.out.println(time);
		}

	}

}
