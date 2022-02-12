/* 
9)Escribe un proyecto en Java que tenga: una clase llamada Comedor en la que estará el método
  main() y en la que se instanciarán los objetos de las clases que sean necesarias para:
· Mostrar la carta de un restaurante en el que se ofrecen 6 platos. En cada plato se
  mostrarán los ingredientes que lo componen y el precio de ese plato.
· Se supone que en el restaurante se pueden servir en un día un máximo de 100 menús.
  Cada menú consta de dos platos y a la bebida y el postre invita la casa.
· A cada cliente que vaya al restaurante se le anotará cuántos menús quieren en su mesa,
  qué platos han formado cada uno y el precio de cada menú. A la hora de pagar se
  mostrará en pantalla: el detalle de los menús que tiene que pagar, indicando el precio
  de cada plato y el de cada menú, el total a pagar, el dinero entregado y el cambio.
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
