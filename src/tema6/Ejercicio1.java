/* 
1) Se generan 20 números aleatorios de tipo entero y se almacenan en un vector. Hay que calcular
y mostrar la media y, además, mostrar cuántos números hay:
-Superiores a la media
-Inferiores a la media
-Iguales a la media
*/
package tema6;

public class Ejercicio1 {

	public static void main (String[]args) {
		int [] vector = new int [20];
		for (int i = 0; i < vector.length; i++) {
			vector[i] = (int)(Math.random()*20);
			System.out.print(vector[i] + " ");
		}
		System.out.println();
		int media = 0;
		
		media = mediaVector(vector);
		comparacionMedia(vector, media);
	}
	
	static int mediaVector (int [] vector) {
		int media = 0;
		for (int i = 0; i < vector.length; i++) {
			media+= vector [i];
		}
		media = (int)(media / vector.length);
		System.out.println("La media es: " + media);
		return media;
	}
	
	static void comparacionMedia(int [] vector, int media) {
		int superior = 0;
		int igual = 0;
		int inferior = 0;
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] < media)
				inferior++;
			else if (vector[i] > media)
				superior++;
			else
				igual++;
		}
		System.out.println("Iguales a la media: " + igual + "\r\n" + "Superiores a la media: " + superior + "\r\n"
				+ "Inferiores a la media: " + inferior);
		
	}
}
