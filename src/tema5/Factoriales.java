/**
3) Se define el factorial de un número N como N*(N-1)*(N-2)*.......*3*2*1. Hacer un
programa que lea un número N filtrando a que sea mayor que cero y calcule su
factorial
La función a construir aquí se llamará factorial. El método main solo debe leer
un valor y devolver su factorial (versión iterativa).
 */
package tema5;
import java.util.Scanner;

public class Factoriales {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un numero natural");
		int numero = teclado.nextInt();
		long factorial;
		
		//Importamos el metodo
		factorial = Factorial(numero);
		System.out.println("Factorial: " + factorial);

	}
	static long Factorial(int numero) {
		int i = 1; 
		int factorial = 1;
		if (numero == 0) {
			System.out.println("Error");
		}
		else {
			for(i = 1; i <= numero; i++ ) {
				factorial = factorial*i;
			}
		}
		return factorial;
	}
}
