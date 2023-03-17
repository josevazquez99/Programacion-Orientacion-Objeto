package geometria.model;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce la longitud");
		int longitud=Integer.valueOf(sc.nextLine());
		System.out.println("Introduce el ancho");
		int ancho=Integer.valueOf(sc.nextLine());
		Rectangulo r=new Rectangulo(longitud,ancho);
		System.out.println(r.getArea(ancho, longitud));
		System.out.println(r.getPerimetro(ancho,longitud));
	}

}
