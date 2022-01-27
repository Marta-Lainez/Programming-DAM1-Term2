/**
5) Crea una clase que nos permita almacenar una colecci�n de discos. El nombre de la clase ser�
Coleccion. Los datos miembro ser�n:
� Un vector de 100 elementos de la clase Disco.
� Un entero al que llamaremos �ndice que servir� para saber cu�ntos discos hemos
almacenado en la colecci�n.
Dise�a los m�todos necesarios para gestionar la colecci�n.
 */

package tema6;

public class CopiaDiscos {
	private String titulo;
	private int numCanciones;
	private int precio;
	private String fechaCompra;
	
	public CopiaDiscos(){
		titulo = "Vac�o";
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
