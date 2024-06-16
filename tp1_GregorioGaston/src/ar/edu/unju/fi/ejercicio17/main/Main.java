package ar.edu.unju.fi.ejercicio17.main;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.Jugador;

public class Main {

	public static void main(String[] args) {

		//importamos la clase de tipo Scanner
		Scanner escaner = new Scanner(System.in);
		
		List<Jugador> jugadores = new ArrayList<>();
		
		int opcion;
		try {
			do {
				System.out.println("\n****************************");
				System.out.println("********* MENU *************");
				System.out.println("1- Alta de jugador");
				System.out.println("2- Mostrar los datos del jugador");
				System.out.println("3- Mostrar todos los jugadores ordenados por apellido");
				System.out.println("4- Modificar los datos de un jugador");
				System.out.println("5- Eliminar un jugador");
				System.out.println("6- Mostrar la cantidad total de jugadores que tiene el ArrayList");
				System.out.println("7- Mostrar la cantidad de jugadores que pertenecen a una nacionalidad");
				System.out.println("8- Salir");
				
				try {
					System.out.print("\nSeleccione una opcion: ");
					opcion = escaner.nextInt();
					escaner.nextLine();
				}catch(Exception e) {
		        	System.out.println("\nDebe de Ingresar un Número para que la OPCION sea Valida");
		        	escaner.nextLine();
					opcion = 0;
		        }
				
				switch (opcion) {
				case 1:
					try {
						Jugador nuevoJugador = new Jugador();
						System.out.println("\n*** Alta de jugador ***");
			       	 	System.out.print("Ingrese nombre del jugador: ");
			            nuevoJugador.setNombreJugador(escaner.nextLine());
			            System.out.print("Ingrese apellido del jugador: ");
			            nuevoJugador.setApellidoJugador(escaner.nextLine());
			            System.out.println("Acontinuacion ingrese su fecha de nacimiento en orden");
			            System.out.print("Ingrese su dia: ");
			            int dia = escaner.nextInt();
			            System.out.print("Ingrese el mes: ");
			            int mes = escaner.nextInt();
			            System.out.print("Ingrese el año: ");
			            int anio = escaner.nextInt();
			            nuevoJugador.setFechaNacimiento(LocalDate.of(anio,mes,dia));
			            escaner.nextLine();
			            System.out.print("Ingrese la nacionalidad: ");
						nuevoJugador.setNacionalidadJugador(escaner.nextLine());
						System.out.print("Ingrese la estatura: ");
		                nuevoJugador.setEstaturaJugador(escaner.nextDouble());
		                System.out.print("Ingrese el peso: ");
		                nuevoJugador.setPesoJugador(escaner.nextDouble());
		                escaner.nextLine();
		                System.out.print("Ingrese posicion: ");
		                nuevoJugador.setPosicionJugador(escaner.nextLine());
		                
		                jugadores.add(nuevoJugador);
		                System.out.println("\nEl alta del jugador fue cargado correctamente");
		                
						
					} catch (InputMismatchException e) {
                        System.out.println("Error, tiene que ingresar un valor válido");
                        escaner.nextLine();
                    } catch (DateTimeException e) {
                        System.out.println("Error a la hora de ingresar la Fecha de nacimiento inválida");
                        escaner.nextLine();
                        
                    }
					
					
	                break;
				
				case 2:
					
					if(jugadores.isEmpty()) {
	 					
						System.out.println("\nLa lista se encuentra vacia");
	 					System.out.println("\nPara mostrar los datos de jugadores primero tiene que dar de alta un jugador");
	 					
	 				}else {
	 					
	 					System.out.println("\n*** Lista de jugadores ***");
	 					
	 					for (Jugador jugador : jugadores) {
		                	 
		                    System.out.println("\n1 - Jugador " + jugador.getNombreJugador() + " " + jugador.getApellidoJugador());
		                }
	 					System.out.println("\nPara mostrar los datos de un jugador debe de ingresar el nombre y el apellido");
	 	            	 
		                System.out.print("\nIgrese nombre del Jugador: ");
		     			String nombre = escaner.nextLine();
		     			System.out.print("\nIgrese apellido del Jugador: ");
		     			String apellido = escaner.nextLine();
		     			boolean jugadorEncontrado = false;
		     			
		     			for (Jugador jugador : jugadores) {
		     				
		     	            if (jugador.getNombreJugador().equalsIgnoreCase(nombre) && jugador.getApellidoJugador().equalsIgnoreCase(apellido)) {
		     	                System.out.println("\n*** Datos del Jugador ***");
		     	                System.out.println(jugador);
		     	                jugadorEncontrado = true;
		     	                break;
		     	            }
		     	        }
		     	        if (!jugadorEncontrado) {
		     	            System.out.println("\nNo se encontró ningún jugador con ese nombre y apellido.");
		     	        }
	 				}
					
					break;
					
				case 3:
					
					if (jugadores.isEmpty()) {
						
						System.out.println("\nLa lista se encuentra vacia");
				        System.out.println("\nNo es posible mostar los los datos de jugadores");
				    
					} else {
	
						System.out.println("\nJugadores ordenados por apellido");
						jugadores.sort(Comparator.comparing(Jugador::getApellidoJugador));
						jugadores.forEach(jug->System.out.println(jug));
				    }
					
					break;
					
				case 4:
					
					if(jugadores.isEmpty()) {
	 					
						System.out.println("\nLa lista se encuentra vacia");
						System.out.println("\nPara modificar los datos de un jugador primero tiene que dar de alta un jugador");
	 					
	 				}else {
	 					try {
	 						
	 						System.out.println("\n*** Lista de jugadores ***");
		 					int i =0;
		 					for (Jugador jugador : jugadores) {
			                	 i+=1;
			                    System.out.println("\nJugador " + i + " - "+ jugador.getNombreJugador() + " " + jugador.getApellidoJugador());
			                }
		
		 					System.out.println("\nPara mostrar los datos de un jugador debe de ingresar el nombre y el apellido");
		 					
			                System.out.print("\nIgrese nombre del Jugador: ");
			     			String nombre = escaner.nextLine();
			     			System.out.print("\nIgrese apellido del Jugador: ");
			     			String apellido = escaner.nextLine();
			     			boolean jugadorEncontrado = false;
			     			
			     			for (Jugador jugador : jugadores) {
			     				
			     	            if (jugador.getNombreJugador().equalsIgnoreCase(nombre) && jugador.getApellidoJugador().equalsIgnoreCase(apellido)) {
			     	            	
			     	                System.out.println("\n*** Datos del Jugador ***");
			     	                System.out.println("\n1-Nombre : " + jugador.getNombreJugador() );
			     	                System.out.println("\n2- Apellido : " + jugador.getApellidoJugador());
			     	                System.out.println("\n3- Fecha de Nacimiento : " + jugador.getFechaNacimiento() );
			     	                System.out.println("\n4- Nacionalidad: " + jugador.getNacionalidadJugador());
			     	                System.out.println("\n5- Estatura : " + jugador.getEstaturaJugador());
			     	                System.out.println("\n6- Peso : " + jugador.getPesoJugador());
			     	                System.out.println("\n7- Posicion : " + jugador.getPosicionJugador());
			     	                
			     	                System.out.println("\nElija una opcion para modificar");
			     	                int ops = escaner.nextInt();
				     	        	escaner.nextLine();
				     	        	switch (ops) {
				     	        		
					     	        	case 1:
					     	        		
					     	        		System.out.print("Ingrese nombre del jugador: ");
					     		            jugador.setNombreJugador(escaner.nextLine());
					     		            System.out.println("\nEl nombre fue modificado con exito!");
					     		            
					     	        		break;
					     	        		
					     	        	case 2:
					     	        		
					     	        		System.out.print("Ingrese apellido del jugador: ");
					     		            jugador.setApellidoJugador(escaner.nextLine());
					     		            System.out.println("\nEl apellido fue modificado con exito!");
					     		            
					     	        		break;
					     	        		
					     	        	case 3:
					     	        		
					     	        		System.out.println("\nAcontinuacion ingrese su fecha de nacimiento en orden");
					     		            System.out.print("Ingrese su dia: ");
					     		            int dia = escaner.nextInt();
					     		            System.out.print("Ingrese el mes: ");
					     		            int mes = escaner.nextInt();
					     		            System.out.print("Ingrese el año: ");
					     		            int anio = escaner.nextInt();
					     		            jugador.setFechaNacimiento(LocalDate.of(anio,mes,dia));
					     		            escaner.nextLine();
					     		            System.out.println("\nLa fecha de Nacimiento fue modificado con exito!");
					     	        		break;
		
					     	        	case 4:
					     	        		
					     	        		System.out.print("Ingrese nacionalidad: ");
					     					jugador.setNacionalidadJugador(escaner.nextLine());
					     	        		System.out.println("\nLa nacionalidad fue modificado con exito!");
					     	        		
					     	        		break;
					     	        	
					     	        	case 5:
					     	        		
					     	        		System.out.print("Ingrese la estatura: ");
					     	                jugador.setEstaturaJugador(escaner.nextDouble());
					     	                
					     	        		System.out.println("\nLa estatura fue modificado con exito!");
					     	        		
					     	        		break;
					     	        	
					     	        	case 6:
					     	        		System.out.print("Ingrese el peso: ");
					     	                jugador.setPesoJugador(escaner.nextDouble());
					     	                
					     	        		System.out.println("\nEl peso fue modificado con exito!");
					     	        		
					     	        		break;
					     	        	
					     	        	case 7:
					     	        		System.out.print("Ingrese posicion: ");
					     	                jugador.setPosicionJugador(escaner.nextLine());
					     	        		System.out.println("\nLa posicion fue modificado con exito!");
					     	        		
					     	        		break;
					     	        	
					     	        	default:
					     	        		
					     	                 System.out.println("\nOPCION INCORRECTA");
					     	                 break;
					     	        	
					     	        }
			     	                
			     	                jugadorEncontrado = true;
			     	                break;
			     	            }
			     	        }
			     	        if (!jugadorEncontrado) {
			     	        	
			     	            System.out.println("\nNo se encontró ningún jugador con ese nombre y apellido.");
			     	        }
			     	         
	 						
	 					}catch (InputMismatchException e) {
	                        System.out.println("Error, tiene que ingresar un valor válido");
	                        escaner.nextLine();
	                    } catch (DateTimeException e) {
	                        System.out.println("Error a la hora de ingresar la Fecha de nacimiento inválida");
	                        escaner.nextLine();
	                        
	                    }
	 					
	 				}
					
					break;
					
				case 5:
					
					if(jugadores.isEmpty()) {
	  					
						System.out.println("\nLa lista se encuentra vacia");
	  					System.out.println("\nPara eliminar un jugador primero tiene que dar de alta un jugador");
	  					
	  				}else {
	  					
		            	 System.out.println("\n*** Eliminar jugador ***");
		            	 System.out.print("Ingrese el nombre del jugador: ");
		            	 String nombre = escaner.nextLine();
		            	 System.out.print("Ingrese el apellido del jugador: ");
		            	 String apellido = escaner.nextLine();
		            	 
		            	 Iterator<Jugador> iterador = jugadores.iterator();
		            	 while (iterador.hasNext()) {
		            		    Jugador jugador = iterador.next();
		            		    if (jugador.getNombreJugador().equalsIgnoreCase(nombre) && jugador.getApellidoJugador().equalsIgnoreCase(apellido)) {
		            		        iterador.remove();
		            		        System.out.println("\nJugador eliminado");
		            		    }
		            	 }
		            	 
		            	 if (!iterador.hasNext()) {
		            	        System.out.println("\nNo se encontró a ningun jugador con ese nombre y apellido");
		            	    }
		
	  				 }
					
					break;
					
				case 6:
					
					if (jugadores.isEmpty()) {
						
			    		System.out.println("\nLa lista se encuentra vacia");
			    		System.out.println("\nNo es posible mostrar la cantidad de Jugadores");
			    	
					}else {
						
			    		int cantidadJugadores = jugadores.size();
			    		System.out.println("La cantidad total de jugadores que hay son: " + cantidadJugadores);
			    	}
					
					break;
					
				case 7:
					
					if (jugadores.isEmpty()) {
						
			    		System.out.println("\nLa lista se encuentra vacia");
			    		System.out.println("\nNo es posible mostrar la cantidad de Jugadores perteneciente a una nacionalidad");
			    	
					}else {
						
						System.out.println("\nIngrese Nacionalidad");
						String nacionalidad = escaner.nextLine();
						int cantJugadores=0;
						
						for (Jugador jugador : jugadores) {
							
							if (jugador.getNacionalidadJugador().equalsIgnoreCase(nacionalidad)){
								
								cantJugadores += 1;
							}
							
						}
						
						if(cantJugadores == 0) {
							
							System.out.println("\nNo se encontraron a jugadores de Nacionalidad" + nacionalidad);
						
						}else {
							System.out.println("\nLa cantidad de Jugadores que perteneces a la Nacionalidad de " + nacionalidad + " es de : " + cantJugadores);
						}
						
					}
					
					break;
					
				case 8:
					
	                System.out.println("\n****** FIN DEL PROGRAMA *******");
	                break;
	            default:
	                System.out.println("\nOPCION INCORRECTA");
	                break;
				}
				
			
			}while (opcion != 8);
		} catch (Exception e) {
	        System.out.println("ERROR : " + e.getMessage());
	    } finally {
	        escaner.close();
	    }
	}

}
