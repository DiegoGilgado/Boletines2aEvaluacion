package boletin3parte2;

public class Rectangulo extends Figura{
	private double base;
	private double altura;
	
	
	@Override
	protected void calcularArea() {
		
		setArea(base*altura);
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
	
	public Rectangulo(double base, double altura){
		this.base=base;
		this.altura=altura;
	}
}
