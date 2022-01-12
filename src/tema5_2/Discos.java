/*
1) Crear una clase Disco para guardar información sobre los discos de música que
tenemos.
La información asociada a cada uno de los discos es:
Titulo, nº de canciones, precio y fecha de compra.

Todos los getters y setters se crean en una clase aparte sin un main. Luego las variables pueden ser
utilizadas en otras clases dentro de este paquete.
*/
package tema5_2;
import java.util.Scanner;
public class Discos {
	Scanner teclado = new Scanner(System.in);
	
	private String titulo;
	public String getTitulo() {
		return titulo;
	}
	
	private int numCanciones;
	public int getNumCanciones() {
		return numCanciones;
	}
	
	private int precio;
	public int getPrecio() {
		return precio;
	}
	
	private String fechaCompra;
	public String getFechaCompra() {
		return fechaCompra;
	}
	
}
