/*
1) Crear una clase Disco para guardar información sobre los discos de música que
tenemos.
La información asociada a cada uno de los discos es:
Titulo, nº de canciones, precio y fecha de compra.

Todos los getters y setters se crean en una clase aparte sin un main. Luego las variables pueden ser
utilizadas en otras clases dentro de este paquete.
*/
package tema5_2;

public class Discos {

	
	private String titulo;
	private int numCanciones;
	private int precio;
	private String fechaCompra;
	
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
