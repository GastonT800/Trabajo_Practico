package ar.edu.unju.fi.ejercicio2;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Definimos variables
		String pais;
		int edad, telefono;
		double altura, precioProduc, calculo = 0.5, calculoCoseno;
		
		//calculamos el coseno
		calculoCoseno = Math.cos(calculo);
		
		//Pedimos al usuario que ingrese los valores por consola
		System.out.print("Ingrese el nombre de un país: ");
		pais = sc.next();
		System.out.print("Ingrese la edad de una persona: ");
		edad = sc.nextInt();
		System.out.print("Ingrese la altura de un edificio: ");
		altura = sc.nextDouble();
		System.out.print("Ingrese precio de un producto de supermercado: ");
		precioProduc = sc.nextDouble();
		System.out.print("Ingrese un número de teléfono: ");
		telefono = sc.nextInt();
		
		//Mostramos por pantalla
		System.out.println("El nombre de país es: " + pais);
		System.out.println("La edad de una persona es: " + edad);
		System.out.println("La altura de un edificio es: " + altura);
		System.out.println("El preciío de un producto de supermercado es: " + precioProduc);
		System.out.println("El número de teléfono es: " + telefono);
		System.out.println("El cálculo de coseno de 0.5 es: "+ calculoCoseno);
		
		sc.close();
	}

}
