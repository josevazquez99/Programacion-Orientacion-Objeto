package blockNotas.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Nota implements Comparable<Nota>{
	
	private static int codigoSiguiente=0;
	private int codigo;
	private String texto;
	private LocalDateTime fechaCreacion;
	private LocalDateTime fechaUltimaModificacion;
	
	public Nota(String texto) {
		super();
		this.texto = texto;
		this.codigoSiguiente++;
		this.codigo=codigoSiguiente;
		this.fechaCreacion=LocalDateTime.now();
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public int getCodigo() {
		return codigo;
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	public LocalDateTime getFechaUltimaModificacion() {
		return fechaUltimaModificacion;
	}
	
	public boolean isModificado() {
		boolean modificado=false;
		if(!fechaCreacion.equals(fechaUltimaModificacion)) {
			modificado=true;
		}return modificado;
	}
	public boolean isEmpty() {
		boolean vacio=false;
		if(texto.isEmpty()) {
			vacio=true;
		}return vacio;
	}
	public boolean isCreadoAnterior(Nota n) {
		return this.fechaCreacion.compareTo(n.getFechaCreacion())>0;

	}
	public boolean isModificadoAnterior(Nota n) {
		return this.fechaUltimaModificacion.compareTo(n.getFechaUltimaModificacion())>0;
	
	}

	@Override
	public int hashCode() {
		return Objects.hash(fechaCreacion, texto);
	}

	@Override
	public boolean equals(Object obj) {
	boolean iguales=this==obj;
		if (this == obj && obj!=null && obj instanceof Nota) {
		Nota other = (Nota) obj;
		iguales= Objects.equals(fechaCreacion, other.fechaCreacion) && Objects.equals(texto, other.texto);}
		return iguales;
	}

	@Override
	public String toString() {
		return "Nota [codigo=" + codigo + ", texto=" + texto + ", fechaCreacion=" + fechaCreacion
				+ ", fechaUltimaModificacion=" + fechaUltimaModificacion + "]";
	}

	@Override
	public int compareTo(Nota o) {
		return this.texto.compareTo(o.getTexto());
	}
	
	
	
	
	
	


}
