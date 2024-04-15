package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new  Scanner(System.in);
		
		//Definimos variables
		int resultado;
		
		System.out.print("Ingrese un numero: ");
		int num = sc.nextInt();
		
		if(num >0 && num <10) {
			
			 for(int i=0; i<=10; i++) {
				 resultado= num * i;
				 System.out.println(num + " x " + i + " = " + resultado);
			 }
		}else {
			System.out.println("El numero ingresado esta fuera del rango asignado");
		}
		
		sc.close();
	}

}
