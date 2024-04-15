package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Definimos variables
		int num, factorial=1, i=1;
		
		//Solicitamos al usuario que ingrese un número
		System.out.print("Ingrese un número que este dentro del rango de 0-10: ");
		num = sc.nextInt();
		
		
		if(num<=10 && num>=0) {
			
			if(num == 0) {
				
				System.out.println(num +"! " + "= " +  factorial);
				
			}else {
				factorial = 1 ;
				
				while (i <= num) {
					
					factorial = factorial * i ;
					
					System.out.println(num +"! " + "= " +  factorial);
					i++;
					
				}
			}
			
		}else {
			System.out.println("El número ingresado esta fuera del rango asignado");
		}
		
		sc.close();
	}

}
