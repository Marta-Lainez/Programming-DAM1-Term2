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

public class Menu {
	private String plato1;
	private String plato2;
	private String postre;
	private String bebida;
	private double precio;
	public String getPlato1() {
		return plato1;
	}
	public void setPlato1(String plato1) {
		this.plato1 = plato1;
	}
	public String getPlato2() {
		return plato2;
	}
	public void setPlato2(String plato2) {
		this.plato2 = plato2;
	}
	public String getPostre() {
		return postre;
	}
	public void setPostre(String postre) {
		this.postre = postre;
	}
	public String getBebida() {
		return bebida;
	}
	public void setBebida(String bebida) {
		this.bebida = bebida;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
}
