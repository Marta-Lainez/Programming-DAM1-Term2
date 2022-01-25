/*
2) Leer dos vectores de dimensión 10 para construir un tercer vector cuyos componentes sean la
suma de los dos anteriores e imprimirlo
 */
package tema6;

public class Ejercicio2 {

	public static void main(String[] args) {
		int [] vector1 = {1,2,3,4,5,6,7,8,9,10};
		int [] vector2 = {2,3,4,5,6,7,6,0,5,3};
		int [] vector3 = new int[10];
		for (int i = 0; i < vector3.length; i++) {
			vector3[i] = vector1[i] + vector2[i];
			System.out.print(vector3[i] + " ");
		}
	}
}
