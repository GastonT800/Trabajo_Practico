package ar.edu.unju.fi.ejercicio6.main;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import ar.edu.unju.fi.ejercicio6.model.Persona;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Creamos el objeto persona
		System.out.println("******INGRESE LOS DATOS DE LA PRIMERA PERSONA******");
		Persona persona = new Persona();
		persona.mostrarDatos();
		
		//Creamos el objeto persona2 con todos los campos del constructor parametrizado
		System.out.println("\n ******INGRESE LOS DATOS DE LA SEGUNDA PERSONA******");
		System.out.print(" Ingrese el DNI: ");
		int dni = sc.nextInt();
		System.out.print("Ingrese el nombre: ");
		String nombre = sc.next();
		System.out.print("Ingrese la fecha de nacimiento en (dd/MM/yyyy): ");
		String fechaNac = sc.next();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaNacimiento = LocalDate.parse(fechaNac, formatter);
		System.out.print("Ingrese provincia: ");
		String provincia = sc.next();
		Persona persona2 = new Persona(dni, nombre, fechaNacimiento, provincia);
		persona2.mostrarDatos();
		
		
		//Creamos el objeto persona3 con el constructor parametrizado sin todos los campos solo con dni, nombre, fecha nacimiento
		System.out.println("\n ******INGRESE LOS DATOS DE LA SEGUNDA PERSONA******");
		System.out.print(" Ingrese el DNI: ");
		dni = sc.nextInt();
		System.out.print("Ingrese el nombre: ");
		nombre = sc.next();
		System.out.print("Ingrese la fecha de nacimiento en (dd/MM/yyyy): ");
		fechaNac = sc.next();
		formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        fechaNacimiento = LocalDate.parse(fechaNac, formatter);
		
		Persona persona3 = new Persona(dni, nombre, fechaNacimiento);
		persona3.mostrarDatos();
		
		sc.close();
		
	}
}