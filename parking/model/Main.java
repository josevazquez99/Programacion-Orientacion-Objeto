package parking.model;

import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {
		LocalDateTime fecha=null;
		Parking p= new Parking();
		Vehiculo v=new Vehiculo("Skoda", "Scala", "3894CGJ", Combustible.GASOLINA, fecha.now(), Tipo.AUTOMOVIL);
		System.out.println(p.entrarParking(v));
		System.out.println(p.salirParking(v));

	}

}
