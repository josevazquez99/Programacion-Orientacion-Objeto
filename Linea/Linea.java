package Linea;

import java.util.Objects;

public class Linea {

	Punto puntoA;
	Punto puntoB;

	public Linea() {
		this.puntoA = new Punto(0, 0);
		this.puntoB = new Punto(0, 0);

	}

	public Linea(Punto puntoA, Punto puntoB) {
		super();
		this.puntoA = puntoA;
		this.puntoB = puntoB;
	}

	public Punto getPuntoA() {
		return puntoA;
	}

	public void setPuntoA(Punto puntoA) {
		this.puntoA = puntoA;
	}

	public Punto getPuntoB() {
		return puntoB;
	}

	public void setPuntoB(Punto puntoB) {
		this.puntoB = puntoB;
	}

	public boolean equals(Object obj) {
		boolean resultado = false;
		if (this == obj)
			resultado = true;
		if (obj == null)
			resultado = false;
		if (getClass() != obj.getClass())
			resultado = false;
		Linea other = (Linea) obj;
		resultado = Objects.equals(puntoA, other.puntoA) && Objects.equals(puntoB, other.puntoB);
		return resultado;
	}

	public void moverDerecha(double cantidad) {
		this.puntoA.moverDerecha(cantidad);
		this.puntoB.moverDerecha(cantidad);
	}

	public void moverIzquierda(double cantidad) {
		this.puntoA.moverIzquierda(cantidad);
		this.puntoB.moverIzquierda(cantidad);
	}

	public void moverArriba(double cantidad) {
		this.puntoA.moverArriba(cantidad);
		this.puntoB.moverArriba(cantidad);
	}

	public void moverAbajo(double cantidad) {
		this.puntoA.moverAbajo(cantidad);
		this.puntoB.moverAbajo(cantidad);
	}

	public String toString() {
		return "Linea [puntoA=" + puntoA + ", puntoB=" + puntoB + "]";
	}

}
