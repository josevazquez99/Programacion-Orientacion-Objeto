package Jarra;

import java.util.Scanner;

public class MainJarra {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Jarra j=new Jarra(5);
		Jarra j1=new Jarra(7);
		String menu = "";
		do {
			System.out.println("1. Llenar jarra.\n" + "2. Vaciar jarra.\n" + "3. Volcar jarra A en B .\n"
					+ "4. Volcar jarra B en A.\n" + "5. Ver estado de las jarras\n" + "6. Salir:");
			System.out.println("Que opcion deseas");
			menu = sc.nextLine();
			switch (menu) {
			case "1": {
				System.out.println("Que jarra deseas llenar");
				String eleccion=sc.nextLine();
				if(eleccion.equalsIgnoreCase("a")) {
					j.getllenarJarra();
				}else {
					j1.getllenarJarra();
				}

				break;
			}case "2": {System.out.println("Que jarra deseas vaciar");
						String eleccion=sc.nextLine();
						if(eleccion.equalsIgnoreCase("a")) {
							j.getvaciarJarra();
						}else {
							j1.getvaciarJarra();
						}
			
				

				break;
			}case "3": {
				j.volcarJarraAJarraB(j, j1);


				break;
			}case "4": {
				j1.volcarJarraBJarraA(j, j1);

				break;
			}case "5": {System.out.println(j.toString());
						System.out.println(j1.toString());

				break;
			}
			default:
				System.out.println("El total de agua es " + Jarra.gettotalAgua());			}

		} while (!menu.equals("6"));


	}

}
