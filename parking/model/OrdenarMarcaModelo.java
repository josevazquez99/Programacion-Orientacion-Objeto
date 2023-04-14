package parking.model;

import java.util.Comparator;

public  class OrdenarMarcaModelo implements Comparator<Vehiculo>{


	public int compare(Vehiculo v1,Vehiculo v2) {
		int resultado=0;
		if(v1!=null && v2!=null) {
			resultado=v1.getMarca().compareTo(v2.getMarca()) + v1.getModelo().compareTo(v2.getModelo());
		}else if(v1==null){
			resultado=1;
		}else if(v2==null) {
			resultado=-1;
		}
		return resultado;
	}
	

}
