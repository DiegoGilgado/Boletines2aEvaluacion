package boletin3parte2;

public class Cuadrado extends Rectangulo{
	
	public double getLado() {
		return getBase();
	}

	public void setLado(double lado) {
		this.setAltura(lado);
		this.setBase(lado);
	}
	
	public Cuadrado(double lado){
		super(lado, lado);
	}
	
	
}
