package ar.edu.unju.fi.ejercicio9.model;

public class Producto {
	
	//Atributos de la clase
	private String nombre;
	private int codigo;
	private double precio;
	private int descuento;

	//Constructor por defecto
	public Producto() {
		super();
	}
	
	
	//Getters y Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getDescuento() {
		return descuento;
	}
	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
	
	//Metodos
	public double calcularDescuento() {
		double descuentoProducto = 0;
			
		if((descuento <=50) && (descuento >0)) {
			
			descuentoProducto = precio - ((precio * descuento)/ 100.0);
			
		}else {
			descuentoProducto = precio;
		}
		return descuentoProducto;
	}

}
