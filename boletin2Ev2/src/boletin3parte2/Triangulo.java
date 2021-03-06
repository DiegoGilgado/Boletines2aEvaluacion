package boletin3parte2;

public class Triangulo extends Figura {
	private double base;
	private double altura;
	
	@Override
	protected void calcularArea() {
		setArea(base*altura/2);
	}
	public double getBase() {
		return base;
	}
	
	public void setBase(double base) {
		this.base=base;
	}
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura=altura;
	}
	public Triangulo(double base, double altura){
		this.base=base;
		this.altura=altura;
	}
}
