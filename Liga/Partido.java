package Liga;

public class Partido {

	private int jornada;
	private String resultado;
	private String resultadoQuiniela;
	private Equipo local;
	private Equipo visitante;
	private int golesLocal;
	private int golesVisitante;
	private int partidoGanadoLocal;
	private int partidoGanadoVisitante;
	private int partidoEmpate;
	


	
	public Partido(int jornada,Equipo local, Equipo visitante) {
		super();
		this.jornada = jornada;
		this.local = local;
		this.visitante = visitante;
	}
	

	public String getResultadoQuiniela() {
		return resultadoQuiniela;
	}


	public void setResultadoQuiniela(String resultadoQuiniela) {
		this.resultadoQuiniela = resultadoQuiniela;
	}


	public int getGolesLocal() {
		return golesLocal;
	}


	public void setGolesLocal(int golesLocal) {
		this.golesLocal = golesLocal;
	}


	public int getGolesVisitante() {
		return golesVisitante;
	}


	public void setGolesVisitante(int golesVisitante) {
		this.golesVisitante = golesVisitante;
	}


	public int getPartidoGanadoLocal() {
		return partidoGanadoLocal;
	}


	public void setPartidoGanadoLocal(int partidoGanadoLocal) {
		this.partidoGanadoLocal = partidoGanadoLocal;
	}


	public int getPartidoGanadoVisitante() {
		return partidoGanadoVisitante;
	}


	public void setPartidoGanadoVisitante(int partidoGanadoVisitante) {
		this.partidoGanadoVisitante = partidoGanadoVisitante;
	}


	public int getPartidoEmpate() {
		return partidoEmpate;
	}


	public void setPartidoEmpate(int partidoEmpate) {
		this.partidoEmpate = partidoEmpate;
	}


	public int getJornada() {
		return jornada;
	}


	public Equipo getLocal() {
		return local;
	}


	public Equipo getVisitante() {
		return visitante;
	}



	public void getPonerResultado(String resultado) {
		if((Character.isDigit(resultado.charAt(0)) && Character.isDigit(resultado.charAt(2)) && resultado.charAt(1) == '-')) {
		this.golesLocal = Integer.valueOf(resultado.substring(0,0+1));
		this.golesVisitante = Integer.valueOf(resultado.substring(2,2+1));
		this.resultado= resultado;
		}
		if (resultado.charAt(0) > resultado.charAt(2)) {
			this.partidoGanadoLocal++;
		} else if (resultado.charAt(0) < resultado.charAt(2)) {
			this.partidoGanadoVisitante++;

		}if(resultado.equalsIgnoreCase("x")) {
			this.partidoEmpate++;
			
		}

	}


	
	public String toString() {
		return "Partido [jornada=" + jornada + ", resultadoQuiniela=" + resultadoQuiniela + ", local=" + local
				+ ", visitante=" + visitante + ", golesLocal=" + golesLocal + ", golesVisitante=" + golesVisitante
				+ ", partidoGanadoLocal=" + partidoGanadoLocal + ", partidoGanadoVisitante=" + partidoGanadoVisitante
				+ ", partidoEmpate=" + partidoEmpate + "]";
	}
	
	
}
