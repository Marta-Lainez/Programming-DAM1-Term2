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
	Scanner teclado = new Scanner (System.in);
	CopiaDiscos[] miDisco = new CopiaDiscos[100];
	int indice;
	
	public CopiaDiscos[] rellenaDiscos () {
		System.out.println("Cuantas entradas quieres llenar?");
		int entradas = teclado.nextInt();
		CopiaDiscos[] miNuevoDisco = new CopiaDiscos[100];
		for (int i = 0; i < entradas; i++) {
			miNuevoDisco[i].setTitulo("Eric");
			miNuevoDisco[i].setNumCanciones(1);
			miNuevoDisco[i].setPrecio(1);
			miNuevoDisco[i].setFechaCompra("1/11/2003");
		}
		return miNuevoDisco;
	}
	public int dameIndice () {
		for (int i = 0; i < miDisco.length; i++) {
			if (miDisco[i] != null) {
				indice++;
			}
		}
		return indice;
	}
	public static void main (String[]args) {
		
		for (int i = 0; i < 100; i++) {
		
		}
	}
}
