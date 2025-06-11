package unidade04;

public class Conta {
	private int numConta;
	private String nomeTitular;
	private Double saldo = 0.0;
	

	public Conta(int numConta, String nomeTitular) {
		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
	}


	public Conta(int numConta, String nomeTitular, Double depInicial) {
		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
		depositar(depInicial);
	}

	
	
	
	@Override
	public String toString() {
		return "Conta: " + numConta 
				+ "\nTitular: " + nomeTitular 
				+ "\nSaldo: $" + String.format("%2.2f" , saldo);
	}


	public String getNomeTitular() {
		return nomeTitular;
	}


	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}


	public int getNumConta() {
		return numConta;
	}


	public Double getSaldo() {
		return saldo;
	}


	public Double depositar(Double valor) {
		return saldo += valor;
	
	}
	
	public Double sacar(Double valor) {
		return saldo -= (valor + 5.00);
	}
	
}