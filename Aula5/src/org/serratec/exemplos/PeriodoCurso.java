package org.serratec.exemplos;

public enum PeriodoCurso {
	INTEGRAL("ter e qui", 40, 2000.), 
	NOTURNO("sex", 80, 3000.),
	TARDE("seg e qua", 20, 500.);

	private String dias;
	private Integer cargaHorario;
	private Double valor;
	
	
	private PeriodoCurso(String dias, Integer cargaHorario, Double valor) {
		this.dias = dias;
		this.cargaHorario = cargaHorario;
		this.valor = valor;
	
	//Construtor do enum é para definir a ordem dos atributos
	}

	public String getDias() {
		return dias;
	}

	public Integer getCargaHorario() {
		return cargaHorario;
	}

	public Double getValor() {
		return valor;
	}
		
}
