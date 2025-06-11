package util;

public class ConverDolar {
	
	public static final Double IOF = 0.06;

	public static Double dolarReal(Double total, Double precoDolar) {
		return total * precoDolar * (1.0 + IOF);
	}
	
}
