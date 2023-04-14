package blockNotas.model;

import java.util.Arrays;
import java.util.Objects;

public class Bloc {

	private static final int NUMERO_NOTAS_MAXIMA = 10;
	private int numNotas;
	private String nombre;
	private Nota[] nota = new Nota[NUMERO_NOTAS_MAXIMA];

	public Bloc(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNota(int codigo) {
		String nota = "-1";
		if (encontrarNota(codigo) != null) {
			nota = encontrarNota(codigo).toString();
		}

		return nota;

	}

	public void updateNota(int codigo, String texto) {
		Nota nota = null;
		if(encontrarNota(codigo)!= null) {
			nota = encontrarNota(codigo);
			nota.setTexto(texto);
		}
	
	}

	public void activa(int codigo) {
		NotaAlarma nota = null;
		if(encontrarNota(codigo)!= null) {
			nota = (NotaAlarma) encontrarNota(codigo);
			nota.activar();
		}
	}
	

	public void desactiva(int codigo) {
		NotaAlarma nota = null;
		if(encontrarNota(codigo)!= null) {
			nota = (NotaAlarma) encontrarNota(codigo);
			nota.desactivar();
		}
	}
	

	public static int getNumeroNotasMaxima() {
		return NUMERO_NOTAS_MAXIMA;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "Bloc [numNotas=" + numNotas + ", nombre=" + nombre + ", nota=" + Arrays.toString(nota) + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bloc other = (Bloc) obj;
		return Objects.equals(nombre, other.nombre);
	}

	public Nota encontrarNota(int codigo) {
		Nota nota = null;
		for (int i = 0; i < NUMERO_NOTAS_MAXIMA; i++) {
			if (this.nota != null && this.nota[i].getCodigo() == codigo) {
				this.nota[i] = nota;
			}
		}
		return nota;
	}

	public String ordenaBloc() {
		StringBuilder sb = new StringBuilder();
		Arrays.sort(nota,new OrdenaBloc());
		sb.append(nota);
		return sb.toString();
	}
}
