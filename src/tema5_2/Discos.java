/**
Todos los getters y setters se crean en una clase aparte sin un main. Luego las variables pueden ser
utilizadas en otras clases dentro de este paquete.
 */
package tema5_2;
import java.util.Scanner;
public class Discos {
	Scanner teclado = new Scanner(System.in);
	private String titulo = teclado.nextLine();
	public String getTitulo() {
		return titulo;
	}
	
	private int numCanciones = teclado.nextInt();
	public int getNumCanciones() {
		return numCanciones;
	}
	
	private int precio = teclado.nextInt();
	public int getPrecio() {
		return precio;
	}
	
	private String fechaCompra = teclado.nextLine();
	public String getFechaCompra() {
		return fechaCompra;
	}
}
