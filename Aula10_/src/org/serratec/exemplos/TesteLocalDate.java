package org.serratec.exemplos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;



public class TesteLocalDate {

	public static void main(String[] args) {
		LocalDate dataHoje = LocalDate.now();
		LocalDate dataManual = LocalDate.of(2025, 4, 15);
		
		//Inserir o local de como será inserido
		Locale locale = new Locale("pt", "BR");
				
		
		System.out.println(dataManual.minusYears(2));
		//System.out.println(dataManual.getDayOfWeek().getDisplayName(TextStyle.FULL, locale));

		System.out.println(dataHoje.isLeapYear()?"Sim":"Não");
		
		//Imprimir duas horas a mais
		LocalTime hora = LocalTime.now();
		System.out.println(hora.plusHours(2));
	
		LocalDate dataNasc = LocalDate.of(1992, 3, 24);
		//Period estipula um periodo a ser calculado
		Period periodo = Period.between(dataNasc, dataHoje);
		System.out.println("Sua idade é: " + periodo.getYears() 
				+ " anos " + periodo.getMonths()
				+ " meses " + periodo.getDays() + " dias.");
		
		//ChronoUnit retorna calculos entre datas
		System.out.println(ChronoUnit.DAYS.between(dataNasc,dataHoje));
		
		//exibir o fuso horario do sistema operacional
		ZoneId fuso = ZoneId.systemDefault();
		System.out.println(fuso);
		
		//exibe todos os fusos
		for (String s : ZoneId.getAvailableZoneIds()) {
			System.out.println(s);
		}
		
		DateTimeFormatter formatarData = DateTimeFormatter.ofPattern("dd-M-yy");
		System.out.println(dataHoje.format(formatarData));
		
	}

}
