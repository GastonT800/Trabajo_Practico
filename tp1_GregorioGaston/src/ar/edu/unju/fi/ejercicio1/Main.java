package ar.edu.unju.fi.ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//System.out.println("Hola Mundo");
		
		Scanner sc = new Scanner(System.in);
		
		//Definimos variables a usar
		int num1, num2, num3, num4, num5;
		double promedio;
		
		// Pedimos al usuario que ingrese los valores eh asignamos a las variables ya inicializadas
		System.out.print("Ingrese valor del primer número: ");
		num1 = sc.nextInt();
		System.out.print("Ingrese valor del segundo número: ");
		num2 = sc.nextInt();
		System.out.print("Ingrese valor del tercer número: ");
		num3 = sc.nextInt();
		System.out.print("Ingrese valor del cuarto número: ");
		num4 = sc.nextInt();
		System.out.print("Ingrese valor del quinto número: ");
		num5 = sc.nextInt();
		
		//Sacamos el promedio de los valores
		promedio = (num1 + num2 + num3 + num4 + num5)/5.0;
		
		//Mostramos por pantalla el valor de promedio
		System.out.print("El promedio es: " + promedio);
		
		sc.close();
	}

}
