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
package tema7_1;
import java.util.Scanner;
public class Ej3Empleado {
	protected String nombreEmpresa;
	protected String nombre;
	protected int edad;
	protected double porcentajeIncremento;
	protected double sueldoBase;
	protected double sueldoFinal;
	public Ej3Empleado() {
		nombreEmpresa = "Eléctrica, SA";
		sueldoBase = 1000;
		dameDatos();
		sueldoFinal = sueldoBase * + sueldoBase * (porcentajeIncremento / 100);
	}
	public void dameDatos() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Datos de Empleado:" + "\r\n");
		System.out.println("\tNombre: ");
		nombre = teclado.nextLine();
		System.out.println("\tedad: ");
		edad = teclado.nextInt();
		System.out.println("\t: Porcentaje de incremento en el sueldo sobre 100: ");
		porcentajeIncremento = teclado.nextDouble();
	}
	public void imprime() {
		System.out.println("Datos empleado:" + "\r\n" +"\tNombre de la empresa: " + nombreEmpresa
				+ "\r\n" + "\tNombre: " + nombre +  "\r\n" + "\tedad: " + edad + "\tedad: " + edad
				+ "\tSueldo Base: " + sueldoBase + "\tPorcentaje de incremento de sueldo sobre 100: "
				+ porcentajeIncremento + "\r\n" + "Sueldo final: " + sueldoFinal);
	}
}