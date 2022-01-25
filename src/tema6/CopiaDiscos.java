package tema6;

public class CopiaDiscos {
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
