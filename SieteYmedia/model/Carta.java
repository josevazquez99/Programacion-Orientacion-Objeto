package SieteYmedia.model;

import java.util.Comparator;
import java.util.Objects;

public class Carta implements Comparable<Carta>,Comparator<Carta>{

	private int number;
	private Palo palo;

	public Carta(int number, Palo palo) throws Exception {
		super();
		if(number<1 || number>12 || number ==8 || number ==9) {
			throw new Exception("Valor no valido");
		}
		this.number = number;
		this.palo = palo;
	}

	public double getValor() {
		return this.number >9 ? 0.5 :this.number;
	
	}

	@Override
	public int hashCode() {
		return Objects.hash(number);
	}

	@Override
	public boolean equals(Object obj) {
		boolean iguales = this == obj;
		if (this == obj && obj != null && obj instanceof Carta) {
			Carta other = (Carta) obj;
			iguales = number == other.number && Objects.equals(palo, other.palo);
		}
		return iguales;
	}

	public int getNumber() {
		return number;
	}



	public Palo getPalo() {
		return palo;
	}

	@Override
	public String toString() {
		return "Carta [numero=" + number + ", palo=" + palo + "]";
	}

	@Override
	public int compareTo(Carta o) {
		return o.number=(number);

	}

	@Override
	public int compare(Carta o1, Carta o2) {
		return o1.palo.compareTo(o2.palo);
	}
	
	
	

}
