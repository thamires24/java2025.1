package revisao;

public interface Pagamentos {
	Double TAXAS = 5.0;
	
	public void calcularSeguro();
	public Double pagarIPVA();
}
