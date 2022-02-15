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
public class Ejercicio1 {
	public static void main(String[]args) {
		Scanner teclado = new Scanner(System.in);
		//Pedimos datos a usuario
		int numeroEmpleados;
		int numeroJefes;
		System.out.println("Dame el numero de empleados:");
		numeroEmpleados = teclado.nextInt();
		System.out.println("Dame el numero de jefes:");
		numeroJefes = teclado.nextInt();
		//Creamos vector de empleado y vector de jefe
		
		Ej1Empleado[] vectorEmpleados = new Ej1Empleado[numeroEmpleados];
		
		Ej1Empleado[] vectorJefes = new Ej1Jefe[numeroJefes];
		for(int i = 0; i < numeroEmpleados; i++) {
			vectorEmpleados[i] = new Ej1Empleado();
		}
		for(int i = 0; i < numeroJefes; i++) {
			vectorJefes[i] = new Ej1Jefe();
		}
		for(int i = 0; i < numeroEmpleados; i++) {
			System.out.println();
			vectorEmpleados[i].imprimeDatos();
		}
		for(int i = 0; i < numeroJefes; i++) {
			System.out.println();
			vectorJefes[i].imprimeDatos();
		}
	}
}
