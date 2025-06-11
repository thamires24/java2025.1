package util;

public class Calculo {

	public static final Double PI = 3.14159;
	
	public static Double circunferencia (Double raio) {
		return 2.0 * PI * raio;
	}
	
	public static Double volume(Double raio) {
		return 4.0 * PI * raio * raio * raio / 3;
	}
}
