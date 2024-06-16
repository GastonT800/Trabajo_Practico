package ar.edu.unju.fi.ejercicio18.model;

public class Pais {
	
	//Definimos los atributos para la clase
	private String codPais;
	private String nombrePais;
	
	//Constructor por defecto
	public Pais() {
		super();
	}

	//Constructor Parametrizado
	public Pais(String codPais, String nombrePais) {
		super();
		this.codPais = codPais;
		this.nombrePais = nombrePais;
	}

	
	//Getters and Setters
	public String getCodPais() {
		return codPais;
	}

	public void setCodPais(String codPais) {
		this.codPais = codPais;
	}

	public String getNombrePais() {
		return nombrePais;
	}

	public void setNombrePais(String nombrePais) {
		this.nombrePais = nombrePais;
	}

	
	//toString
	@Override
	public String toString() {
		return "Pais : codPais=" + codPais + ", nombrePais=" + nombrePais;
	}
	
	
}
