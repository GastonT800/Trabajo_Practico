package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Definimos variables
		int i=1;
		
		while(i<=3) {
			
			System.out.println("********************************************************");
			System.out.println("Ingrese los datos del producto");
			Producto producto = new Producto();
			
			System.out.print("Ingrese nombre del producto: ");
            producto.setNombre(sc.next());
            System.out.print("Ingrese código del producto: ");
            producto.setCodigo(sc.nextInt());
            System.out.print("Ingrese precio del producto: ");
            producto.setPrecio(sc.nextDouble());
            System.out.print("Ingrese descuento del producto entre 0 y 50: ");
            producto.setDescuento(sc.nextInt());
		
			System.out.println("Datos del producto ingresado");
			System.out.println("Nombre: " + producto.getNombre());
			System.out.println("Codigo: "+ producto.getCodigo());
			System.out.println("Precio final: " + producto.calcularDescuento());
			System.out.println("********************************************************");
			i++;
		}
		
		sc.close();
	}

}
