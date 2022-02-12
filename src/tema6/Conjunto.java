/**
7) Escribir una clase Conjunto que gestione un conjunto de enteros (int) con ayuda de una tabla de
tama�o fijo (100) (un conjunto contiene una lista no ordenada de elementos y se caracteriza
por el hecho de que cada elemento es �nico: no se debe encontrar dos veces el mismo valor en
la tabla). Las operaciones a implementar (m�todos de la clase) son las siguientes:
� vaciar: vac�a el conjunto.
� agregar: a�ade un entero al conjunto
� eliminar: retira un entero del conjunto (habr� que desplazar elementos).
� copiar: recopila un conjunto en otro
� esMiembro: devuelve verdadero si existe en el conjunto un entero dado, o falso si no
	existe.
� posicion: reenv�a la posici�n en el conjunto de un entero dado, o el valor -1 si no existe.
� esIgual: devuelve true si un conjunto es igual a otro, teniendo en cuenta que dos
	conjuntos son iguales si tienen los mismos elementos y en el mismo orden
� imprimir: realiza la visualizaci�n del conjunto.
 */
package tema6;
import java.util.Arrays;
import java.util.Scanner;
public class Conjunto {
	public static void main (String[]args) {
		Scanner teclado = new Scanner(System.in);
		int[] vector = creoConjunto();
		int numero;
		System.out.println("�Quieres vaciar el conjunto? SI o NO");
		String decisionVaciar = teclado.next();
		if (decisionVaciar.equals("SI")) {
			vector = vaciar(vector);
			System.out.println("�Quieres a�adir un elemento al conjunto que has borrado? SI o NO");
			String decisionA�adir = teclado.next();
			if (decisionA�adir.equals("SI")) {
				System.out.println("�Qu� elemento quieres a�adir al vector?");
				numero = teclado.nextInt();
				vector = a�adir(vector,numero);
				System.out.println("Ha borrado su vector original y a�adido un nuevo elemento.");
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
	// metodo vaciar: vac�a el conjunto.
	static int[] vaciar(int[] vector) {
		// vector = null; // Si quieres que todos los elementos del vector sean null
		Arrays.fill(vector, 0); // Si quieres que todos los elementos del vector sean 0
		return vector;
	}
	// agregar: a�ade un entero al conjunto
	static int[] a�adir (int[] vector, int numero) {
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
	// eliminar: retira un entero del conjunto (habr� que desplazar elementos).
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
