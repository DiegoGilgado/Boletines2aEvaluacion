package boletin3parte2;

public abstract class Figura {

	private double area;
	
	protected abstract void calcularArea();
	protected void imprimirArea() {
		System.out.println(area);
	}

}
