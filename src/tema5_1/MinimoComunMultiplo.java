/**
6) Escribir un método que reciba dos parámetros enteros p y q y devuelva el mínimo
común múltiplo de ambos.
 */
package tema5_1;

import java.util.Scanner;

public class MinimoComunMultiplo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Dame el primer numero (natural).");
		int numeroP = teclado.nextInt();
		System.out.println("Dame el segundo numero (natural).");
		int numeroQ = teclado.nextInt();
	
		int mcm = mcm(numeroP, numeroQ);
		System.out.println("El minimo comun divisor de " + numeroP + " y " + numeroQ + " es " + mcm + ".");
		//En vez de las 2 lineas anteriores puedo escribir la siguiente que hara lo mismo:
		//System.out.println("El minimo comun divisor de " + numeroP + " y " + numeroQ + " es " + mcm(numeroP, numeroQ) + ".");
	}
	
	static int mcm(int numeroP, int numeroQ) {
		int mcm = 1; // Inicio mcm en 1 porque este es el minimo valor que mcm puede tomar.
		int contadorDivQ = 2; // Iniciamos contador de divisores de Q en 2 porque es el minimo valor despues de 1 que mcm puede tener
		
		//Con este bucle vamos a buscar mcm mayor que 1
		//Empezamos dividiendo P entre todos los numeros desde 2 hasta P
		for (int contador = 2; contador <= numeroP; contador++) {
			if(numeroP % contador == 0) { //Si P dividido para el numero da como resto 0:
				if(numeroQ % contador == 0) { //Comprobamos si Q entre ese num tambien da 0
					mcm = contador; //Si en efecto da 0, hemos encontrado mcm
				}
			contadorDivQ = 0;
			}
		}
		return mcm;
	}

}