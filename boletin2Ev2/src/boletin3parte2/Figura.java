package boletin3parte2;

public abstract class Figura {

	private double area;
	public void setArea(double area) {
		this.area=area;
	}
	
	public double getArea() {
		return area;
	}
	protected abstract void calcularArea();
	protected void imprimirArea() {
		System.out.println(area);
	}

}
