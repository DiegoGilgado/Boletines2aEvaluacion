package boletin2Ev2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Persona {

	
		// TODO Auto-generated method stub

		//campos
		public String  nombre;
		public String  apellido;
		public  int estatura;
		public  LocalDate fechana;
		
	public Persona (String nombre, String apellido, LocalDate fechana) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.fechana=fechana;
		
		
	}
	
	public Persona () {
	}
	public void MostarDatos() {
		//metodos
		
		System.out.println(nombre);
		System.out.println(apellido);
		System.out.println(estatura);
		System.out.println(fechana);
		//System.out.println("edad :" + ObtenerEdad() );
	}
		//consturctores
		

	public int ObtenerEdad(){
		long edad;
		edad = ChronoUnit.YEARS.between(fechana,LocalDate.now());
		return (int) edad;
	}
}
