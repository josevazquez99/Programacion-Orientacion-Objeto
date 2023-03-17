package Liga;

import java.util.Objects;

public class Equipo {

	private String equipo;

	public Equipo(String equipo) {
		super();
		this.equipo = equipo;
	}

	public String getEquipo() {
		return equipo;
	}

	public String toString() {
		return "Equipo [equipo=" + equipo + "]";
	}
	public boolean equals(Object obj) {
		boolean resultado;
		if (this == obj)
			resultado= true;
		if (obj == null)
			resultado= false;
		if (getClass() != obj.getClass())
			resultado= false;
		Equipo other = (Equipo) obj;
		resultado= Objects.equals(equipo, other.equipo);
		return resultado;
	}
	

}
