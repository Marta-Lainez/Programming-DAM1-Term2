/*
Ejercicio 5
Crea una clase que sea abstracta y lleva a cabo las siguientes comprobaciones:
1. Inserta m�todos no abstractos.
2. Inserta m�todos abstractos.
3. Pon cuerpo a un m�todo abstracto.
4. Declara un objeto con ese tipo de clase.
5. Haz un new a dicho objeto (con el nombre de dicha clase).
6. Declara un atributo abstracto.
7. Crea una nueva clase que no sea abstracta y prueba a insertar un m�todo que sea
abstracto.
Haz que esa clase herede de la clase abstracta y comprueba que te obliga a insertar los
m�todos abstractos que tiene dicha clase.
 */
package tema7;

public class Ejercicio5 extends Ej5ClaseAbstracta{

	public static void main(String[] args) {
		// Ej5ClaseAbstracta miMetodo = new Ej5claseAbstracta(); No se puede crear un objeto de una clase abstracta
		
	}
	public int suma() {
		int resultado = 2*2;
		return resultado;
	}
}
