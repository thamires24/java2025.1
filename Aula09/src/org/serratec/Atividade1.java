package org.serratec;

import java.util.HashMap;
import java.util.Map;

public class Atividade1 {
	public static void main(String[] args) {
		String[][] clientes = {
				{"123", "Marcos", "m@gmail.com"},
				{"456", "Antônia", "a@gmail.com"},
				{"789", "Tiago", "t@gmail.com"}
		};
	
		Map<String, String[]> mapa = new HashMap<>();

		for (int i = 0; i < clientes.length; i++) {
			String id = clientes[i][0];
			String nome = clientes[i][1];
			String email = clientes[i][2];
			mapa.put(id, new String[] {nome, email});
		}
		for (Map.Entry<String, String[]> entry : mapa.entrySet()) {
			String id = entry.getKey();
			String[] dados = entry.getValue();
			
			System.out.println(id + " " + dados[0]+ " " + dados[1]);
		}
		
		
	}
}
