/*
Ejercicio 5
Crea una clase que sea abstracta y lleva a cabo las siguientes comprobaciones:
1. Inserta métodos no abstractos.
2. Inserta métodos abstractos.
3. Pon cuerpo a un método abstracto.
4. Declara un objeto con ese tipo de clase.
5. Haz un new a dicho objeto (con el nombre de dicha clase).
6. Declara un atributo abstracto.
7. Crea una nueva clase que no sea abstracta y prueba a insertar un método que sea
abstracto.
Haz que esa clase herede de la clase abstracta y comprueba que te obliga a insertar los
métodos abstractos que tiene dicha clase.
 */
package tema7;
import java.util.Scanner;
abstract class Ej5ClaseAbstracta {
	// abstract int num1; No se puede crear un atributo abstracto
	public void imprime() {
		System.out.println("Imprimo en clase no abstracta.");
	}
	public abstract int suma ();
	/*
	public abstract void resta () {
	}
	No se puede crear un metodo abstracto con cuerpo
	 */
	
	
}
