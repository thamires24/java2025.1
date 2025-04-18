package revisao;

public class RevisaoException {

	public static void main(String[] args) {
		int[] nums = {2, 53, 90};
		
		try {
		System.out.println(nums[1]);
		System.out.println("Foi");
		System.out.println(transformarMaiuscula(null));
		
		} catch(ArrayIndexOutOfBoundsException e){
			System.err.println("Erro no programa");
		
		} catch(NullPointerException e) {
			System.err.println("Erro de conversão");
		
		}finally {
			System.out.println("Sempre executa");
		}
	}	
		
		public static String transformarMaiuscula(String txt) throws NullPointerException {
			return txt.toUpperCase();

	}
}