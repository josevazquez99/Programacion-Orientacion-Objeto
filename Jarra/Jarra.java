package Jarra;

public class Jarra {
	
	private int capacidad;
	private double cantidad;
	private static double totalAgua;
	
	
	public Jarra(int capacidad ){
		super();
		this.capacidad = capacidad;
		this.cantidad = 0.0;
	}
	
	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public double getTotalAgua() {
		return totalAgua;
	}

	public void setTotalAgua(double totalAgua) {
		Jarra.totalAgua = totalAgua;
	}

	public void getvaciarJarra() {
		this.cantidad=0.0;
	}
	public void getllenarJarra() {
		this.cantidad=capacidad;
		totalAgua+=capacidad;
		
	}
	public static double gettotalAgua() {
		return totalAgua;
	}
	public void volcarJarraAJarraB(Jarra j,Jarra j1) {
		if(j1.getCantidad()>=0.0 && j.getCantidad()>=0.0 && j.getCantidad()>=j1.getCantidad()) {
		j1.setCantidad(j.getCantidad()+j1.getCantidad());
		j.setCantidad(0.0);}

	}
	public void volcarJarraBJarraA(Jarra j,Jarra j1) {
		if(j1.getCantidad()>=0.0 && j.getCantidad()>=0.0 && j1.getCantidad()>=j.getCantidad()) {
		j.setCantidad(j.getCantidad()+j1.getCantidad());
		j1.setCantidad(0.0);}

	}


	
	public String toString() {
		return "Jarra [capacidad=" + capacidad + ", cantidad=" + cantidad + ", totalAgua=" + totalAgua + "]";
	}
	

}
