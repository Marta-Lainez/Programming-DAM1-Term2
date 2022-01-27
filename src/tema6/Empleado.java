/*
6) Escribe un programa que utilice la clase Empleado, creando un vector de objetos de la clase
Empleado y luego lo llene con datos correspondientes a 50 empleados (utilizar una tabla de
nombres para rellenar con un random). Una vez rellenado, visualizar los datos de todos los
empleados
 */
package tema6;

import java.util.Scanner;

public class Empleado {
	private String nombre;
	private int numero;
	
	public Empleado() {
		nombre = "Juan";
		numero = 0;
	}
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
