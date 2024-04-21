package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int valor;
		
		Scanner sc = new Scanner(System.in);
		
		
		 do {
	            System.out.print("Ingrese una cantidad de nombres que este entre 5 y 10: ");
	            valor = sc.nextInt();
	            
	        } while (valor < 5 || valor > 10);
				
				String[] nombres = new String[valor];
				int i=0;
				
				while (i < nombres.length) {
					
		            System.out.print("Ingrese un nombre: ");
		            nombres[i] = sc.next();
		            
		            i++;
		            
		        }
				System.out.println("");
				System.out.println("Los nombres guardados en el Array empezando por el indice 0: ");
				int j=0;
				
		        while (j < nombres.length) {
		        	
		            System.out.println("Índice: " + j + ", Valor: " + nombres[j]);
		            
		            j++;
		            
		        }
		        
		        System.out.println("");
				System.out.println("Los nombres guardados en el Array empezando por la ultima posicion: ");
				int k = nombres.length -1;
				
		        while (k>=0) {
		        	
		            System.out.println("Índice: " + k + ", Valor: " + nombres[k]);
		            
		            k--;
		            
		        }
		 sc.close();
	}

}
