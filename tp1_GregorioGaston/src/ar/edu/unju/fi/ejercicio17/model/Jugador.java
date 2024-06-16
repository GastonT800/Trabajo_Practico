package ar.edu.unju.fi.ejercicio17.model;

import java.time.LocalDate;

public class Jugador {
	
	//se definen los atributos de la clase
	private String nombreJugador;
	private String apellidoJugador;
	private LocalDate fechaNacimiento;
	private String nacionalidadJugador;
	private Double estaturaJugador;
	private Double pesoJugador;
	private String posicionJugador;
	
	//Constructor por defecto
	public Jugador() {
		super();
	}

	//Constructor Parametrizado
	public Jugador(String nombreJugador, String apellidoJugador, LocalDate fechaNacimiento, String nacionalidadJugador,
			Double estaturaJugador, Double pesoJugador, String posicionJugador) {
		super();
		this.nombreJugador = nombreJugador;
		this.apellidoJugador = apellidoJugador;
		this.fechaNacimiento = fechaNacimiento;
		this.nacionalidadJugador = nacionalidadJugador;
		this.estaturaJugador = estaturaJugador;
		this.pesoJugador = pesoJugador;
		this.posicionJugador = posicionJugador;
	}

	
	//Getters and Setters
	public String getNombreJugador() {
		return nombreJugador;
	}

	public void setNombreJugador(String nombreJugador) {
		this.nombreJugador = nombreJugador;
	}

	public String getApellidoJugador() {
		return apellidoJugador;
	}

	public void setApellidoJugador(String apellidoJugador) {
		this.apellidoJugador = apellidoJugador;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNacionalidadJugador() {
		return nacionalidadJugador;
	}

	public void setNacionalidadJugador(String nacionalidadJugador) {
		this.nacionalidadJugador = nacionalidadJugador;
	}

	public Double getEstaturaJugador() {
		return estaturaJugador;
	}

	public void setEstaturaJugador(Double estaturaJugador) {
		this.estaturaJugador = estaturaJugador;
	}

	public Double getPesoJugador() {
		return pesoJugador;
	}

	public void setPesoJugador(Double pesoJugador) {
		this.pesoJugador = pesoJugador;
	}

	public String getPosicionJugador() {
		return posicionJugador;
	}

	public void setPosicionJugador(String posicionJugador) {
		this.posicionJugador = posicionJugador;
	}

	//toString
	@Override
	public String toString() {
		return "Datos del Jugador: nombreJugador=" + nombreJugador + ", apellidoJugador=" + apellidoJugador + ", fechaNacimiento="
				+ fechaNacimiento + ", nacionalidadJugador=" + nacionalidadJugador + ", estaturaJugador="
				+ estaturaJugador + ", pesoJugador=" + pesoJugador + ", posicionJugador=" + posicionJugador ;
	}
	
	//Metodos
	public int calcularEdad() {
		int edad=0;
		
		LocalDate fechaActual = LocalDate.now();
		if(fechaActual.isAfter(fechaNacimiento)) {
			edad = fechaActual.getYear()-fechaNacimiento.getYear();
		}
		return edad;
	}
}
