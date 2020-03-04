package boletin3parte2;

public class Circulo extends Figura{
	private double radio;
	private final double PI=3.14;
	
	@Override
	protected void calcularArea() {
		setArea(radio*radio*PI);
	}
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio=radio;
	}
	public Circulo(double radio){
		this.radio=radio;
		
	}
}
