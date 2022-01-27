/*
5) Crea una clase que nos permita almacenar una colección de discos. El nombre de la clase será
Coleccion. Los datos miembro serán:
· Un vector de 100 elementos de la clase Disco.
· Un entero al que llamaremos índice que servirá para saber cuántos discos hemos
almacenado en la colección.
Diseña los métodos necesarios para gestionar la colección.
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
			System.out.println("Discos almacenados en la colección: " + indice);
		}
	}
}
