package mockExamCopia;

import java.util.Objects;

public class Vino {
	
	private String nombre;
	private int graduacion;
	
	public Vino(String nombre) {
		super();
		this.nombre = nombre;
	}
	public Vino(String nombre, int graduacion) {
		super();
		if(graduacion>=0) {
		this.nombre = nombre;
		this.graduacion = graduacion;}
	}
	public  String getNombre() {
		return nombre;
	}
	public int getGraduacion() {
		return graduacion;
	}
	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}
	
	public boolean equals(Object obj) {
		boolean resultado=false;
		if (this == obj)
			resultado= true;
		if (obj == null)
			resultado= false;
		if (getClass() != obj.getClass())
			resultado= false;
		Vino other = (Vino) obj;
		resultado= Objects.equals(nombre, other.nombre);
		return resultado;
	}
	@Override
	public String toString() {
		return "Vino [nombre=" + nombre + ", graduacion=" + graduacion + "]";
	}
	
	
	
	
	

}
