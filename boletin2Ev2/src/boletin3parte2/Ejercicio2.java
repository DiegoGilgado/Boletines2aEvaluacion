package boletin3parte2;


public class Ejercicio2 extends Figura{

	@Override
	protected void calcularArea() {
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		Circulo circulo1=new Circulo(2.2 );
			circulo1.calcularArea();
			//double a= circulo1.getArea();
			System.out.printf("El area del Circulo es: %.3f\n",circulo1.getArea());
			//System.out.println(a);
			
			System.out.println();
			
		Cuadrado cuadrado1=new Cuadrado(4);
			cuadrado1.calcularArea();
			System.out.println("El area del Cuadrado es: "+cuadrado1.getArea());
		
			System.out.println();
			
		Triangulo triangulo1=new Triangulo(2.5 , 3.3);
			triangulo1.calcularArea();
			System.out.println("El area del Triangulo es: "+triangulo1.getArea());
			
			System.out.println();
			
		Rectangulo rectangulo1=new Rectangulo(3.5, 4.5);
			rectangulo1.calcularArea();
			System.out.println("El area del Rectangulo es: "+rectangulo1.getArea());
			
			
			
			
			Figura[] arrayFiguras= {
					new Triangulo(3,2),
					new Cuadrado(5),
					new Triangulo(15,3),
					new Triangulo(8,7),
					new Rectangulo(9,5),
					new Rectangulo(15,6),
					new Circulo(5),
					new Circulo(9),
					new Rectangulo(8,3),
					new Cuadrado(9)
					};
		
	}

}

