/*
3. Escribe un programa igual que el anterior con la diferencia de que ahora no se quiere
visualizar los datos de los trabajadores, sino que se quiere visualizar cuál es la media
de edad que existe por cada grupo de trabajadores. Hay que utilizar una única función
que calcule la media de edad de cualquier grupo de trabajadores.
 */
package tema7_2;

import java.util.Scanner;


public class Ejercicio3{
	
	public static void main (String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Cuantos administrativos hay?");
		int numAdmin = teclado.nextInt();
		System.out.println("¿Cuantos maquinistas hay?");
		int numMaqui = teclado.nextInt();
		System.out.println("¿Cuantos trabajadores de otro tipo hay?");
		int numOtros = teclado.nextInt();
		int numTrabajadores = numAdmin + numMaqui + numOtros;
		Trabajador[] misTrabajadores = new Trabajador[numTrabajadores];
		
		for(int i = 0; i < numAdmin; i++) {
			misTrabajadores[i] = new Administrativo ();
		}
		
		for(int j = numAdmin; j < numAdmin + numMaqui; j++) {
			misTrabajadores[j] = new Maquinista();
		}
		for (int k = numAdmin + numMaqui; k < numTrabajadores; k++) {
			misTrabajadores[k] = new Trabajador();
		}
		double media = calculaEdadMedia(misTrabajadores, numAdmin, numMaqui, numOtros);
	}

	public static double calculaEdadMedia(Trabajador[] misTrabajadores, int numAdmin, int numMaqui, int numOtros) {
		double edadMedia = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Por favor, introduzca uno de los siguientes numeros:\n1=Administradores.\n2=Maquinistas.\n3=Otros Trabajadores.");
		int decision = teclado.nextInt();
		switch (decision){
		case 1: 
			for(int i = 0; i < numAdmin; i++) {
				edadMedia = edadMedia + misTrabajadores[i].getEdad(); 
			}
			edadMedia = edadMedia / numAdmin;
			System.out.println("Edad media de Administrativos: " + edadMedia);
			break;
		case 2:
			for(int j = numAdmin; j < numAdmin + numMaqui; j++) {
				edadMedia = edadMedia + misTrabajadores[j].getEdad(); 
			}
			edadMedia = edadMedia / numAdmin;
			System.out.println("Edad media de Maquinista: " + edadMedia);
			break;
		case 3: 
			for (int k = numAdmin + numMaqui; k < misTrabajadores.length; k++) {
				edadMedia = edadMedia + misTrabajadores[k].getEdad(); 
			}
			edadMedia = edadMedia / numAdmin;
			System.out.println("Edad media de Otros Trabajadores: " + edadMedia);
			break;
		default:
			System.out.println("ERROR");
		}
		return edadMedia;
	}
	
	
}
