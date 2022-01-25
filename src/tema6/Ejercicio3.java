/*
 *Leer un vector de 10 componentes enteros; calcular el mayor, el menor y los lugares donde se
encuentran.
 */
package tema6;

import java.util.Arrays;

public class Ejercicio3 {
	public static void main(String[] args) {
		int [] vector = {8,2,10,4,5,1,7,3,9,7};
		Arrays.sort(vector);
		System.out.println("Menor: " + vector[0] + "\nMayor: " + vector[9]);
					
		
	}
}
