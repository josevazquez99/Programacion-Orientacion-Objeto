package parking.model;

import java.util.Arrays;
import java.util.Scanner;

public class Parking{
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

	

	public String ordenarMarcaModelo() {
		Arrays.sort(this.vehiculos,new OrdenarMarcaModelo());
		return Arrays.toString(vehiculos);
	}

	public String ordenarTipoCombustible(Vehiculo v1,Vehiculo v2) {
		Arrays.sort(this.vehiculos,new OrdenarTipoCombustible());
		return Arrays.toString(vehiculos);
		
	}

	public String ordenarMatricula(Vehiculo v1,Vehiculo v2) {
		Arrays.sort(this.vehiculos,new OrdenarMatricula());
		return Arrays.toString(vehiculos);

	}
	public String ordenarFehca(Vehiculo v1,Vehiculo v2) {
		Arrays.sort(vehiculos);
		return Arrays.toString(vehiculos);

	}	

	
}
