package org.serratec.exemplos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Formatadores
		DateTimeFormatter entrada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter saida = DateTimeFormatter.ofPattern("yyyyMMdd");

		System.out.print("Digite a data (dd/MM/yyyy): ");
		String dataDigitada = scanner.nextLine();

		   try {
	            LocalDate data = LocalDate.parse(dataDigitada, entrada);
	            String dataFormatada = data.format(saida);
	            System.out.println("Data formatada: " + dataFormatada);
	        } catch (Exception e) {
	            System.out.println("Data inválida. Certifique-se de usar o formato dd/MM/yyyy.");
	        }
	        
	        scanner.close();

	}

}
