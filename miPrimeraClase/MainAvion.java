package miPrimeraClase;

import java.util.Scanner;

public class MainAvion {

	public static void main(String[] args) {
		String menu;
		Scanner sc = new Scanner(System.in);
		String identificador = "";
		int capacidad = 0;
		String compania = "";
		do {
			System.out.println("""
					1. Crear avion solo con el identificador.
					2. Crear avion con el identificador y la compañia
					3. Salir""");
			menu = sc.nextLine();
			switch (menu) {

			case "1" -> {
				System.out.println("Introduzca identificador");
				identificador = sc.nextLine();
				System.out.println("Introduzca capacidad de nuevo avion");
				capacidad = Integer.parseInt(sc.nextLine());
			}

			case "2" -> {

				System.out.println("Introduzca identificador");
				identificador = sc.nextLine();
				System.out.println("Introduzca compañia a la que pertenece");
				compania = sc.nextLine();
				System.out.println("Introduzca capacidad de nuevo avion");
				capacidad = Integer.parseInt(sc.nextLine());

			}

			}

		} while (!menu.equals("3"));
		Avion a1 = new Avion(identificador, compania, capacidad);

		String menu2 = "a)Asignar Vuelo\r\n" + "b) Obtener el numero de vuelos\r\n"
				+ "c) Obtener el numero de kilometros\r\n" + "d) Obtener la media de kilometros por vuelo\r\n"
				+ "e) Cambio de compannia\r\n" + "f) Mostrar informacion del avion\r\n" + "g) Salir";
		String opcionMenu2 = "";
		while (!(opcionMenu2 == "f")) {
			System.out.println(menu2);
			System.out.println("Introduce la opcion que deseas");
			opcionMenu2 = sc.nextLine();
			switch (opcionMenu2) {
			case "a": {
				System.out.println("Introduce el numero de asientos");
				capacidad = Integer.valueOf(sc.nextLine());
				System.out.println("Introduce los kilometros");
				int kmVolados = Integer.valueOf(sc.nextLine());
				System.out.println(a1.asignarVuelo(capacidad, kmVolados));
				a1.setKmVolados(a1.getkmVolados()+kmVolados);
				a1.setNumVuelos(a1.getNumVuelos()+1);
				break;
			}
			case "b": {
				System.out.println(a1.getNumVuelos());
				break;
			}
			case "c": {
				System.out.println(a1.getKmVolados());
				break;
			}
			case "d": {
				System.out.println(a1.getMediaKm());
				break;
			}
			case "e": {
				System.out.println("Introduce la compannia");
				String compannia = sc.nextLine();
				a1.setCompannia(compannia);
				break;
			}
			case "f": {
				System.out.println(a1.toString());
				break;
			}
			default:
				System.out.println("Salir");
				;
			}
		}
	}
}