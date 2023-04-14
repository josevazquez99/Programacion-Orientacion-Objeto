package parking.model;

import java.util.Comparator;

public class OrdenarTipoCombustible implements Comparator<Vehiculo>{

	@Override
	public int compare(Vehiculo v1, Vehiculo v2) {
		int resultado=0;
		if(v1!=null && v2!=null) {
			resultado=v1.getCombustible().compareTo(v2.getCombustible());
		}else if(v1==null){
			resultado=1;
		}else if(v2==null) {
			resultado=-1;
		}
		return resultado;
	}

}
