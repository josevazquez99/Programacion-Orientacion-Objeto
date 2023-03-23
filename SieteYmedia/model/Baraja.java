package SieteYmedia.model;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Baraja {
	
	private  int numCartas;
	protected  int siguiente;
	private Carta[] cartas;
	private static final int NUMCARTAS=40;
	
	
	public Baraja() {
		this.siguiente=0;
		this.cartas=new Carta[NUMCARTAS];
		int posicion=0;
		
		for(Palo palo: Palo.values()) {// recorremos palos
			for (int i=1 ;i<13;i++) {//recorremos valores
				if(i!=8 && i!=9) {// limitamos a valores validos
					try {
						this.cartas[posicion++]=new Carta(i,palo);//creamos carta asignando posicion
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}}
		}

	

	
	public void barajar() {
		int tmpPosicionAnterior=0;
		int tmpPosicionSiguiente=0;
		Carta tmpCartaSiguiente=null;
		Carta tmpCartaAnterior=null;
		for(int i=0;i<cartas.length;i++) {
			tmpPosicionAnterior=ThreadLocalRandom.current().nextInt(0,NUMCARTAS);
			tmpCartaAnterior=this.cartas[tmpPosicionAnterior];
			
			tmpPosicionSiguiente=ThreadLocalRandom.current().nextInt(0,NUMCARTAS);
			tmpCartaSiguiente=this.cartas[tmpPosicionSiguiente];
			
			this.cartas[tmpPosicionAnterior]=tmpCartaSiguiente;
			this.cartas[tmpPosicionSiguiente]=tmpCartaSiguiente;

			
		}


	}
	
	public Carta getSiguiente() {
		return this.cartas[siguiente++];
	}

	private Palo generarPalo() {
		
		int palo=new Random().nextInt(Palo.values().length);
		return Palo.values()[palo];
		
	}
	private int generarNumero() {
		return ThreadLocalRandom.current().nextInt(0,NUMCARTAS);

	}

	@Override
	public String toString() {
		return "Baraja [cartas=" + Arrays.toString(cartas) + "]";
	}
	
	
	

}
