package practica2ev2;

public class Camion extends Vehiculo {
	private int altura;
	private Remolque remolque;
	
	public Camion(String matricula, String tipo, int velocidadMaxima, Remolque remolque) {
		this.setMatricula(matricula);
		this.setTipo(tipo);
		this.setVelocidadMaxima(velocidadMaxima);
		this.remolque=remolque;
		
	}
	
	public Remolque getRemolque()
	{
		return this.remolque;
	}
	@Override
	public void mostrarDatos(){
		super.mostrarDatos();
		System.out.println("Remolque: "+remolque);
		
	}
	
	
	public Camion(String matricula, String tipo, int velocidadMaxima, int altura ) {
		super(matricula, tipo, velocidadMaxima);
		this.altura=altura;
	}
}
