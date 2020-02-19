package practica2ev2;

public class Conductor {
	String dni;
	String nombre;
	
	public Conductor(String dni, String nombre) {
		this.dni=dni;
		this.nombre=nombre;
	}
	@Override
	public String toString(){
		return "DNI de conductor "+ dni + "Nombre de conductor "+nombre;
	}
}
