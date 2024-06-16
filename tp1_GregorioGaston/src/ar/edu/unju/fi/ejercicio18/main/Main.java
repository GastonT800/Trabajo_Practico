package ar.edu.unju.fi.ejercicio18.main;

import java.time.DateTimeException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;

public class Main {

	private static List<Pais> paises;
	private static List<DestinoTuristico> destinosT = new ArrayList<>();
	
	
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		paises = new ArrayList<>();
		
		precargarPaises();
		
		int opcion;
		try {
			do {
				System.out.println("\n****************************");
				System.out.println("********* MENU *************");
				System.out.println("1- Alta de destino turistico");
				System.out.println("2- Mostrar todos los destinos turísticos");
				System.out.println("3- Modificar el país de un destino turístico");
				System.out.println("4- Limpiar el ArrayList de destino turísticos");
				System.out.println("5- Eliminar un destino turístico");
				System.out.println("6- Mostrar los destinos turísticos ordenados por nombre");
				System.out.println("7- Mostrar todos los países");
				System.out.println("8- Mostrar los destinos turísticos que pertenecen a un país");
				System.out.println("9- Salir");
				
				try {
					System.out.print("\nSeleccione una opcion: ");
					opcion = scanner.nextInt();
					scanner.nextLine();
				}catch(Exception e) {
		        	System.out.println("\nDebe de Ingresar un Número para que la OPCION sea Valida");
		        	scanner.nextLine();
					opcion = 0;
		        }
				
				switch (opcion) {
				case 1:
					try {
						DestinoTuristico nuevoDestino = new DestinoTuristico();
						System.out.println("\n*** Alta de Destino Turistico ***");
			       	 	System.out.print("\nIngrese Codigo del Destino Turistico : ");
			       	 	nuevoDestino.setCodDestino(scanner.nextLine());
			            System.out.print("\nIngrese Nombre del Destino Turistico : ");
			            nuevoDestino.setNombreDestino(scanner.nextLine());
			            System.out.print("\nIngrese el precio del Destino Turistico : ");
						nuevoDestino.setPrecioDestino(scanner.nextDouble());
						scanner.nextLine();
						mostrarPaises();
						System.out.print("\nIngrese codigo del pais : ");
						String cod = scanner.nextLine();
		                boolean encontrado = false;
		                for (Pais pais : paises) {
		                	if(pais.getCodPais().equalsIgnoreCase(cod)) {
		                		
		                		nuevoDestino.setPais(pais);
								System.out.print("\n¿Cuantos dias estara de viaje? : ");
								nuevoDestino.setCantidadDias(scanner.nextShort());
								scanner.nextLine();
								encontrado = true;
								
								System.out.println("\nEl alta del jugador fue cargado correctamente");
				                
				                destinosT.add(nuevoDestino);
				                break;
		                	}
		        		}
		                if(!encontrado) {
		                	System.out.println("\n el código ingresado es incorrecto");
		                }
		                
						
					} catch (InputMismatchException e) {
                        System.out.println("Error, tiene que ingresar un valor válido");
                        scanner.nextLine();
                    } catch (DateTimeException e) {
                        System.out.println("Error en el ingresar de la Fecha de Nacimiento");
                        scanner.nextLine();
                        
                    }
					
	                break;
	                
				case 2:
					
					mostrarDestinosTuristicos();
					
					break;
					
				case 3:
					
				    
				    if (destinosT.isEmpty()) {
				    	
				    	System.out.println("\nLa lista se encuentra vacia");
				        System.out.println("\nNo hay destinos turísticos para modificar");
				   
				    } else {
				    	
				        mostrarDestinosTuristicos();
				        
				        System.out.print("\nIngrese el código del Destino Turístico que desea modificar: ");
				        String codigoDestino = scanner.nextLine();
				        
				        boolean encontrado = false;
				        for (DestinoTuristico destino : destinosT) {
				        	
				            if (destino.getCodDestino().equalsIgnoreCase(codigoDestino)) {
				            	
				                mostrarPaises();
				                
				                System.out.print("\nIngrese el nuevo código del país: ");
				                String nuevoCodPais;
				                Pais nuevoPais = null;
				                boolean codigoValido = false;

				                do {
				                	try {
				                		
				                		nuevoCodPais = scanner.nextLine();

					                    for (Pais pais : paises) {
					                        if (pais.getCodPais().equalsIgnoreCase(nuevoCodPais)) {
					                            nuevoPais = pais;
					                            codigoValido = true;
					                            break;
					                        }
					                    }

					                    if (!codigoValido) {
					                    	
					                        System.out.println("El código de país ingresado no es válido");
					                        
					                    }
				                		
			                        } catch (Exception e) {
			                            System.out.println("Error en ingreso del código de país: " + e.getMessage());
			                            scanner.nextLine();
			                        }
				                    
				                    
				                } while (!codigoValido);

				                destino.setPais(nuevoPais);
				                System.out.println("\nPaís modificado correctamente para el destino turístico con código: " + codigoDestino);

				                
				                encontrado = true;
				                break; 
				            }
				        }
				        
				        if (!encontrado) {
				            System.out.println("\nNo se encontró ningún destino turístico con el código: " + codigoDestino);
				        }
				    }
					
					break;
					
				case 4:
					
					limpiarArray();
					
					break;
					
				case 5:
					
					if(destinosT.isEmpty()) {

						System.out.println("\nLa lista de esta vacia");
						System.out.println("\nNo es posible eliminar un Destinos turisticos");
							
					}else {
						
			        	 System.out.println("\n*** Eliminar Destino Turistico ***");
			        	 mostrarDestinosTuristicos();
			        	 System.out.print("\nIngrese el codigo del Destino Turistico: ");
			        	 String codigoDestino = scanner.nextLine();

			        	 Iterator<DestinoTuristico> iterador = destinosT.iterator();
			        	 boolean encontrado = false;
			        	 while (iterador.hasNext()) {
			        		 
			        		    DestinoTuristico destino = iterador.next();
			        		    if (destino.getCodDestino().equalsIgnoreCase(codigoDestino)) {
			        		    	
			        		        iterador.remove();
			        		        encontrado = true;
			        		        System.out.println("\nDestino Turistico eliminado");
			        		        break;
			        		    }
			        	 }
			        	 
			        	 if (!encontrado) {
			        		 
			        	        System.out.println("\nNo se encontró a ningun Destino Turistico con ese codigo");
			        	    }

						 }
				
					break;
					
				case 6:
					
					mostrarDestinosOrdenados();
					
					break;
					
				case 7:
					
					mostrarPaises();
					
					break;
				
				case 8:
					
				    if (destinosT.isEmpty()) {
				    	
				        System.out.println("\nLa lista de Destinos Turísticos se encuentra vacía");
				       //System.out.println("\nNo es posible mostrar los destinos turísticos");
				        
				    } else {
				    	
				        mostrarPaises();
				        System.out.print("\nIngrese código del País: ");
				        String codPais = scanner.nextLine();
				        boolean encontrado = false;
				        int cont = 0;
				        for (Pais pais : paises) {
				        	
				            if (pais.getCodPais().equalsIgnoreCase(codPais)) {
				                
				                System.out.println("\nDestinos Turísticos de " + pais.getNombrePais() + ":");
				                
				                for (DestinoTuristico desT : destinosT) {
				                	
				                    if (desT.getPais().equals(pais)) {
				                    	
				                        cont+=1;
				                        System.out.println("Destino Turístico " + cont + " : " + desT);
				                    }
				                }
				                encontrado = true;
				                
				                break;
				            }
				        }
				        if (!encontrado) {
				            System.out.println("\nEl código de país ingresado es incorrecto");
				        }
				    }
				    break;

					
				case 9:
					
	                System.out.println("\n****** FIN DEL PROGRAMA *******");
	                
	                break;
	                
	            default:
	                System.out.println("\nOPCION INCORRECTA");
	                break;
				}
				
			
			}while (opcion != 9);
			
		} catch (Exception e) {
			
	        System.out.println("ERROR : " + e.getMessage());
	        
	    } finally {
	        scanner.close();
	    }
	}

	public static void precargarPaises(){
		
		if(paises.isEmpty()) {
			
			paises.add(new Pais("COD-81224", "Argentina"));
			paises.add(new Pais("COD-15249", "Brasil"));
			paises.add(new Pais("COD-65921", "Estados Unidos"));
			paises.add(new Pais("COD-34695", "Alemania"));
			paises.add(new Pais("COD-12468", "Rusia"));
			paises.add(new Pais("COD-69844", "China"));
			
		}
		
	}
	
	public static void mostrarDestinosTuristicos() {
		
		if(destinosT.isEmpty()) {
			
			System.out.println("\nLa lista de esta vacia");
			System.out.println("\nNo es posible mostrar los Destinos turisticos");
			System.out.println("\nPrimero debe de dar de alta destino turistico");
				
		}else {
			
			System.out.println("\n*** Lista de los Destino Turisticos ***");
			int dest = 0;
			for (DestinoTuristico destino : destinosT) {
				dest+=1;
				System.out.println("\nDestino Turistico " + dest + " : " + destino);
			}
		}
		
	}
	
	/**
	 * opcion7
	 */
	public static void mostrarPaises() {
		
		int p=0;
		System.out.println("\nPaises Disponibles");
		for (Pais pais : paises) {
			
			p+=1;
			System.out.println("\nPais " + p + " : " + pais.getNombrePais() + " código : " + pais.getCodPais());
		}
		
	}
	
	/**
	 * opcion4
	 */
	public static void limpiarArray () {
		
		destinosT.clear();
		System.out.println("\nEl Array fue limpiado con exito!");
		
	}
	
	/**
	 * opcion6
	 */
	public static void mostrarDestinosOrdenados(){
		
		if (destinosT.isEmpty()) {
			
			System.out.println("\nLa lista se encuentra vacia");
	    
		} else {

			System.out.println("\nDestinos Turisticos ordenados por nombre");
			destinosT.sort(Comparator.comparing(DestinoTuristico::getNombreDestino));
			destinosT.forEach(desT->System.out.println(desT));
	    }
		
	}
	
}
