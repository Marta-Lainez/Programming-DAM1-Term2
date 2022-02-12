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
import java.util.Scanner;
public class Comedor {
// NO FUNCIONA AUN
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// Creo 6 objetos de tipo plato con su repectiva información (ingredientes y precio)
		Plato pizza = new Plato();
		Plato espaguetis = new Plato();
		Plato garbanzos = new Plato();
		Plato solomillo = new Plato();
		Plato ensalada = new Plato();
		Plato pescado = new Plato();
		pizza.setIngredientes("Pan, Tomate, Jamón, Queso, Maíz, Setas.");
		pizza.setPrecio(12.50);
		espaguetis.setIngredientes("Pasta, Tomate, Chorizo, Queso, Jamón, Atún.");
		espaguetis.setPrecio(8.25);
		garbanzos.setIngredientes("Garbanzos, Salsa de la casa, Pan.");
		garbanzos.setPrecio(10.99);
		solomillo.setIngredientes("Solomillo, Patatas, Pan, esparragos.");
		solomillo.setPrecio(14);
		ensalada.setIngredientes("Tomate feo, Rúcula, Jamón, Maíz, Bonito, Esparragos, Olivas, Queso, Pollo.");
		ensalada.setPrecio(10.99);
		pescado.setIngredientes("Pescado, Patatas.");
		pescado.setPrecio(12.50);
		// Creo un vector de tipo plato de tamaño 6 con los objectos que acabo de crear
		Plato[] miCarta = {pizza, espaguetis, garbanzos, solomillo, ensalada, pescado};
		// Imprimo todos los platos y su info
		System.out.println("Carta:" + "\r\n" + "\tPizza: " + pizza.getIngredientes() + " " + pizza.getPrecio() + " euros."
				+ "\r\n" + "\tEspaguetis: " + espaguetis.getIngredientes() + " " + espaguetis.getPrecio() + " euros."
				+ "\r\n" + "\tGarganzos: " + garbanzos.getIngredientes() + " " + garbanzos.getPrecio() + " euros."
				+ "\r\n" + "\tSolomillo: " + solomillo.getIngredientes() + " " + solomillo.getPrecio() + " euros."
				+ "\r\n" + "\tEnsalada: " + ensalada.getIngredientes() + " " + ensalada.getPrecio() + " euros."
				+ "\r\n" + "\tPescado: " + pescado.getIngredientes() + " " + pescado.getPrecio() + " euros.");
		// Creo vector bebidas y vector postres
		String[] bebidas = {"Agua", "Cocacola"};
		String[] postres = {"Panacota", "Creppe", "Fruta"};
		
		System.out.println("¿Cuantos menus quiere?");
		int menus = teclado.nextInt();
		if (menus > 99) {
			System.out.println("Lo sentimos pero no tenemos tantos menus.");
		}
		else {
			Menu[] miMenu = new Menu [menus];
			boolean correcto = false;
			double precio = 0;
			double precioTotal = 0;
			// bucle para acumular la informacion de todos los menus
			for (int contador = 0; contador < menus; contador++) {
				
				// Primer plato del menu
				while (correcto == false) {
					System.out.println("Menu " + contador + 1 + "\r\n¿Qué quiere de primer plato?");
					String plato = teclado.next();
					switch (plato) {
						case "Pizza":
							miMenu[contador].setPlato1(plato);
							miMenu[contador].setPrecio(pizza.getPrecio());
							correcto = true;
						break;
						case "Espaguetis":
							miMenu[contador].setPlato1(plato);
							precio = espaguetis.getPrecio();
							miMenu[contador].setPrecio(precio);
							correcto = true;
						break;
						case "Garbanzos":
							miMenu[contador].setPlato1(plato);
							precio = garbanzos.getPrecio();
							miMenu[contador].setPrecio(precio);
							correcto = true;
						break;
						case "Solomillo":
							miMenu[contador].setPlato1(plato);
							precio = solomillo.getPrecio();
							miMenu[contador].setPrecio(precio);
							correcto = true;
						break;
						case "Ensalada":
							miMenu[contador].setPlato1(plato);
							precio = ensalada.getPrecio();
							miMenu[contador].setPrecio(precio);
							correcto = true;
						break;
						case "Pescado":
							miMenu[contador].setPlato1(plato);
							precio = pescado.getPrecio();
							miMenu[contador].setPrecio(precio);
							correcto = true;
						break;
						default:
							System.out.println("Ese plato no esta en nuestro menu. Elija uno correcto.");
							correcto = false;
					}
				}
				correcto = false;
				
				while (correcto == false) {
					System.out.println("Menu " + contador + 1 + "\r\n¿Qué quiere de segundo plato?");
					String plato2 = teclado.next();
					switch (plato2) {
						case "Pizza":
							miMenu[contador].setPlato2(plato2);
							miMenu[contador].setPrecio(pizza.getPrecio() + precio);
							correcto = true;
						break;
						case "Espaguetis":
							miMenu[contador].setPlato2(plato2);
							miMenu[contador].setPrecio(espaguetis.getPrecio() + precio);
							correcto = true;
						break;
						case "Garbanzos":
							miMenu[contador].setPlato2(plato2);
							miMenu[contador].setPrecio(garbanzos.getPrecio() + precio);
							correcto = true;
						break;
						case "Solomillo":
							miMenu[contador].setPlato2(plato2);
							miMenu[contador].setPrecio(solomillo.getPrecio() + precio);
							correcto = true;
						break;
						case "Ensalada":
							miMenu[contador].setPlato2(plato2);
							miMenu[contador].setPrecio(ensalada.getPrecio() + precio);
							correcto = true;
						break;
						case "Pescado":
							miMenu[contador].setPlato2(plato2);
							miMenu[contador].setPrecio(pescado.getPrecio() + precio);
							correcto = true;
						break;
						default:
							System.out.println("Ese plato no está en nuestro menú. Elija uno correcto.");
							correcto = false;
					}
				}
				correcto = false;
				
				while (correcto == false) {
					System.out.println("¿Qué bebida quiere?");
					String bebida = teclado.next();
					switch (bebida) {
						case "Agua":
							miMenu[contador].setBebida(bebida);
							correcto = true;
						break;
						case "Espaguetis":
							miMenu[contador].setPlato1(bebida);
							correcto = true;
						break;
						default:
							System.out.println("Esa bebida no está en nuestro menú. Elija una correcta");
							correcto = false;
					}
				}
				correcto = false;
				
				while (correcto == false) {
					System.out.println("¿Qué postre quiere?");
					String postre = teclado.next();
					switch (postre) {
						case "Panacota":
							miMenu[contador].setPostre(postre);
							correcto = true;
						break;
						case "Creppe":
							miMenu[contador].setPlato1(postre);
							correcto = true;
						break;
						case "Fruta":
							miMenu[contador].setPlato1(postre);
							correcto = true;
						break;
						default:
							System.out.println("Esa bebida no está en nuestro menú.");
							correcto = false;
					}
				}
				precioTotal += miMenu[contador].getPrecio();
				System.out.println(contador + ": " + miMenu[contador].getPlato1() + ", " + miMenu[contador].getPlato2()
						+ ", " + miMenu[contador].getBebida() + ", " + miMenu[contador].getPostre() + ". Son: " +
						miMenu[contador].getPrecio() + " euros.");
			}
			System.out.println("Total a pagar: " + precioTotal + "\r\n" + "¿Cúanto abona?");
			double pago = teclado.nextDouble();
			double cambio = 0;
			correcto = false;
			while (correcto == false) {
				if (pago > precioTotal || pago == precioTotal) {
				cambio = pago - precioTotal;
				correcto = true;
				}
				else {
					System.out.println("No es suficiente. ¿Cuánto va a abonar?");
					pago = teclado.nextDouble();
				}
			}
			System.out.println("Coste total: " + precioTotal + ". Dinero abonado: " + pago + ". Cambio: " + cambio + ".");
		
		}
		
				
	}

}
