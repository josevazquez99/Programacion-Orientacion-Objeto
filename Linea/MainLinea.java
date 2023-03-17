package Linea;

import java.util.Scanner;

public class MainLinea {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el x del Punto A");
		double x = Double.valueOf(sc.nextLine());
		System.out.println("Introduce el y del Punto A");
		double y = Double.valueOf(sc.nextLine());
		Punto A = new Punto(x, y);
		System.out.println("Introduce el x del Punto B");
		double x1 = Double.valueOf(sc.nextLine());
		System.out.println("Introduce el y del Punto B");
		double y1 = Double.valueOf(sc.nextLine());
		Punto B = new Punto(x1, y1);
		Linea L = new Linea(A, B);
		
		String menu = "";

		do {
			System.out.println("1. Mover línea: Solicitará el movimiento (A-arriba, B-ABajo, I-Izquierda, D-\n"
					+ "Derecha) y realice el movimiento\n" + "2. Mostrar línea\n" + "3. Salir");
			menu=sc.nextLine();
			switch (menu) {
			case "1": {
				System.out.println("(A-arriba, B-ABajo, I-Izquierda, D-\n" + "Derecha");
				String movimiento = sc.nextLine();
				if (movimiento.equalsIgnoreCase("a")) {
					System.out.println("Introduzca la cantidad");
					double cantidad = Double.valueOf(sc.nextLine());
					L.moverArriba(cantidad);
				} else if (movimiento.equalsIgnoreCase("b")) {
					System.out.println("Introduzca la cantidad");
					double cantidad = Double.valueOf(sc.nextLine());
					L.moverAbajo(cantidad);
				} else if (movimiento.equalsIgnoreCase("i")) {
					System.out.println("Introduzca la cantidad");
					double cantidad = Double.valueOf(sc.nextLine());
					L.moverIzquierda(cantidad);
				} else {
					System.out.println("Introduzca la cantidad");
					double cantidad = Double.valueOf(sc.nextLine());
					L.moverDerecha(cantidad);

				}
			}

				break;

			case "2": {
				System.out.println(L.toString());

				break;
			}
			default:
				System.out.println("Salir");
				;
			}

		} while (!menu.equals("3"));

	}

}
