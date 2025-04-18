package revisao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TesteCarro {

	public static void main(String[] args) {
		Marca marca1 = new Marca("Ford");
		Marca marca2 = new Marca("Honda");
		Marca marca3 = new Marca("Fiat");
		
		Modelo modelo1 = new Modelo("Fit", 2024, "12345", 35000.,"xarde", marca2);
		Modelo modelo2 = new Modelo("KA", 2012, "12345", 15000., "XXXXX", marca1);
		
		
		//System.out.println(modelo1);
		
		//ignora itens duplicados
		Set<Marca> marcas = new HashSet<>();
		marcas.add(marca1);
		marcas.add(marca2);
		marcas.add(marca3);
		
		
		//<> especifica o parametro da lista /ArrayList não deixa adicionar, mas pode modificar
		//List<Marca> marcas = new ArrayList<>();
		//marcas.add(marca1);
		//marcas.add(marca2);
		//marcas.set(1, new Marca("Toyota"));
		
		//List<Marca> marcas = Arrays.asList(marca1,marca2);
		
		//recebe um vetor/lista e percorre para imprimir
		for (Marca m : marcas) {
			System.out.println(m);
			
		}
		
		//LinkedSet ordem de inserção dos elementos
		//TreeSet (Comparable) ordena segundo o parâmetro que for passadp
		//HashSet imprime de forma aleatória
		

	}

}
