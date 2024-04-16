package ar.edu.unju.fi.ejercicio7.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7.model.Empleado;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Solicitamos al usuario que ingrese los datos por consola
		System.out.println("**** INGRESE LOS DATOS DEL EMPLEADO *****");
		System.out.print("Ingrese nombre del empleado: ");
		String nombre = sc.next();
		System.out.print("Ingrese el legajo: ");
		int legajo = sc.nextInt();
		System.out.print("Ingrese el salario: ");
		double salario = sc.nextDouble();
		Empleado empleado = new Empleado(nombre, legajo, salario);
		empleado.mostrarDatos();
		empleado.aumentoSalario();
		empleado.mostrarDatos();
		
		sc.close();
	}

}
