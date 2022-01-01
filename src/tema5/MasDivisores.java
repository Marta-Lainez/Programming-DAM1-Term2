/**
2) Dados dos números P y Q que leeremos por teclado y que deben ser positivos, hacer
un programa que nos diga cuál de los dos tiene más divisores, con un mensaje que
diga “P tiene más divisores que Q” o viceversa.
Este programa debe llamar a un método que calcule los divisores de un número,
lo aplique para P y para Q y luego compare y decida.
 */
package tema5;
import java.util.Scanner;
public class MasDivisores {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un numero positivo.");
		int numeroP = teclado.nextInt();
		System.out.println("Dame otro numero positivo.");
		int numeroQ = teclado.nextInt();
		boolean masDivisoresP;
		int contadorDivP = 0;
		int contadorDivQ = 0;
		
		if (numeroP > 0 && numeroQ > 0) {
			// Si los numeros P y Q son ambos positivos, invocamos el metodo y continuamos el ejercicio
			masDivisoresP = masDivisores(numeroP, numeroQ, contadorDivP, contadorDivQ);
			if(masDivisoresP) System.out.println("El numero " + numeroP + "tiene mas divisores que " + numeroQ);
			else System.out.println("El numero " + numeroQ + " tiene mas divisores que " + numeroP);
		}
		// Si P y Q no son ambos numeros positivos, no invocamos el metodo y sacamos por pantalla mensaje de error y explicacion
		else System.out.println("Los numeros aportados no son validos (ambos positivos).");
		
	}
	static boolean masDivisores (int numeroP, int numeroQ, int contadorDivP, int contadorDivQ) {
		boolean masDivisoresP = true;
			
		for (int i = 2; i < numeroP ; i++) { // Divido el numero dado entre todos los numeros entre 2 y el anterior al numero
			if (numeroP % i == 0) { // Si en algun momento el resultado es 0, sumamos 1 a su contador de divisores
				contadorDivP++;
			}
		}
		for (int i = 2; i < numeroQ ; i++) { // Divido el numero dado entre todos los numeros entre 2 y el anterior al numero
			if (numeroQ % i == 0) { // Si en algun momento el resultado es 0, sumamos 1 a su contador de divisores
				contadorDivQ++;
			}
		}
		if (contadorDivP < contadorDivQ) {
			masDivisoresP = false;
		}
		return masDivisoresP;
	}
	
}
