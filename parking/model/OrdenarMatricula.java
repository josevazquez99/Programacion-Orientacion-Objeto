package parking.model;

import java.util.Comparator;

public class OrdenarMatricula implements Comparator<Vehiculo>{

	@Override
	public int compare(Vehiculo v1, Vehiculo v2) {
		int resultado=0;
		if(v1!=null && v2!=null) {
			resultado=v1.getMatricula().compareTo(v2.getMatricula());
		}else if(v1==null){
			resultado=1;
		}else if(v2==null) {
			resultado=-1;
		}
		return resultado;

	}

}
