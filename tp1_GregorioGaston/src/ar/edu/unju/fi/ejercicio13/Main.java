package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int[8];
		int i=0;
		
		System.out.println("***** Debe ingresar 8 números ******");
		
		while (i < numeros.length) {
			
            System.out.print("Ingrese un número: ");
            numeros[i] = sc.nextInt();
            
            i++;
            
        }
		System.out.println("");
		System.out.println("Los números guardados en el Array son: ");
		int j=0;
		int suma=0;
        while (j < numeros.length) {
        	
            System.out.println("Índice: " + j + ", Valor: " + numeros[j]);
            suma = suma + numeros[j];
            j++;
            
        }
        System.out.println("La suma total de los valores es: " + suma);
		
		sc.close();
	}
}
