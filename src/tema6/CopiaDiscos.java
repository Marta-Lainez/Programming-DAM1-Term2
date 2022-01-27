/**
5) Crea una clase que nos permita almacenar una colección de discos. El nombre de la clase será
Coleccion. Los datos miembro serán:
· Un vector de 100 elementos de la clase Disco.
· Un entero al que llamaremos índice que servirá para saber cuántos discos hemos
almacenado en la colección.
Diseña los métodos necesarios para gestionar la colección.
 */

package tema6;

public class CopiaDiscos {
	private String titulo;
	private int numCanciones;
	private int precio;
	private String fechaCompra;
	
	public CopiaDiscos(){
		titulo = "Vacío";
		numCanciones = 0;
		precio = 0;
		fechaCompra = "0/0/0";
	}
	// getter y setter de titulo
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo (String newTitulo) {
		this.titulo = newTitulo;
	}
	
	// getter y setter de num canciones
	public int getNumCanciones() {
		return numCanciones;
	}
	public void setNumCanciones(int newNumCanciones) {
		this.numCanciones = newNumCanciones;
	}
	
	// getter y setter de precio
	public int getPrecio () {
		return precio;
	}
	public void setPrecio(int newPrecio) {
		this.precio = newPrecio;
	}
	
	//getter y setter de fecha compra
	public String getFechaCompra() {
		return fechaCompra;
	}
	public void setFechaCompra(String newFechaCompra) {
		this.fechaCompra = newFechaCompra;
	}
}
