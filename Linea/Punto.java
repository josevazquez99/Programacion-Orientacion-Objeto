package Linea;

import java.util.Objects;

public class Punto {

	private double x;
	private double y;

	public Punto() {

	}

	public Punto(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void moverDerecha(double cantidad) {
		x+=cantidad;
	}

	public void moverIzquierda(double cantidad) {
		x-=cantidad;
	}

	public void moverArriba(double cantidad) {
		y+=cantidad;
	}

	public void moverAbajo(double cantidad) {
		y-=cantidad;
	}

	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}


	public boolean equals(Object obj) {
		boolean resultado;
		if (this == obj)
			resultado= true;
		if (obj == null)
			resultado= false;
		if (getClass() != obj.getClass())
			resultado= false;
		Punto other = (Punto) obj;
		resultado= Double.doubleToLongBits(x) == Double.doubleToLongBits(other.x)
				&& Double.doubleToLongBits(y) == Double.doubleToLongBits(other.y);
		return resultado;
	}
	

}
