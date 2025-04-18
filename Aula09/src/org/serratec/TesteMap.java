package org.serratec;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TesteMap {
	//LinkedMap Ordena na ordem que foi inserido
	//HashMap imprime de forma aleatoria
	//TreeMap imprime de forma crescente
	
	//chave e valor, no mapa são passados apenas dois
	//valores, é preciso declarar 
		public static void main(String[] args) {
			Map<Aluno, Integer> mapa2 = new TreeMap<>();
			mapa2.put(new Aluno("Vanessa", 45), 1000);
			mapa2.put(new Aluno("Amanda", 36), 2000);
			mapa2.put(new Aluno("Mariana", 42), 3000);
			
			System.out.println(mapa2);
			
			Map<Integer, String> mapa = new HashMap<>();
			mapa.put(1, "Thami");
			mapa.put(2, "Bernardo");
			mapa.put(4, "Bia");
			//em caso de chave valor repetidos, eles imprime 
			//o valor declarado mais recente
			mapa.put(3, "Doia");
			
			//System.out.println(mapa);
			
		}
	
}
