package Producto;

import java.util.Objects;

public class Producto {
	
	private String descripcion;
	private double precioSinIva;
	final double precioIva = 0.20;
	
	
	public Producto(String descripcion, double precioSinIva) {
		super();
		this.descripcion = descripcion;
		this.precioSinIva = precioSinIva;
	}


	@Override
	public int hashCode() {
		return Objects.hash(descripcion, precioIva, precioSinIva);
	}


	public String getDescripcion() {
		return descripcion;
	}




	public double getPrecioSinIva() {
		return precioSinIva;
	}


	public void setPrecioSinIva(double precioSinIva) {
		this.precioSinIva = precioSinIva;
	}


	public double getPrecioIva() {
		return precioIva;
	}

	public double calcularPrecioVenta() {
		return precioSinIva+(precioSinIva*precioIva);
	}

	
	public String toString() {
		return "Producto [ descripcion = " + descripcion + " , precioSinIva = " + precioSinIva + " , precioIva = " + precioIva + "]";
	}

	
	
	
	

}
