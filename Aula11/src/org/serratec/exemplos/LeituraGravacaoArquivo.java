package org.serratec.exemplos;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeituraGravacaoArquivo {

	public static void main(String[] args) {
	
	try {	
	Scanner sc = new Scanner (System.in);
	System.out.println("Digite o nome do arquivo:");
	
	String nomeArquivo = sc.next();
	FileReader file = new FileReader(nomeArquivo);
	
	Scanner sc2 = new Scanner(file);
	List<Empregado> empregados = new ArrayList<>();
	
	
	while (sc2.hasNext()) {
		String linha = sc2.nextLine();
		if (!linha.isEmpty()) {
			String[] dados = linha.split(";");
			empregados.add(new Empregado(dados[0], dados[1], Double.parseDouble(dados[2])));
			
		}
		
	}
	sc2.close();
	sc.close();
	System.out.println();
	System.out.println("***********Dados Importados do Arquivo*******");
	/*
	 * for (Empregado empregado : empregados) {
		System.out.println(empregado);
	
	}*/
	//solução resumida do código acima
	//-> lâmbida - corpo do FOR
	//antes do corpo é o nome da variável
	empregados.forEach(empregado -> System.out.println(empregado));
	
	//Gravação dos dados da lista em um outro arquivo
	FileWriter fw = new FileWriter("C:/curso/processado.csv");
	PrintWriter pw = new PrintWriter(fw);
	
	for (Empregado emp : empregados) {
		String linha = emp.getNome() + ";" + emp.getCargo() + ";" + emp.getSalario();
		pw.printf(linha);
	}
	pw.close();
	
	} catch (Exception e) {
		System.err.println("Arquivo não encontrado!");
	}

	}

}
