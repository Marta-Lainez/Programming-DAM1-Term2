/**
9) Escribir un programa que llame a un m�todo con los coeficientes de una ecuaci�n de
segundo grado, a, b y c, y devuelva sus ra�ces en el caso de ser reales.
Nota. Las ra�ces de una ecuaci�n son :
R1=(-b+ra�z(b2

-4*a_c))/(2*a)

R2=(-b-ra�z(b2

-4*a_c))/(2*a)

Para la ra�z llamar a la clase Math y el m�todo ra�z que es sqrt.
Esta funci�n solo se puede aplicar en el caso de que valor sea positivo es decir:
b
2
-4*a*c > 0.
 */
package tema5;
import java.util.Scanner;
public class Raices {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dada una ecuacion de segundo grado: ax^2 + bx + c = 0:");
		System.out.println("Dame a:");
		double a = teclado.nextDouble();
		System.out.println("Dame b:");
		double b = teclado.nextDouble();
		System.out.println("Dame c:");
		double c = teclado.nextDouble();
		
		raiz(a, b, c);
		
	}
	
	static void raiz (double a, double b, double c) {
		
		double raiz1;
		double raiz2;
		double interiorRaiz = Math.pow(b, 2) - 4*a*c; // Math.pow(b,2) es b^2
		if ( interiorRaiz > 0) {
			raiz1 = (-b + Math.sqrt(interiorRaiz))/(2*a);
			raiz2 = (-b - Math.sqrt(interiorRaiz))/(2*a);
			System.out.println("Las raices reales de " + a + "x^2 + " + b + "x + " + c + " es: " + "\r\n" + raiz1 + "\r\n" + raiz2);
		}
		else System.out.println("Raiz negativa, no existen raices reales.");
	}
}
