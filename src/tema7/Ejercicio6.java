/*
Ejercicio 6
1. Crea la clase Jefe que herede de la clase Empleado. �Qu� ocurre?
2. Quita el modificador �final� a la clase Empleado. Haz que la clase Jefe herede de la
clase Empleado y a�ade a la clase Jefe un m�todo con esta cabecera: void pedirDatos().
�Qu� ocurre?
 */
package tema7;

class Empleado{
	String nombre;
	int edad;
	final void pedirDatos(){}
	void visualDatos(){}
}
//class Jefe extends Empleado{} 1) No se puede mientras empleado sea de tipo final
/*
 * class Jefe extends Empleado{
	void pedirDatos();
	}
	No se puede mientras pedirDatos() sea de tipo final
 */
