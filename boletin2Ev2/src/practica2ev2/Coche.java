package practica2ev2;

public class Coche extends Vehiculo {

	private int numeroPlazas;
	
	public Coche(String matricula, String tipo, int velocidadMaxima, int numeroPlazas){
		this.setMatricula(matricula);
		this.setTipo(tipo);
		this.setVelocidadMaxima(velocidadMaxima);
		this.numeroPlazas=numeroPlazas;
	}
	@Override
	public void mostrarDatos(){
		super.mostrarDatos();
		System.out.println("Nº plazas: " + numeroPlazas);
		
	}
	
	
	
}
