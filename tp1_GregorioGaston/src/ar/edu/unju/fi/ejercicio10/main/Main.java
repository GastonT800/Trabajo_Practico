package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Definimos variables
		int i=1;
				
		while(i<=3) {
					
			System.out.println("********************************************************");
			System.out.println("Ingrese los datos para la  pizza");
			Pizza pizza = new Pizza();
					
			System.out.print("Ingrese el diametro permitido entre 20, 30 y 40: ");
			pizza.setDiametro(sc.nextInt());
		    System.out.print("Desea agregar ingredientes especiales? true/false: ");
		    pizza.setIngredientes(sc.nextBoolean());
				
		    System.out.println("** Pizaa " + i + " **");
		    System.out.println("Diametro = " + pizza.getDiametro());
		    System.out.println("Ingredientes especiales = " +  pizza.isIngredientes());
		    System.out.println("Precio Pizza = " + pizza.calcularPrecio() + "$");
		    System.out.println("Area de la pizza = " +  pizza.calcularArea());
		    System.out.println("********************************************************");
		    
		    i++;
		}
		
		sc.close();
	}

}
