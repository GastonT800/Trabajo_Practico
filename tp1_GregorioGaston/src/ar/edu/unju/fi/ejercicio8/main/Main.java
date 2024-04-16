package ar.edu.unju.fi.ejercicio8.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Solicitamos al usuario que ingrese un número por consola
		System.out.print("Ingrese un número: ");
		int n = sc.nextInt();
		CalculadoraEspecial calculadora = new CalculadoraEspecial();
		
		System.out.println("La sumatoria de " + n + " es: " + calculadora.calcularSumatoria(n));
		System.out.println("La productoria de " + n + " es: " +calculadora.calcularProductoria(n));
		
		sc.close();
		
	}

}
