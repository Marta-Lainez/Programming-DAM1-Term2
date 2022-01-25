/*
4) Generar dos vectores de dimensión 10 (dar valores aleatorios entre 1 y 5) y comprobar para
cada uno de los elementos del primer vector cuántas veces está en el segundo, es decir
primero: 3,7,2
segundo: 3,3,5
el resultado debe ser:
elemento 1 (3): 2 veces
elemento 2 (7): 0 veces
elemento 3 (2): 0 veces
 */
package tema6;

import java.util.Arrays;

public class Ejercicio4 {

	public static void main(String[] args) {
		int contador = 0;
		
		int [] vector1 = new int [10];
		int [] vector2 = new int [10];
		for (int i = 0; i < vector1.length; i++) {
			vector1[i] = (int)(Math.random()*5+1);
		}
		for (int i = 0; i < vector1.length; i++) {
			vector2[i] = (int)(Math.random()*5+1);
		}
		System.out.println();
		Arrays.sort(vector1);
		Arrays.sort(vector2);
		
		for (int i = 0; i < vector1.length; i++) {
			System.out.print(vector1[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < vector2.length; i++) {
			System.out.print(vector2[i] + " ");
		}
		System.out.println();
		
		int numero = vector1[0];
		boolean cero = false; // Iniciamos el falso
		
		// ARREGLAR EL BUCLE FOR
		
		for (int i = 0; i < vector1.length; i++) {
			if (numero != vector1[i]){
				numero = vector1[i];
				contador = 0;
				cero = false; // Al evaluar un numero nuevo, el booleano es falso otra vez
			}
			if (contador == 0 && cero == false) { // Solo se ejecuta este bucle si el contador es 0
				// y a su vez el booleano es falso, es decir, si es el primer numero o cuando
				// vez que evaluamos un numero nuevo
				for (int j = 0; j < vector2.length; j++) {
					if (numero == vector2[j]) {
						contador++;
						cero = false;
					}
				}
				if (contador != 0) {
					System.out.println("Numero " + numero + ": " + contador + " veces." );
				}
				else {
					System.out.println("Numero " + numero + ": 0 veces." );
					cero = true;
				}
			}
		
		}
	}
}
