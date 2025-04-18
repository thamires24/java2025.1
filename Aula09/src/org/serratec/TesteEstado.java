package org.serratec;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class TesteEstado {
	public static void main(String[] args) {
		
	Map<String, String> estados = new HashMap();
	estados.put("MG", "Minas Gerais");
	estados.put("RJ", "Rio de Janeiro");
	estados.put("SP", "São Paulo");
	
	for (String sigla : estados.keySet()) {
		System.out.println(sigla);
	}
	
	for (String nome : estados.values()) {
		System.out.println(nome);
		
	}
			
	for (Map.Entry<String, String> dados: estados.entrySet()) {
		System.out.println(dados);
		
	}
	}
}