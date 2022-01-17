/**
2) Crear una clase llamada Empleado que contenga como datos miembro el nombre y
el número de empleado, y como métodos miembro leerDatos( ) para leer los datos
desde teclado y verDatos( ) para mostrarlos en pantalla, además de los getters y
setters que sean necesarios.
 */
package tema5_2;

import java.util.Scanner;

public class Empleado {

	private String nombre;
	private int numero;

	// Getter y Setter de nombre
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String newNombre) {
		this.nombre = newNombre;
	}

	// Getter y Setter de numero
	public int getNumero() {
		return numero;
	}

	public void setNumero(int newNumero) {
		this.numero = newNumero;
	}

	public void leerDatos() {
		Scanner teclado = new Scanner(System.in);

		// Pedimos al usuario que inserte el nombre y numero del empleado

		System.out.print("Nombre del trabajador: ");
		setNombre(teclado.nextLine());

		System.out.print("Numero del empleado: ");
		setNumero(teclado.nextInt());
	}

	public void verDatos() {
		leerDatos();
		System.out.println("Nombre del empleado: " + getNombre() + "\r\n" + "Numero del empleado: " + getNumero());
	}
}
