/*
Ejercicio 1
Escribe un programa que pida los datos de una serie de empleados que no son jefes, tantos
como el usuario indique. También hay que pedir los datos de una serie de jefes que son, al
mismo tiempo, empleados, tantos como el usuario indique. Una vez insertados todos los
datos, hay que visualizarlos.
De los empleados nos interesa: nombre y sueldo.
De los jefes nos interesa: nombre, sueldo, título y nombre del departamento del que es jefe.
 */
package tema7;
import java.util.Scanner;
public class Ej1Empleado {
	
	protected String nombre;
	protected int sueldo;
	
	public Ej1Empleado() {
		pedirDatos();
	}
	public void pedirDatos() {
		Scanner teclado = new Scanner(System.in);
		System.out.print("\tNOMBRE: ");
		nombre = teclado.nextLine();
		System.out.print("\tSUELDO: ");
		sueldo = teclado.nextInt();
	}
	
	public void imprimeDatos() {
		System.out.print("Datos: ");
		System.out.println("\tNOMBRE: " + nombre);
		System.out.println("\tSUELDO: " + sueldo);
	}
}