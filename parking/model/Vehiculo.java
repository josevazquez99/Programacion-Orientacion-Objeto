package parking.model;

import java.time.LocalDateTime;
import java.util.Comparator;

public class Vehiculo {
	
	private String marca;
	private String modelo;
	private  String matricula;
	private Combustible combustible;
	private LocalDateTime fechaEntrada;
	private Tipo tipoCoche;
	
	public Vehiculo(String marca, String modelo, String matricula, Combustible combustible, LocalDateTime fechaEntrada,
			Tipo tipoCoche) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.combustible = combustible;
		this.fechaEntrada = fechaEntrada;
		this.tipoCoche = tipoCoche;
		comprobarMatricula(matricula);
	}
	
	private boolean comprobarMatricula(String matricula) {
		boolean correcta=false;
		int contNumero=0;
		if(matricula.length()==8) {
			for(int i=0;i<matricula.length();i++) {
				if(Character.isDigit(matricula.charAt(i))) {
					contNumero++;
				}
			}
			}if(contNumero==4) {
				correcta=true;
		}return correcta;
	}
	

	public String getMatricula() {
		return matricula;
	}

	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula + ", combustible="
				+ combustible + ", fechaEntrada=" + fechaEntrada + ", tipoCoche=" + tipoCoche + "]";
	}
	


	

	
	

}
