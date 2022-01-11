/**
8) Dados m elementos de un conjunto que se desean agrupar de n en n, el número de
combinaciones posibles es m!/(n!*(m-n)!), siendo siempre m >=n (hay que validarlo)
Escribir un método para que, dados como parámetros m y n, nos calcule el número
de combinaciones de m sobre n. Usad el método factorial del ejercicio 3.
 */
package tema5;
import java.util.Scanner;
public class CombinacionesPosibles {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un numero natural.");
		int m = teclado.nextInt();
		System.out.println("Dame otro numero natural menor que el anterior.");
		int n = teclado.nextInt();
		long numCombinaciones;
		
		if (m < n) {
			System.out.println("Error. Numeros no validos.");
		}
		else {
			numCombinaciones = Combinaciones (m, n);
			System.out.println("Numero de combinaciones: " + numCombinaciones);
		}
	}
	static long Factorial(int numero) {
		int i = 1; 
		int factorial = 1;
		if (numero == 0) {
			System.out.println("Error");
		}
		else {
			for(i = 2; i <= numero; i++ ) {
				factorial = factorial*i;
			}
		}
		return factorial;
	}
	
	static long Combinaciones (int m, int n) {
		long numeroCombinaciones = 0;
		numeroCombinaciones = (Factorial(m) / (Factorial(n) * Factorial(m-n)));
		
		return numeroCombinaciones;
	}
}