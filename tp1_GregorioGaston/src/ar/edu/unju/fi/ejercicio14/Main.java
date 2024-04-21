package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int valor;
		
		Scanner sc = new Scanner(System.in);
		
		//System.out.println("Ingrese un numero entre 3 y 10: ");
		//valor = sc.nextInt();
		
		 do {
	            System.out.println("Ingrese un numero entre 3 y 10: ");
	            valor = sc.nextInt();
	            
	        } while (valor < 3 || valor > 10);
		 
		 
		//	if (valor>=3 && valor<=10) {
				
				int[] numeros = new int[valor];
				int i=0;
				
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
				
				
			/*}else {
				System.out.println("Ingresaste un número incorrecto");
				System.out.println("--------------------------------------");
				System.out.println("Ingrese un numero entre 3 y 10: ");
				valor = sc.nextInt();
			}*/

		//}while (valor < 3 || valor > 10);
		sc.close();

	}

}
