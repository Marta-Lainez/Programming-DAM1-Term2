/**
5) Escribir un método que con dos parámetros enteros p y q nos devuelva el m.c.d.
(máximo común divisor) de ambos.
 */
package tema5_1;
import java.util.Scanner;

public class MaximoComunDivisor {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Dame el primer numero (natural).");
		int numeroP = teclado.nextInt();
		System.out.println("Dame el segundo numero (natural).");
		int numeroQ = teclado.nextInt();
	
		int mcd = elMcd(numeroP, numeroQ);
		System.out.println("El maximo comun divisor de " + numeroP + " y " + numeroQ + " es " + mcd + ".");
		
	}
	

	static int elMcd (int numeroP, int numeroQ) {
		int mcd = 1;
		String divisoresP = "";
		String divisoresQ = "";
		char divisorP = '1';
		int numDivisorP;
		String cadenaDivP = "";
		char divisorQ = '1';
		int numDivisorQ;
		String cadenaDivQ = "";
		for (int i = 2; i <= numeroP; i++) { // Divido el numero dado entre todos los numeros entre 2 y si mismo
			if (numeroP % i == 0) { // Si en algun momento el resultado es 0, añadimos ese numero a la cadena de divisores de P
				divisoresP += i;
				// separo los divisores con comas por si algun divisor tiene mas de 2 digitos
				divisoresP += ',';
			}
		
		}
		for (int i = 2; i <= numeroQ; i++) { // Divido el numero dado entre todos los numeros entre 2 y si mismo
			if (numeroQ % i == 0) { // Si en algun momento el resultado es 0, añadimos ese numero a la cadena de divisores de Q
				divisoresQ += i;
				// separo los divisores con comas por si algun divisor tiene mas de 2 digitos
				divisoresQ += ',';
			}
		}
		/** 
		Al finalizar estos bubles tenemos 2 cadenas. Cada cadena contiene los divisores de su numero
		
		Ahora vamos comparamos el primer divisor de P con todos los de Q y si alguno coincide, ese es el mcd.
		Luego comparamos el segundo divisor de P con todos los de Q y si coincide alguno, este sera el nuevo mcd
		Asi hasta el ultimo divisor de P
		*/
		for (int posicionP = 0; posicionP < divisoresP.length() - 1; posicionP++) {
			divisorP = divisoresP.charAt(posicionP);
			
			// Agrupo los digitos entre comas en una nueva cadena llamada cadenaDiv, y al llegar a la coma paro
			// y la convierto con integer en un entero llamado numDivisor. Lo hare tambien con Q
			
			while (divisorP != ',') {
				cadenaDivP += divisorP;
				posicionP++;
				divisorP = divisoresP.charAt(posicionP);
			}
			numDivisorP = Integer.parseInt(cadenaDivP);
			
			// Aqui ya tengo el divisor de Q de los digitos que sea convertido en entero y listo para comparar
			
			for (int posicionQ = 0; posicionQ < divisoresQ.length() - 1; posicionQ++) {
				divisorQ = divisoresQ.charAt(posicionQ);
				
				// Agrupo los divisores entre comas de Q en una cadena nueva llamada cadenaDiv como he hecho con P
				while (divisorQ != ',') {
					cadenaDivQ += divisorQ;
					posicionQ++;
					divisorQ = divisoresQ.charAt(posicionQ);
				}
				numDivisorQ = Integer.parseInt(cadenaDivQ);
				
				// Una vez tengo tanto el divisor de P como el de Q en enteros, reseteo ambas cadenaDiv
				cadenaDivP = "";
				cadenaDivQ = "";
				if (numDivisorP == numDivisorQ) {
					mcd = numDivisorP;
				}
			}
		}
		return mcd;
	}
}