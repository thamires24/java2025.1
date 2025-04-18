package Aula5;

public class ContaCorrente implements Conta {
	private String titular;
	private Double saldo;
	private static int contador = 0;
	
	
	
	public ContaCorrente(String titular, Double saldo) {
		super();
		this.titular = titular;
		this.saldo = saldo;
	}
	
	

	public String getTitular() {
		return titular;
	}



	public Double getSaldo() {
		return saldo;
	}



	@Override
	public String toString() {
		return "ContaCorrente Titular: "+ titular + ", saldo: " + saldo;
	}



	public Boolean saque(Double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			return true;
		}
		return false;
	}

	public void deposito(Double valor) {
		if (valor > 0) {
			saldo += valor;
			System.out.println("Saldo atual: " + saldo);
		} else {
			System.out.println("Valor Inválido!");
		}
		
		public Integer contador();
			
	
	}
	

}
