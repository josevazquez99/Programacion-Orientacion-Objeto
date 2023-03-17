package geometriaAbstracta.model;

public class Main {

	public static void main(String[] args) {

		Figura figura = new Triangulo(3,4,5);
		System.out.println(figura);
		Figura circulo=new Circulo(15);
		System.out.println(circulo);
	}

}
