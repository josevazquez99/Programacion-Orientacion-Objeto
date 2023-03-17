package geometria.model;

public class Rectangulo {
	private int longitud;
	private int ancho;

	public Rectangulo(int longitud, int ancho) {
		super();
		this.longitud = longitud;
		this.ancho = ancho;
	}
	public Rectangulo() {
		super();
		this.longitud = 1;
		this.ancho = 1;
	}

	public int getPerimetro(int ancho,int longitud) {
		return (2*ancho)+(2*longitud);
	}

	public int getArea(int ancho, int longitud) {
		return ancho*longitud;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		if (longitud >0 && longitud <20) {
			this.longitud = longitud;
		}
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		if (ancho > 0 && ancho < 20) {
			this.ancho = ancho;
		}
	}

}
