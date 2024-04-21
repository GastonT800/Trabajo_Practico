package ar.edu.unju.fi.ejercicio12.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio12.model.Persona;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("***** Ingrese los datos de la persona *****");
        System.out.print("Ingrese el nombre: ");
        String nombre = sc.next();
        System.out.print("Ingrese la fecha de nacimiento (dd/mm/yyyy): ");
        String fechaNacimientoStr = sc.next();
        String[] partesFecha = fechaNacimientoStr.split("/");
        int dia = Integer.parseInt(partesFecha[0]);
        int mes = Integer.parseInt(partesFecha[1]) - 1;
        int anio = Integer.parseInt(partesFecha[2]);

        Calendar fechaNacimiento = new GregorianCalendar(anio, mes,dia);
        Persona persona = new Persona(nombre, fechaNacimiento);
        
        System.out.println("");
        System.out.println("Datos de la persona:");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Fecha nacimiento: " + fechaNacimientoStr);
        System.out.println("Edad: " + persona.cuantosAños() + " años");
        System.out.println("Signo del zodiaco: " + persona.signoZodiacal());
        System.out.println("Estación: " + persona.estacionAnio());
        
        sc.close();
		
	}

}
