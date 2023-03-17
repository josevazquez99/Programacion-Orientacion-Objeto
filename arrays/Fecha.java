package arrays;

import java.util.Arrays;

public class Fecha {

	private int dia;
	private int mes;
	private int anno;



	
	public Fecha(int dia, int mes, int anno) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.anno = anno;
	}

	public String toString() {
		return "La fecha en formato largo es " + dia + " de " + numeroMes(mes) + " de " + anno + "";
	}
	
	public int diasMes(int mes) {
		int[] dias = {31,28,31,30,31,30,31,31,30,31,30,31};
		int resultado=-1;
		if(mes>=1 && mes<=12) {
			resultado=dias[mes-1];
		}return resultado;
		
		
		
	}
	public static String numeroMes(int numeroMes) {

		String[] meses = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};

		String mes = "-1";

		if(numeroMes >= 1 && numeroMes <= 12) {

		mes = meses[numeroMes-1];

		}

		return mes;

		}


}

