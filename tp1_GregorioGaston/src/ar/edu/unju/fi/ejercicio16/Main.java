package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String[] nombres = new String[5];
		System.out.println("**** Debe ingresar nombres para guardarlo en el Array ******");
		
		for (int i = 0; i < nombres.length; i++) {
			
            System.out.print("Ingresa un nombre: ");
            nombres[i] = sc.next();
        }
		
		System.out.println("");
		System.out.println("Los valores guardados en el Array son: ");
		int j=0;
		
        while (j < nombres.length) {
        	
            System.out.println("Índice: " + j + ", Valor: " + nombres[j]);
            
            j++;
            
        }
        System.out.println("");
		System.out.println("El tamaño del Array es: " + nombres.length);
		
		byte indice;
		System.out.println("");
        do {
        	
            System.out.print("Ingresa un indice que este dentro del rango 0 - 4 para eliminar del arreglo: ");
            indice = (sc.nextByte());
            
        } while (indice < 0 || indice >= nombres.length);
        
        
        int i = indice ;
        while (i < nombres.length - 1) {
        	
            nombres[i] = nombres[i + 1];
            i++;
            
        }
        nombres[nombres.length - 1] = "";
        
        System.out.println("");
		System.out.println("Los valores actualizados en el Array son: ");
		int k=0;
		
        while (k < nombres.length) {
        	
            System.out.println("Índice: " + k + ", Valor: " + nombres[k]);
            
            k++;
            
        }

        
		sc.close();
	}

}
