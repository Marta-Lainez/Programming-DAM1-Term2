/*
5) Crea una clase que nos permita almacenar una colecci�n de discos. El nombre de la clase ser�
Coleccion. Los datos miembro ser�n:
� Un vector de 100 elementos de la clase Disco.
� Un entero al que llamaremos �ndice que servir� para saber cu�ntos discos hemos
almacenado en la colecci�n.
Dise�a los m�todos necesarios para gestionar la colecci�n.
 */
package tema6;
import java.util.Scanner;
public class Coleccion {
	
	int indice;
	
	// Creamos un metodo que rellena un vector de datos hasta donde el usuario ha indicado (entradas)
	// con los mismos datos
	public CopiaDiscos[] rellenaDiscos (int entradas) {
		CopiaDiscos[] miNuevoDisco = new CopiaDiscos[100];
		for (int i = 0; i < entradas; i++) {
			miNuevoDisco[i] = new CopiaDiscos();
			miNuevoDisco[i].setTitulo("Eric");
			miNuevoDisco[i].setNumCanciones(1);
			miNuevoDisco[i].setPrecio(1);
			miNuevoDisco[i].setFechaCompra("1/11/2003");
		}
		return miNuevoDisco;
	
	}
	// En este metodo contamos los elementos del vector que no son null, es decir, que tienen informacion dentro
	public int dameIndice (CopiaDiscos [] vector) {
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] != null) {
				indice++;
			}
		}
		return indice;
	}
	public static void main (String[]args) {
		Coleccion miDisco = new Coleccion();
		Scanner teclado = new Scanner (System.in);
		System.out.println("Cuantas entradas quieres llenar?");
		int entradas = teclado.nextInt();
		
		if (entradas < 0 || entradas > 100) {
			System.out.println("Entradas no validas.");
		}
		else {
			CopiaDiscos[] vector = miDisco.rellenaDiscos(entradas);
			int indice = miDisco.dameIndice(vector);
			System.out.println("Discos almacenados en la colecci�n: " + indice);
		}
	}
}
