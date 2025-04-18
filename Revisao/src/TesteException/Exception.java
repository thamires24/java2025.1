package TesteException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {
	
 public static void main(String[] args) {
	 
	FileReader fr = new FileReader();
	Scanner sc = new Scanner(System.in);
	Integer num = 0;
	//String a = null;
	
	
	//do {
		try {
			System.out.println("Digite um número: ");
			num = sc.nextInt();
			//System.out.println("");
		
		} catch (InputMismatchException e) {
			//System.out.println("Número Inválido!");
			
			//aborta o codigo
			throw new InputMismatchException("parou de funcionar");
		}
		finally {
			//só executa no try/ catch
			//sempre executa, mesmo no throw new
			System.out.println("Sempre executa");
		}
		
	//} while (num != 0);
	
	
}

}
