package boletin2Ev2;

import java.time.LocalDate;

public class Ejercicio1 {

	public static void main(String[] args) {
		Persona p1=new Persona();
		p1.nombre="Jose";
		p1.apellido="Rodriguez Mata";
		p1.estatura=165;
		p1.fechana=LocalDate.of(1965, 1, 15);
		
		Persona p2=new Persona();
		p2.nombre="María";
		p2.apellido="Sánchez Gómez";  
		p2.estatura=170;
		p2.fechana=LocalDate.of(1980, 12, 26);
		
		Persona p3=new Persona();
		p3.nombre="Alejandro ";
		p3.apellido="Gómez Gómez";  
		p3.estatura=190;
		p3.fechana=LocalDate.of(2001, 11, 01);
		
		Persona p4=new Persona();
		p4.nombre="Jose Manuel";
		p4.apellido="Pérez Pons";  
		p4.estatura=127;
		p4.fechana=LocalDate.of(2010, 05, 01);
		
		LocalDate fna=LocalDate.of(2000, 06, 12);
		LocalDate fna2=LocalDate.of(1976, 8, 23);
		Persona p5= new Persona("Lorena", "Remeseiro Neira",fna );
		Persona p6= new Persona("Patricia", "Seoane Álvarez",fna2 );
		
		p1.MostarDatos();
		System.out.println("edad :" + p1.ObtenerEdad() );
		System.out.println();		
		p2.MostarDatos();
		System.out.println("edad :" + p2.ObtenerEdad() );
		p3.MostarDatos();
		System.out.println("edad :" + p3.ObtenerEdad() );
		System.out.println();
		p4.MostarDatos();
		System.out.println("edad :" + p4.ObtenerEdad() );
		System.out.println();
		p5.MostarDatos();
		System.out.println("edad :" + p5.ObtenerEdad() );
		System.out.println();
		p6.MostarDatos();
		System.out.println("edad :" + p6.ObtenerEdad() );
		
		
		/*Persona [] arrayPersonas=new Persona [6];
		arrayPersonas[0]=p1;
		arrayPersonas[1]=p2;
		*/
		Persona [] arrayPersonas= {p1,p2,p3,p4,p5,p6};
		
		Persona personaMayorEdad=obtenerPersonaMayorEdad(arrayPersonas);
		personaMayorEdad.MostarDatos();
		
		
	}//main
	
	
	private static Persona obtenerPersonaMayorEdad(Persona[] array)
	{
		
		Persona mayorPersona=array[3];
		
		for(Persona person:array)
		{
			if(mayorPersona.ObtenerEdad()<person.ObtenerEdad())
			{
				mayorPersona=person;
			}
		}
		
		return mayorPersona;
		
	}
	
	
	

}
