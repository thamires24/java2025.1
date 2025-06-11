package org.serratec.testes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.serratec.entity.Fornecedor;

public class ExemploSerializable {

	//serve para dizer que a classe pode ser manipulada
	public static void main(String[] args) {
		Fornecedor f1 = new Fornecedor("ABC XPTO", "123");
		Fornecedor f2 = new Fornecedor("XYZ LTDA", "321");
	
		List<Fornecedor> fornecedores = new ArrayList<>();
		fornecedores.add(f1);
		fornecedores.add(f2);
		
		List<Fornecedor> forncedoresLeitura = new ArrayList<>();
		
		try {
			FileOutputStream caminhoGravar = new FileOutputStream("/curso/fronecedor.dat");
			ObjectOutputStream gravarObjeto = new ObjectOutputStream(caminhoGravar);
			gravarObjeto.writeObject(fornecedores);
			gravarObjeto.flush();
			gravarObjeto.close();
		} catch (Exception e) {
			System.err.println("Erro ao gravar o arquivo");
					e.printStackTrace();
		}

		
//		System.out.println("--------Recuperando Arquivo-------");
//		try {
//			FileInputStream caminhoLer = new FileInputStream("/curso/fronecedor.dat");
//			ObjectInputStream lerObjeto = new ObjectInputStream(caminhoLer);
//			forncedoresLeitura = (List<Fornecedor>) lerObjeto.readObject();
//			lerObjeto.close();
//		} catch (Exception e) {
//			System.err.println("Problemas na leitura o arquivo");
//			e.printStackTrace();
//		}
//		System.out.println("Lista de Fornecedores:");
//		System.out.println(forncedoresLeitura);

		
		System.out.println("-------------Recuperando Arquivo-----------");
		try {
			FileInputStream caminhoLeitura = new FileInputStream("/curso/fornecedor.dat");
			ObjectInputStream lerObjecto = new ObjectInputStream(caminhoLeitura);
			fornecedoresLeitura = (List<Fornecedor>) lerObjecto.readObject();
			
		} catch (Exception e) {
			System.err.println("Problemas na leitura do arquivo");
			e.printStackTrace();

		}
		System.out.println("Dados da leitura do arquivo");
		System.out.println(fornecedoresLeitura);

	}


}
