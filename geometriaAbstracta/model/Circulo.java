package geometriaAbstracta.model;

public class Circulo extends Figura {

	
	private int radio;
	
	
	
	public Circulo(int radio) {
		super();
		this.radio = radio;
	}

	@Override
	public double calcularArea() {
		return Math.PI*Math.pow(radio, 2);
	}

	@Override
	public double calcularPerimetro() {
		return 2*Math.PI*radio;
	}

}
