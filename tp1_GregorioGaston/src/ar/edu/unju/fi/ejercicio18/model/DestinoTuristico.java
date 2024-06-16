package ar.edu.unju.fi.ejercicio18.model;

public class DestinoTuristico {
	
	//Definimos Atributos para la clase
	private String codDestino;
	private String nombreDestino;
	private double precioDestino;
	private Pais pais;
	private short cantidadDias;
	
	//Constructor por defecto
	public DestinoTuristico() {
		super();
	}

	//Constructor Parametrizadp
	public DestinoTuristico(String codDestino, String nombreDestino, double precioDestino, Pais pais,
			short cantidadDias) {
		super();
		this.codDestino = codDestino;
		this.nombreDestino = nombreDestino;
		this.precioDestino = precioDestino;
		this.pais = pais;
		this.cantidadDias = cantidadDias;
	}

	
	//Getters and Setters
	public String getCodDestino() {
		return codDestino;
	}

	public void setCodDestino(String codDestino) {
		this.codDestino = codDestino;
	}

	public String getNombreDestino() {
		return nombreDestino;
	}

	public void setNombreDestino(String nombreDestino) {
		this.nombreDestino = nombreDestino;
	}

	public double getPrecioDestino() {
		return precioDestino;
	}

	public void setPrecioDestino(double precioDestino) {
		this.precioDestino = precioDestino;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public short getCantidadDias() {
		return cantidadDias;
	}

	public void setCantidadDias(short cantidadDias) {
		this.cantidadDias = cantidadDias;
	}

	
	//toString
	@Override
	public String toString() {
		return "CodDestino=" + codDestino + " - nombreDestino=" + nombreDestino + " - precioDestino= $"
				+ precioDestino + " -" + pais + " - tiempo de viaje=" + cantidadDias + " dias";
	}

}
