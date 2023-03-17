package miPrimeraClase;

import java.util.Scanner;

public class Avion {
	Scanner sc = new Scanner(System.in);

	private String idAvion;
	private int capacidad;
	private int numVuelos = 0;
	private double kmVolados = 0.0;
	private String compannia;

	public Avion(String idAvion, int capacidad) {
		super();
		this.idAvion = idAvion;
		this.capacidad = capacidad;

	}

	public Avion(String idAvion, String compannia, int capacidad) {
		super();
		this.idAvion = idAvion;
		this.compannia = compannia;
		this.capacidad = capacidad;
	}

	public  boolean asignarVuelo(int capacidad, double kmVolados) {
		boolean asignado = false;
		if ((capacidad>0 && capacidad<= this.capacidad) && (kmVolados > 0)) {
			asignado = true;
		}
		return asignado;
	}

	public double getkmVolados() {
		return kmVolados;
	}

	public double getMediaKm() {
		return this.kmVolados/this.numVuelos;

	}

	public String getIdAvion() {
		return idAvion;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public double getKmVolados() {
		return kmVolados;
	}

	public String getCompannia() {
		return compannia;
	}

	public void setCompannia(String compannia) {
		this.compannia = compannia;
	}

	public int getNumVuelos() {
		return numVuelos;
	}

	public void setNumVuelos(int numVuelos) {
		this.numVuelos = numVuelos;
	}

	public void setKmVolados(double kmVolados) {
		this.kmVolados = kmVolados;
	}
	

}