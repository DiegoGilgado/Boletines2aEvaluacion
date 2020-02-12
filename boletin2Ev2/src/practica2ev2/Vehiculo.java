package practica2ev2;

public class Vehiculo {
	
	//campos
	private String matricula;
	private String tipo;
	private int velocidadMaxima;
	private Conductor conductor;
	
	
	//constr
	
	public void mostrarDatosVehiculo(){
		System.out.println(matricula);
		System.out.println(tipo);
		System.out.println(velocidadMaxima);
	}
	
	public void mostrarDatosCoche(){
		System.out.println(matricula);
		System.out.println(tipo);
		System.out.println(velocidadMaxima);
	}
	
	public void mostrarDatosCamion(){
		System.out.println(matricula);
		System.out.println(tipo);
		System.out.println(velocidadMaxima);
		System.out.println();
	}
	
	
	//metodos
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula=matricula;
	}
	
	
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo=tipo;
	}
	
	
	
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima=velocidadMaxima;
	}
	
	
	public Conductor getConductor() {
		return conductor;
	}
	
	public void setConductor(Conductor conductor) {
		this.conductor=conductor;
	}
	
}
