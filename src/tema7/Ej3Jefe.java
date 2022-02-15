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
public class Ej3Jefe extends Ej3Empleado{
	protected double plusSalario;
	protected String departamento;
	protected double sueldoFinalJefe;
	public Ej3Jefe() {
		plusSalario = 250;
		dameDepartamento();
		sueldoFinalJefe = sueldoFinal + plusSalario;
	}
	public void dameDepartamento() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("\tDepartamento: ");
		departamento = teclado.nextLine();
	}
	public void imprime() {
		System.out.print("Jefe ");
		super.imprime();
		System.out.println("\tPlus ya añadido en el salario: " + plusSalario + "\r\n" + "Departamento: " + departamento);
		System.out.println();
	}
}
