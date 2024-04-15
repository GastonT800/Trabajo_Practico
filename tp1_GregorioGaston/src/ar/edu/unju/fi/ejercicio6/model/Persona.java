package ar.edu.unju.fi.ejercicio6.model;

import java.time.LocalDate;

public class Persona {
	
	private int dni;
	private String nombre;
	private LocalDate fechaNacimiento;
	private String provincia;
	
	//Constructor por defecto
	public Persona() {
		super();
	}
	
	//Constructor parametrizado
	public Persona(int dni, String nombre, LocalDate fechaNacimiento, String provincia) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia = provincia;
	}
	
	//Constructor solo con los campos de dni, nombre y fechaNacimiento
	public Persona(int dni, String nombre, LocalDate fechaNacimiento) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia = "Jujuy";
	}

	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	
	//Metodos
	public int calcularEdad(LocalDate fechaNacimiento ) {
		int edad;
		
		LocalDate fechaActual = LocalDate.now();
		if(fechaNacimiento  != null) {
			edad = fechaActual.getYear()-fechaNacimiento.getYear();
		}else {
			edad = 0;
		}
		return edad;
	}
	
	public boolean esMayorEdad(int edad) {
		boolean esMayor;
		if(edad > 17) {
			esMayor = true;
		}else {
			esMayor = false;
		}
		
		return esMayor;
	}
	
	public void mostrarDatos() {
		int edad = calcularEdad(fechaNacimiento);
		boolean esMayor = esMayorEdad(edad);
		System.out.println("\n LOS DATOS DE LA PERSONA SON: "); 
		System.out.println("El DNI es: " +  dni);
		System.out.println("El nombre es: " + nombre);
		System.out.println("La fecha de nacimiento es: " + fechaNacimiento);
		System.out.println("La provincia es: " + provincia);
		System.out.println("La edad es: " + edad);
		
		if(esMayor) {
			
			System.out.println("Es mayor de edad");
			
		}else {
			
			System.out.println("No es mayor de edad");
		}
		
	}
	

}
