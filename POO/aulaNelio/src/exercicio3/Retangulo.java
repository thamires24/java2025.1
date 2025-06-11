package exercicio3;

public class Retangulo {
	protected Double b, h;

	
	
	@Override
	public String toString() {
		return "Retangulo [b=" + b + ", h=" + h + "]";
	}

	public Double area() {
		return b * h;
	}
	
	public Double perimetro() {
		return 2 * (b+h);
	}
	
	public Double diagonal() {
		return Math.sqrt(Math.pow(b, 2) + Math.pow(h, 2));
	}
}
