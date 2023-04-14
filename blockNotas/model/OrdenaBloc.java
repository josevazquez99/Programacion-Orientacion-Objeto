package blockNotas.model;

import java.util.Comparator;

public class OrdenaBloc implements Comparator<Nota>{

	@Override
	public int compare(Nota o1, Nota o2) {
		int resultado=0;
		if(o1!=null && o2!=null) {
			resultado=o1.getCodigo()-o2.getCodigo();
		}else if(o1==null) {
			resultado=1;
		}else if(o2==null) {
			resultado=-1;
		}
		return resultado;
	}

}
