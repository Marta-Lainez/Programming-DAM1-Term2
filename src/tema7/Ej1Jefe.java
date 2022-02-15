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

public class Ej1Jefe extends Ej1Empleado {
	protected String titulo;
	protected String departamento;
	public Ej1Jefe() {
		dameDatosJefe();
	}
	public void imprimeDatos() {
		System.out.println("JEFES: ");
		super.imprimeDatos();
		System.out.println("\tTITULO: "
                + titulo);
		System.out.println("\tDEPARTAMENTO: "
                + departamento);
		
	}
	public void dameDatosJefe() {
		Scanner teclado = new Scanner(System.in);
		System.out.print("\tTITULO: ");
		titulo = teclado.nextLine();
		System.out.print("\tDEPARTAMENTO: ");
		departamento = teclado.nextLine();
		
	}
	
	
}
