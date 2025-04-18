package org.serratec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RevisaoLista {

	public static void main(String[] args) {
	List<String> cores = new ArrayList<>();
	cores.add("Branco");
	
	//Imutável, não pode adicionar novos elementtos	
	List<Integer> numeros = Arrays.asList(10, 20, 30, 40);
		
	//Não pode ser adicionado nem permite atualizações
	List<String> times = List.of("Flamengo", "Vasco", "Botafogo", "Fluminense");		
			
}
}
