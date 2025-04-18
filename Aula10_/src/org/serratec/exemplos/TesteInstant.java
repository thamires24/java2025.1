package org.serratec.exemplos;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class TesteInstant {

	public static void main(String[] args) {
		//fuso horário de Londres
		Instant dataHoje = Instant.now();
		System.out.println(dataHoje);
		
		
		//variável local
		Instant dataNova = Instant.parse("2025-04-16T19:00:00Z");
		//Instant pega a data do sistema
		//variavel local
		LocalDateTime data2 = LocalDateTime.ofInstant(dataNova, ZoneId.systemDefault());
		System.out.println(data2);
		
	}

}
