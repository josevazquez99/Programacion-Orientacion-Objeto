package mockExamCopia;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Plato[] platos = new Plato[5];
		Vino v = new Vino("Blanco", 5);
		Vino v1 = new Vino("Negro", 7);
		Vino[] vinos = { v, v1 };
		int contador = 0;

		for (int i = 0; i < platos.length; i++) {
			platos[i] = new Plato("Pulpo", 5);
		}

		String menu = "1. Dar de alta un plato (Se deberá solicitar el nombre y precio del plato). Si el plato ya\r\n"
				+ "existe se deberá mostrar un mensaje de error. Si el plato no se puede crear se debe\r\n"
				+ "informar al respecto.\r\n"
				+ "2. Modificar el precio de un plato (Se deberá pedir el nombre del plato, si el plato no\r\n"
				+ "existe informar del error, en caso contrario pedir el nuevo precio y actualizar el\r\n"
				+ "precio.)\r\n"
				+ "3. Asignar un vino a un plato. Se preguntará el nombre del plato, el nombre del vino y\r\n"
				+ "la graduación. Informar si hay error.\r\n"
				+ "4. Mostrar información de un plato. (Se pedirá el nombre del plato, error si no existe).\r\n"
				+ "5. Mostrar información de todos los platos.\r\n" + "6. Salir.";

		String opcion = "";
		do {
			System.out.println(menu);
			System.out.println("Que opcion deseas");
			opcion = sc.nextLine();

			if (opcion.equals("1")) {
				System.out.println("Introduce el nombre del plato");
				String nombre = sc.nextLine();
				System.out.println("Introduce el precio");
				int precio = Integer.valueOf(sc.nextLine());
				boolean existe = false;
				for (int i = 0; i < platos.length && !existe; i++) {
					existe = platos[i].getNombre().equalsIgnoreCase(nombre);
				}
				if (!existe) {
					platos[contador] = new Plato(nombre, precio);
					contador++;

				}
				if (existe) {
					System.out.println("El plato ya existe");
				}
			} else if (opcion.equals("2")) {
				System.out.println("Introduce el nombre del plato");
				String nombre = sc.nextLine();
				int posicion = 0;
				boolean existe = false;
				for (int i = 0; i < platos.length && !existe; i++) {
					existe = platos[i].getNombre().equalsIgnoreCase(nombre);
					if (existe) {
						posicion = i;
					}
				}
				if (existe) {
					System.out.println("Introduce el nuevo precio");
					int precio = Integer.valueOf(sc.nextLine());
					platos[posicion].setPrecio(precio);
				}
				if (!existe) {
					System.out.println("El plato no existe");
				}

			} else if (opcion.equals("3")) {
				System.out.println("Introduce el nombre del plato");
				String nombre = sc.nextLine();
				boolean existe = false;
				for (int i = 0; i < platos.length && !existe; i++) {
					existe = platos[i].getNombre().equalsIgnoreCase(nombre);
				}
				if (existe) {
					System.out.println("Introduce el nombre del vino");
					String nombreVino = sc.nextLine();
					System.out.println("Introduce la graduacion");
					int graduacion=Integer.valueOf(sc.nextLine());
					boolean existeVino=false;
					for(int i=0;i<vinos.length && !existeVino;i++) {
						existeVino=vinos[i].getNombre().equalsIgnoreCase(nombreVino) &&
						vinos[i].getGraduacion()==graduacion;
					}if(existeVino && existe) {
						System.out.println("Vino asignado al plato");
					}else {
						System.out.println("No existe el vino");
					}
				}else {
					System.out.println("No existe el plato");
				}

			}

			else if (opcion.equals("4")) {
				System.out.println("Introduce el nombre del plato");
				String nombre = sc.nextLine();
				boolean existe = false;
				int posicion = 0;
				for (int i = 0; i < platos.length && !existe; i++) {
					existe=platos[i].getNombre().equalsIgnoreCase(nombre);
					if (existe) {
						posicion = i;

					}

				}
				if (existe) {
					System.out.println(platos[posicion]);
				}
				else {
					System.out.println("el plato no existe");
				}

			}

			else if (opcion.equals("5")) {
				System.out.println(Arrays.toString(platos));
			}

		} while (!opcion.equals("6"));

	}

}
