package exercicio3;


public class Funcionario {
	protected String nome;
	protected Double salarioBruto;
	protected Double imposto;
	
	
	
	public Funcionario() {
		super();
		this.nome = nome;
		this.salarioBruto = salarioBruto;
		this.imposto = imposto;
	}
	
	

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", salarioBruto=" + salarioBruto + ", imposto=" + imposto
				+ "]";
	}

	

	public String getNome() {
		return nome;
	}



	public Double getSalarioBruto() {
		return salarioBruto;
	}



	public Double getImposto() {
		return imposto;
	}


	public Double DescontoSalarial() {
		return salarioBruto - imposto;
	}
	
	public void AumentoSalarial(Double percentage) {
		salarioBruto += salarioBruto * percentage / 100.0 - imposto;
	}
}
