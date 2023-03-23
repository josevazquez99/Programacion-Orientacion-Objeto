package parking.model;

import java.util.Scanner;

public class Parking implements Comparable<Vehiculo> {
	Scanner sc = new Scanner(System.in);

	private Vehiculo[] vehiculos;
	private final static int NUMERO_MAXIMO = 50;

	public Parking() {
		super();
		this.vehiculos = new Vehiculo[NUMERO_MAXIMO];
	}

	public boolean entrarParking(Vehiculo vehiculo) {
		boolean aparcado = false;
		for (int i = 0; i < vehiculos.length && !aparcado; i++) {
			if (vehiculos[i] == null) {
				this.vehiculos[i] = vehiculo;
				aparcado = true;
			}
		}
		return aparcado;

	}

	public boolean salirParking(Vehiculo vehiculo) {
		boolean salir = false;
		for (int i = 0; i < vehiculos.length && !salir; i++) {
			if (this.vehiculos[i] != null && vehiculos[i].getMatricula().equals(vehiculo.getMatricula())) {
				salir = true;
				vehiculos[i] = null;
			}
		}
		return salir;

	}

	@Override
	public int compareTo(Vehiculo o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int ordenarMarcaModelo() {
		return 0;

	}

	public int ordenarTipoCombustible() {
		return 0;

	}

	public int ordenarMatricula() {
		return 0;

	}

}
