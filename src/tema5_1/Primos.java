/**
1) Hacer un programa que lea un número N y nos escriba en la pantalla, mediante un
mensaje, si es o no primo (NOTA: Número primo es aquél que es divisible solo por
sí mismo y por la unidad)
Desarrollar este programa creando un método llamado primo que devuelva true
si el número es primo y false si no lo es
 */
package tema5_1;
import java.util.Scanner;
public class Primos {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un numero entero.");
		int numero = teclado.nextInt();
		boolean primo;
		
		//Invocamos el metodo
		primo = esPrimo (numero);
		
		System.out.println("El numero " + numero + (primo ? "" : " no") + " es primo.");
	}
	static boolean esPrimo (int numero) {
		
		boolean primo = true;
		
		for (int i = 2; i < numero ; i++) { // Divido el numero dado entre todos los numeros entre 2 y el anterior al numero
			if (numero % i == 0) { // Si en algun momento, el resto da 0, el numero no es primo
				primo = false;
			}
		}
		return primo;
	}
}