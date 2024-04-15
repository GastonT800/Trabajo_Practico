package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Definimos variables
		int num, numPar, numImpar;
		
		//Solicitamos al usuario por medio de consola que ingrese un Número
		System.out.print("Ingrese un Número: ");
		num = sc.nextInt();
		
		if(num % 2 == 0) {
			
			numPar = num*3;
			
			System.out.println("El número ingresado es par, el triple es: " + numPar);
			
		}else {
			
			numImpar = num*2;
			
			System.out.println("El número ingresado es impar, el doble es: " + numImpar);
		}
		
		
		sc.close();
	}

}
