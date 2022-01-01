/**
4) Dado un número N que se pedirá por teclado y debe ser positivo, imprimir la lista de
todos los numero primos hasta dicho número incluido.
Hacer este programa usando el método primo que ya tenéis construido.
 */
package tema5;
import java.util.Scanner;
public class ListaPrimos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un numero positivo.");
		int numero = teclado.nextInt();
		boolean primo;
		
		// Solo saco la lista si el numero dad es realmente un entero positivo
		if (numero > 0) {
			System.out.println("Numeros primos hasta el numero dado incluido: ");
			imprimir(numero);
		}
		else System.out.println("Numero no apto.");
	}

	static boolean esPrimo(int numero) {

		boolean primo = true;
		for (int i = 2; i < numero; i++) { // Divido el numero dado entre todos los numeros entre 2 y el anterior al
											// numero
			if (numero % i == 0) { // Si en algun momento el resto da 0, el numero no es primo
				primo = false;
			}
		}
		return primo;
	}

	static void imprimir(int numero) {
		
		// Desde 3 hasta el numero metido por pantalla, vamos a ejecutar esPrimo
		for (int j = 3; j <= numero; j++) {
			boolean primo = esPrimo(j);
			
			// Si en algun momento esPrimo resulta que es true, imprimos ese numero
			if (primo == true) System.out.print(j + " ");
		}
	}
}
