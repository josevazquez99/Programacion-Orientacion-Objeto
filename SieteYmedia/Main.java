package SieteYmedia;

import java.util.Scanner;

import SieteYmedia.model.Baraja;
import SieteYmedia.model.Carta;
import SieteYmedia.model.Palo;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Baraja b = new Baraja();
		b.barajar();
		System.out.println("Ya esta barajada");
		String eleccion = null;
		double valorJugador = 0.0;
		double valorBanca = 0.0;
		do {
			System.out.println("¿Quieres cartas jugador? s/n:");
			eleccion = sc.nextLine().toLowerCase();
			if (eleccion.equals("s")) {
				Carta carta = b.getSiguiente();
				System.out.println(carta);
				valorJugador += carta.getValor();
			}
			if (valorJugador > 7.5) {
				eleccion = "n";
				System.out.println("Te has pasado");
			}
		} while (eleccion.equals("s"));
		do {
			System.out.println("¿Quieres cartas banca? s/n:");
			eleccion = sc.nextLine().toLowerCase();
			if (eleccion.equals("s")) {
				Carta carta = b.getSiguiente();
				System.out.println(carta);
				valorBanca += carta.getValor();
			}
			if (valorBanca > 7.5) {
				eleccion = "n";
			}
		} while (eleccion.equals("s"));
		
		if (valorJugador == valorBanca) {
			System.out.println("Gana Banca");
		} else if (valorBanca > 7.5 && valorJugador < 7.5) {
			System.out.println("Gana Jugador 1");
		} else if (valorBanca < 7.5 && valorJugador > 7.5) {
			System.out.println("Gana Banca");
		} else {
			System.out.println("Gana Banca");
		}

	}

}
