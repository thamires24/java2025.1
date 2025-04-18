package Aula5;

//já é abstrata, não contém instancia
//tudo é publico
public interface Conta {
	
	//valor fixo, uma variável constante
	public static final Double TAXAS = 10.;
	
	//assinaturas de metodos
	public Boolean saque(Double valor);
	public void deposito(Double valor);

	

}
