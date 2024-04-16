package ar.edu.unju.fi.ejercicio8.model;

public class CalculadoraEspecial {
	
	//Atributos
	private int n;
	
	
	//Constructor por defecto
	public CalculadoraEspecial() {
		super();
	}
	

	//Getters y Setters
	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	//Metodos
	public double calcularSumatoria(int n) {
		double sumatoria = 0;
		
		for(int k=1; k<=n; k++ ) {
			
			sumatoria = sumatoria + Math.pow((k * (k + 1)) / 2.0 , 2);
			
		}
		return sumatoria;
	}
	
	public double calcularProductoria(int n) {
		double productoria = 0;
		
			for(int k=1; k<=n; k++) {
				
				productoria = productoria + (k*(k+4));
				
			}
		
		return productoria;
	}

}
