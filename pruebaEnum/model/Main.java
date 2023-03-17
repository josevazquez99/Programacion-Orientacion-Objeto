package pruebaEnum.model;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Scanner sc =new Scanner(System.in);
//		Genero generoIntroducido = null;
//		int dia=0;
//		int mes=0;
//		int anno=0;
//		do {
//			try {
//				System.out.println("Introduce el genero");
//				String generoComoString = sc.nextLine();
//				generoIntroducido = Genero.valueOf(generoComoString.toUpperCase());
//				System.out.println("Introduce el dia de Nacimiento");
//				dia=Integer.valueOf(sc.nextLine());
//				System.out.println("Introduce el mes de Nacimiento");
//				mes=Integer.valueOf(sc.nextLine());
//				System.out.println("Introduce el anno de Nacimiento");
//				anno=Integer.valueOf(sc.nextLine());
//
//
//			} catch (Exception e) {
//				System.out.println("Valor invalido");
//			}
//
//		} while (generoIntroducido == null);
		LocalDate fechaNacimiento = null;
//		Persona p = new Persona("Jose", "Vazquez", generoIntroducido,fechaNacimiento.of(anno, mes, dia));
//		System.out.println(p);
		Persona p1 = new Persona("Jose", "Vazquez", Genero.HOMBRE, fechaNacimiento.of(1999, 12, 12));	
		Persona p2 = new Persona("Ayda", "Quintana", Genero.MUJER, fechaNacimiento.of(2000, 04, 24));
		Persona p3 = new Persona("Jose", "Carlos", Genero.HOMBRE, fechaNacimiento.of(2004, 06, 06));
		Persona[] persona=new Persona[3];
		persona[0]=p1;
		persona[1]=p2;
		persona[2]=p3;
		Arrays.sort(persona);
		for(Persona p:persona) {
			if(p!=null) {
				System.out.println(p);
			}
		}




	}

}
