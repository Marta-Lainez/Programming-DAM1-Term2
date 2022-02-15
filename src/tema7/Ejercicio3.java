/*
Ejercicio3
Escribe un programa que pida los datos de una serie de empleados y jefes que tiene la
empresa "Eléctrica, SA". De cada empleado nos interesa: nombre de la empresa, nombre del
empleado, edad, porcentaje de incremento de sueldo y sueldo base.
Ten en cuenta lo siguiente:
· El nombre de la empresa es el mismo para todos y es un dato que no se podrá
cambiar.
· El sueldo base es el mismo para todos.
· Cada empleado gana el sueldo base más el porcentaje aplicado a cada empleado.
De los jefes, como empleados que son, nos interesan los mismos datos que antes más el plus
que tiene como jefe y el nombre del departamento del que son responsables. Ten en cuenta
que el plus es el mismo para todos los jefes.
El programa siempre partirá de un sueldo base de 1000€ y de un plus para los jefes de 250€.
Una vez pedidos los datos, se visualizará la información de todos ellos.
 */
package tema7;
import java.util.Scanner;
public class Ejercicio3{

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		// Pedimos numero de empleados y de jefes
		System.out.println("¿Cuántos empleados tiene la empresa Eléctrica, SA?");
		int numEmpleados = teclado.nextInt();
		System.out.println("¿Cuántos jefes tiene la empresa Eléctrica, SA?");
		int numJefes = teclado.nextInt();
		// Importamos los metodos creados para generar los vectores de empleados y jefes
		Ej3Empleado[] empleados = vectorEmpleados(numEmpleados);
		Ej3Jefe[] jefes = vectorJefes(numJefes);
		
		// importo metodo menu
		menu(empleados, jefes);
	}
	/**
	 * Metodo que crea un vector de tipo Ej3Empleado del tamaño pedido en el main
	 * @param numEmpleados pedido en el main por teclado
	 * @return vector empleados, de la clase Ej3empleado
	 */
	static Ej3Empleado[] vectorEmpleados(int numEmpleados) {
		Ej3Empleado[] empleados = new Ej3Empleado[numEmpleados];
		for (int i = 0; i < numEmpleados; i++) {
			empleados[i] = new Ej3Empleado();
		}
		return empleados;
	}
	/**
	 * Metodo que crea un vector de tipo Ej3Jefe del tamaño pedido en el main
	 * @param numJefes pedido en el main por teclado
	 * @return vector jefes, de la clase Ej3Jefe
	 */
	static Ej3Jefe[] vectorJefes(int numJefes) {
		Ej3Jefe[] jefes = new Ej3Jefe[numJefes];
		for (int i = 0; i < numJefes; i++) {
			jefes[i] = new Ej3Jefe();
		}
		return jefes;
	}
	/**
	 * Metodo que imprime todos los datos del vector empleado
	 * @param empleados vector de tipo Ej3Empleado con longitud numEmpleados dado por teclado
	 */
	static void imprimeEmpleados(Ej3Empleado[] empleados) {
		for (int i = 0; i < empleados.length; i++) {
			empleados[i].imprime();
		}
	}
	/**
	 * Metodo que imprime todos los datos del vector jefe
	 * @param jefes vector de tipo Ej3Jefe con longitud numJefes dado por teclado
	 */
	static void imprimeJefes(Ej3Jefe[] jefes) {
		for (int i = 0; i < jefes.length; i++) {
			jefes[i].imprime();
		}
	}
	/**
	 * Metodo que da al usuario la eleccion de modificar el sueldo base, el plus de los jefes, imprimir por pantalla o salida
	 * @param opcion dada por el usuario por teclado para elegir la salida del menu
	 */
	static void menu(Ej3Empleado[] empleados, Ej3Jefe[] jefes) {
		//boolean repetir = true;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("MENU\nOpcion 1:\tModificar el sueldo base de todos los empleados\nOpcion 2:\tModificar el plus de todos los jefes\n."
				+ "Opcion 3:\tVisualizar los datos de todos los empleados\nOpcion 4:\tSalir");
		int opcion = teclado.nextInt();
		switch (opcion) {
		case 1: // Modificar el sueldo base de todos los empleados.
			System.out.println("Nuevo sueldo base de todos los empleados: ");
			double nuevoSalario = teclado.nextDouble();
			for (int i = 0; i < empleados.length; i++) {
				empleados[i].sueldoBase = nuevoSalario;
				empleados[i].sueldoFinal = empleados[i].sueldoBase * + empleados[i].sueldoBase * (empleados[i].porcentajeIncremento / 100);
			}
			System.out.println("Nuevo sueldo base: " + nuevoSalario);
			for (int i = 0; i < jefes.length; i++) {
				empleados[i].sueldoBase = nuevoSalario;
				jefes[i].sueldoFinalJefe = jefes[i].sueldoFinal + jefes[i].plusSalario;
			}
			break;
		case 2: // Modificar el plus de todos los jefes.
			System.out.println("Nuevo plus de todos los jefes: ");
			double nuevoPlus = teclado.nextDouble();
			for (int i = 0; i < jefes.length; i++) {
				jefes[i].plusSalario = nuevoPlus;
				jefes[i].sueldoFinalJefe = jefes[i].sueldoFinal + jefes[i].plusSalario;
			}
			System.out.println("Nuevo plus en jefes: " + nuevoPlus);
			break;
		case 3: // Visualizar los datos de todos los empleados
			System.out.println("Datos empleados:");
			imprimeEmpleados(empleados);
			System.out.println("Datos jefes:");
			imprimeJefes(jefes);
			break;
		case 4: // Salir
			System.out.println("Saliendo. Muchas gracias");
			break;
		default:
			System.out.println("Esa no es una opción válida");
		}
	}

}
