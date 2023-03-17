package Liga;

public class MainEquipo {

	public static void main(String[] args) {
		Equipo local=new Equipo("Betis");
		Equipo visitante=new Equipo("Sevilla");
		
		Partido p1=new Partido(4,local,visitante);
		
		System.out.println(p1.getJornada());
		
		p1.getPonerResultado("2-1");
		System.out.println(p1.getPartidoGanadoLocal());
		System.out.println(p1.getPartidoGanadoVisitante());
		System.out.println(p1.getPartidoEmpate());
		System.out.println(p1.getGolesLocal());
		System.out.println(p1.getGolesVisitante());


	}

}
