package practica2ev2;

public class ejercicio2 {

	public static void main(String[] args) {
		Coche coche1=new Coche( "1035 LFJ", "Cupe", 240, 5);
		Conductor conductor1=new Conductor("11111111p", "Diego");
		coche1.setConductor(conductor1);
		Remolque remolque1=new Remolque();
		remolque1.matricula="1036 LJF";
		remolque1.longitud=5;
	}

}