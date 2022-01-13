/**
1) Crear una clase Disco para guardar información sobre los discos de música que
tenemos.
La información asociada a cada uno de los discos es:
Titulo, no de canciones, precio y fecha de compra.
*/
package tema5_2;

import java.util.Scanner;
public class PruebaDiscos {

	public static void main (String[]args){
		Scanner teclado = new Scanner(System.in);
		Discos myObj = new Discos();
		
		
		System.out.print("Titulo del disco: ");
		myObj.setTitulo(teclado.nextLine());
		System.out.print("Numero de canciones del disco: ");
		myObj.setNumCanciones(teclado.nextInt());
		System.out.print("Precio del disco: ");
		myObj.setPrecio(teclado.nextInt());
		teclado.nextLine();
		System.out.print("Fecha de compra del disco: ");
		myObj.setFechaCompra(teclado.nextLine());
		
		System.out.println("Titulo: " + myObj.getTitulo() + "\r\n" + "Numero de canciones: " + myObj.getNumCanciones()
				+ "\r\n" + "Precio: " + myObj.getPrecio() + "\r\n" + "Fecha de compra: " + myObj.getFechaCompra());
		
	}

}
