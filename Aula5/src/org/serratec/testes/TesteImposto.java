package org.serratec.testes;

import org.serratec.calculos.TotalImposto;
import org.serratec.exemplos.Empresa;
import org.serratec.exemplos.Pessoa;

public class TesteImposto {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Sandro ", 25000.);
		Empresa empresa1 = new Empresa("XPTO Ltda", 100000.);
		TotalImposto ti1 = new TotalImposto();
		
		ti1.calcularTotalGeralTributos(pessoa1);
		ti1.calcularTotalGeralTributos(empresa1);
		System.out.println("Total Geral Pago Empresa/Pessoa:" + ti1.getTotalGeral());		
		
//		System.out.println("Total Pagar Pessoa " + pessoa1.calcularIR());
//		System.out.println("Total Pagar Empresa: " + empresa1.calcularIR());
//		System.out.println("Total Pagar ICMS: " + empresa1.calcularICMS());
//
	}

}
	
