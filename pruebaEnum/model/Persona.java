package pruebaEnum.model;

import java.time.LocalDate;

public class Persona implements Comparable<Persona>{
	
	private String nombre;
	private String apellidos;
	private Genero genero;
	private LocalDate fechaNacimiento;
	
	
	public Persona(String nombre, String apellidos, Genero genero, LocalDate fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.genero = genero;
		this.fechaNacimiento = fechaNacimiento;
	}


	@Override
	public String toString() {
		return "Persona cuyo nombre es " + nombre + " " + apellidos + " y de genero " + genero + " cuya fecha de nacimiento es "
				+ fechaNacimiento + "]";
	}


	@Override
	public int compareTo(Persona o) {
		return -o.genero.compareTo(genero);
	}
	
	

}
