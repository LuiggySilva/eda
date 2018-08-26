package forma;

public class Retangulo implements FormaGeometrica{
	
	private double altura;
	private double base;

	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double area() {
		return this.altura * this.base;
	}
	
}
