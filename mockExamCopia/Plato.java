package mockExamCopia;

import java.util.Objects;

public class Plato {
	
	private String nombre;
	private int precio;
	private static final int iva=21;
	private Vino vinoRecomendado;
	private int graduacion;
	
	
	public Plato(String nombre) {
		super();
		this.nombre = nombre;
	}


	public Plato(String nombre, int precio) {
		super();
		if(precio<0) {
			
		}
		this.nombre = nombre;
		this.precio = precio;
	}


	public String getNombre() {
		return nombre;
	}


	public int getPrecioBase() {
		return precio;
	}
	public int getPrecioVentaPublico() {
		int resultado=0;
		resultado=precio*(iva/100)+precio;
		return resultado;
	}


	public String getVinoRecomendado() {
		return this.vinoRecomendado.toString() ;
	}


	public void setPrecio(int precio) {
		if(precio<0) {
			throw new ExcepcionPlato();
		}this.precio=precio;
	}
	
	public void incrementarPrecio(int incremento) {
		this.precio+=incremento;
	}


	public void setVinoRecomendado(Vino vinoRecomendado) {
		this.vinoRecomendado = vinoRecomendado;
	}

	public void setVinoRecomendado(Vino vinoRecomendado,int graduacion) {
		this.vinoRecomendado = vinoRecomendado;
		this.graduacion=graduacion;
	}


	public int getGradosVinosRecomendado() {
		return graduacion;
	}




	
	public boolean equals(Object obj) {
		boolean resultado=false;
		if (this == obj)
			resultado= true;
		if (obj == null)
			resultado= false;
		if (getClass() != obj.getClass())
			resultado= false;
		Plato other = (Plato) obj;
		resultado= Objects.equals(nombre, other.nombre);
		return resultado;
	}


	@Override
	public String toString() {
		return "Plato [nombre=" + nombre + ", vinoRecomendado=" + vinoRecomendado + ", graduacion=" + graduacion
				+ ", getPrecioBase()=" + getPrecioBase() + ", getPrecioVentaPublico()=" + getPrecioVentaPublico() + "]";
	}


	public static int getIva() {
		return iva;
	}
	
	

	

	
	
	

}
