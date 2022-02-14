/*
Ejercicio 6
1. Crea la clase Jefe que herede de la clase Empleado. ¿Qué ocurre?
2. Quita el modificador “final” a la clase Empleado. Haz que la clase Jefe herede de la
clase Empleado y añade a la clase Jefe un método con esta cabecera: void pedirDatos().
¿Qué ocurre?
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
