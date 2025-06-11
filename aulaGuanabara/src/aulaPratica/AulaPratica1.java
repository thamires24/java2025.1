package aulaPratica;

public class AulaPratica1 {
	public int numConta;
	protected String tipoConta;
	private  String cliente;
	private Double saldo;
	private boolean status;
	
	//conta corrente $50 
	public void contructor() {
	saldo = 0.2;
	status = false;
	}
	
	
	
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	
	

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}
	
	

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}



	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}



	public boolean isStatus() {
		return status;
	}



	public void setStatus(boolean status) {
		this.status = status;
	}



	public void abrirConta(String t) {
		setTipoConta(t);
		setStatus(true);
		if(t = "CC") {
			saldo = 50
		}else {
			saldo = 150
	}
	}

	/*conta poupança $150
	fecharConta saldo = 0
	status verdadeiro para movimentar
	verificar saldo para sacar
	Verificar saldo para fechar */
	
	
	public void fecharConta() {
		if (saldo > 0) {
			System.out.println("Conta tem dinheiro!");
		
		} else if (saldo < 0) {
			System.out.println("Conta em Débito");
			
		} else {
			setStatus(false);
			
		}
	}
	
	public void depositar(real v){
		if (status = true ) {
			setSaldo(getSaldo + v);
			
		} else {
			System.out.println("Conta Inesistente");
		}
		
	}
	
	public void sacar(real v) {
		if (getStatus) {
			if (saldo > v) {
				saldo = saldo - v
		} else {
			System.out.println("Saldo Insuficiente!");
		}
		} else {
			System.out.println("Impossível Sacar!");
			
			}
	}
	
	public void pagarMensal() {
		real v;
		if (tipoConta = "CC") {
			v = 12;
		}else {
			v = 20;
	}
		
		if (status = true) {
			if (saldo > v) {
				saldo = saldo - v;
			}else {
				System.out.println("Impossível Pagar!");
				
			}
		}
		
	}
}
