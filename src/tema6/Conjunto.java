/**
7) Escribir una clase Conjunto que gestione un conjunto de enteros (int) con ayuda de una tabla de
tamaño fijo (100) (un conjunto contiene una lista no ordenada de elementos y se caracteriza
por el hecho de que cada elemento es único: no se debe encontrar dos veces el mismo valor en
la tabla). Las operaciones a implementar (métodos de la clase) son las siguientes:
· vaciar: vacía el conjunto.
· agregar: añade un entero al conjunto
· eliminar: retira un entero del conjunto (habrá que desplazar elementos).
· copiar: recopila un conjunto en otro
· esMiembro: devuelve verdadero si existe en el conjunto un entero dado, o falso si no
	existe.
· posicion: reenvía la posición en el conjunto de un entero dado, o el valor -1 si no existe.
· esIgual: devuelve true si un conjunto es igual a otro, teniendo en cuenta que dos
	conjuntos son iguales si tienen los mismos elementos y en el mismo orden
· imprimir: realiza la visualización del conjunto.
 */
package tema6;
import java.util.Arrays;
import java.util.Scanner;
public class Conjunto {
	public static void main (String[]args) {
		Scanner teclado = new Scanner(System.in);
		int[] vector = creoConjunto();
		int numero;
		System.out.println("¿Quieres vaciar el conjunto? SI o NO");
		String decisionVaciar = teclado.next();
		if (decisionVaciar.equals("SI")) {
			vector = vaciar(vector);
			System.out.println("¿Quieres añadir un elemento al conjunto que has borrado? SI o NO");
			String decisionAñadir = teclado.next();
			if (decisionAñadir.equals("SI")) {
				System.out.println("¿Qué elemento quieres añadir al vector?");
				numero = teclado.nextInt();
				vector = añadir(vector,numero);
				System.out.println("Ha borrado su vector original y añadido un nuevo elemento.");
			}
			else
				System.out.println("Tiene un vector vacio.");
		}
		else System.out.println("Conserva su vector original.");
		
		
		
	}
	static int[] creoConjunto() {
		int[] vector = new int [100];
		int numero;
		for(int i = 0; i < vector.length; i++) { // 11 7 5 7
			numero = (int)(Math.random()*100)+1;
			for(int j = 0; j < i; j++) {
				if(numero == vector[j]) {
					numero = (int)(Math.random()*100)+1;
					j = 0;
				}
			}
			vector[i] = numero;
			System.out.println(vector[i] + " ");
		}
		return vector;
	}
	// metodo vaciar: vacía el conjunto.
	static int[] vaciar(int[] vector) {
		// vector = null; // Si quieres que todos los elementos del vector sean null
		Arrays.fill(vector, 0); // Si quieres que todos los elementos del vector sean 0
		return vector;
	}
	// agregar: añade un entero al conjunto
	static int[] añadir (int[] vector, int numero) {
		boolean vacio = false;
		while (!vacio) {
			for (int i = 0; i < vector.length; i++) {
				if(vector[i] == 0) {
					vacio = true;
					vector[i] = numero;
				}
			}
		}
		return vector;
	}
	// eliminar: retira un entero del conjunto (habrá que desplazar elementos).
	static int[] retirar (int[] vector, int numero) {
		int[] num;
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] == numero) {
				num = new int [vector.length - i];
				for (int j = 0; j < num.length; j++) {
				//	ArraysCopy(vector, i, num, 0, num.length);
				}
				
				
			}
		}
		return vector;
	}
}
