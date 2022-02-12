/*
 9)Escribe un proyecto en Java que tenga: una clase llamada Comedor en la que estar� el m�todo
  main() y en la que se instanciar�n los objetos de las clases que sean necesarias para:
� Mostrar la carta de un restaurante en el que se ofrecen 6 platos. En cada plato se
  mostrar�n los ingredientes que lo componen y el precio de ese plato.
� Se supone que en el restaurante se pueden servir en un d�a un m�ximo de 100 men�s.
  Cada men� consta de dos platos y a la bebida y el postre invita la casa.
� A cada cliente que vaya al restaurante se le anotar� cu�ntos men�s quieren en su mesa,
  qu� platos han formado cada uno y el precio de cada men�. A la hora de pagar se
  mostrar� en pantalla: el detalle de los men�s que tiene que pagar, indicando el precio
  de cada plato y el de cada men�, el total a pagar, el dinero entregado y el cambio.
 */
package tema6;

public class Plato {
	private String ingredientes;
	private double precio;
	public Plato() {
		ingredientes = "";
		precio = 0;
	}
	//setter de ingredientes
	public void setIngredientes(String newIngredientes) {
		this.ingredientes = newIngredientes;
	}
	//getter de ingredientes
	public String getIngredientes() {
		return ingredientes;
	}
	//setter de precio
	public void setPrecio(double newPrecio) {
		this.precio = newPrecio;
	}
	// getter de precio
	public double getPrecio() {
		return precio;
	}

}
