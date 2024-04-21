package ar.edu.unju.fi.ejercicio12.model;

import java.util.Calendar;

public class Persona {
	//Definimos Atributos
	private String nombre;
	private Calendar fechaNacimiento;
	
	//Constructor por defecto
	public Persona() {
		super();
	}
	
	//Constructor parametrizado
	public Persona(String nombre, Calendar fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	//Getters and Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Calendar getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Calendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	//Metodos
	public int cuantosAños() {
		int edad;
		
		Calendar fechaActual = Calendar.getInstance();
        int anioActual = fechaActual.get(Calendar.YEAR);
        int anioNacimiento = fechaNacimiento.get(Calendar.YEAR);
        edad = anioActual - anioNacimiento;
		
		return edad;
	}
	
	public String signoZodiacal() {
		int mesZodiacal = fechaNacimiento.get(Calendar.MONTH) + 1;
		
        int diaZodiacal = fechaNacimiento.get(Calendar.DAY_OF_MONTH);
        
        if ((mesZodiacal == 3 && diaZodiacal >= 21) || (mesZodiacal == 4 && diaZodiacal <= 20)) {
            	return "Aries";
        } else if ((mesZodiacal == 4 && diaZodiacal >= 21) || (mesZodiacal == 5 && diaZodiacal <= 20)) {
            			return "Tauro";
		        } else if ((mesZodiacal == 5 && diaZodiacal >= 21) || (mesZodiacal == 6 && diaZodiacal <= 21)) {
		            		return "Géminis";
				        } else if ((mesZodiacal == 6 && diaZodiacal >= 22) || (mesZodiacal == 7 && diaZodiacal <= 22)) {
				        			return "Cáncer";
						        } else if ((mesZodiacal == 7 && diaZodiacal >= 23) || (mesZodiacal == 8 && diaZodiacal <= 22)) {
						        			return "Leo";
								        } else if ((mesZodiacal == 8 && diaZodiacal >= 23) || (mesZodiacal == 9 && diaZodiacal <= 22)) {
								        			return "Virgo";
										        } else if ((mesZodiacal == 9 && diaZodiacal >= 23) || (mesZodiacal == 10 && diaZodiacal <= 22)) {
										        			return "Libra";
												        } else if ((mesZodiacal == 10 && diaZodiacal >= 23) || (mesZodiacal == 11 && diaZodiacal <= 21)) {
												            		return "Escorpio";
														        } else if ((mesZodiacal == 11 && diaZodiacal >= 22) || (mesZodiacal == 12 && diaZodiacal <= 21)) {
														            		return "Sagitario";
																        } else if ((mesZodiacal == 12 && diaZodiacal >= 22) || (mesZodiacal == 1 && diaZodiacal <= 19)) {
																            		return "Capricornio";
																		        } else if ((mesZodiacal == 1 && diaZodiacal >= 20) || (mesZodiacal == 2 && diaZodiacal <= 18)) {
																		        			return "Acuario";
																				        } else {
																				        			return "Piscis";
																				        		}
	}
	
	public String estacionAnio() {

		int mes = fechaNacimiento.get(Calendar.MONTH) + 1; 

        if (mes >= 3 && mes <= 5) {
            return "Primavera";
        } else if (mes >= 6 && mes <= 8) {
            		return "Verano";
		        } else if (mes >= 9 && mes <= 11) {
		        			return "Otoño";
				        } else {
				            return "Invierno";
				        }
	}
	
}
