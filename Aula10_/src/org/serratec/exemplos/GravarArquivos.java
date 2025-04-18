package org.serratec.exemplos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//alter
public class GravarArquivos {
	public static void main(String[] args) {
		BufferedWriter gravar = null;
		try {
			//fileWriter apontar o caminho do arquivo
			gravar = new BufferedWriter(new FileWriter("/curso/aula.txt"));
			gravar.append("Desespero\n");
			gravar.append("Aula Java");
			gravar.close();
	
		} catch (IOException e) {
			System.out.println("Erro ao gravar arquivo");
			e.printStackTrace();
		}
		
	
	}
}
