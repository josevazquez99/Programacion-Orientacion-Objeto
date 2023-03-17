package geometriaAbstracta.model;

public abstract class Figura {
	
	private int lados;

	public abstract double calcularArea();
	
	public abstract double calcularPerimetro();

	public String toString() {
		return String.format("Se trata de tipo %s , con un area de %s y un perimetro de %s", getClass().getSimpleName(),calcularArea(),calcularPerimetro());
	}
	
}
