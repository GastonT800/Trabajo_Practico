package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
	//Definimos atributos
	private int diametro;
	private int precio;
	private double area;
	private boolean ingredientes;
	
	
	//Constantes
	private static final int ADICIONAL_20 = 500;
	private static final int ADICIONAL_30 = 750;
	private static final int ADICIONAL_40 = 1000;
	
	
	//Constructor por defecto
	public Pizza() {
		super();
	}
	
	
	//Getters and Setters
	public int getDiametro() {
		return diametro;
	}
	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public boolean isIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(boolean ingredientes) {
		this.ingredientes = ingredientes;
	}
	
	//Metodos
	public int calcularPrecio() {
		
		if (diametro < 20) {
			
			this.precio = 4500;
			
		}else  if (ingredientes) {
            	
                this.precio = 4500 + ADICIONAL_20;
                
            } else {
            	
                this.precio = 4500;
                
            }
		
		if(diametro == 30) {
			
			if (ingredientes) {
				
                this.precio = 4800 + ADICIONAL_30;
                
            } else {
            	
                this.precio = 4800;
                
            }
		}
		
		if(diametro == 40) {
			
			if (ingredientes) {
				
                this.precio = 5500 + ADICIONAL_40;
                
            } else {
            	
                this.precio = 5500;
                
            }
		}
		return precio;
		
	}
	
	public double calcularArea() {
		
		double radio = diametro / 2.0;
        this.area = Math.PI * Math.pow(radio, 2);
        
        return area;
		
	}
	
}
