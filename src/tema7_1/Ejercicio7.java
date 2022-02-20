/*
Ejercicio 7
1. Crea una clase abstracta y una interfaz (vac�as).
2. Crea una clase que herede la clase abstracta y otra clase que implemente la interfaz. Inserta
dos datos en cada clase.
3.Inserta dos datos en la clase abstracta. Prueba a poner a dichos datos los modificadores de
visibilidad: nada (package), protected, private y public. Comprueba cu�les te deja.
4. Inserta dos datos en la interfaz. Prueba a poner a dichos datos los modificadores de
visibilidad: nada (package), protected, private y public. Comprueba cu�les te deja y si te obliga
a asignarle un valor.
5. Inserta dos m�todos en la clase abstracta (uno abstracto y el otro no). Prueba a poner a
dichos m�todos los modificadores de visibilidad: nada (package), protected, private y public.
Comprueba cu�les te deja.
6.Inserta dos m�todos en lainterfaz. Prueba a poner a dichos m�todos los modificadores de
visibilidad: nada (package), protected, private y public. Comprueba cu�les te deja.
7. Prueba a crear una funci�n constructora dentro de la interfaz.
8. Ver�s que te ha dado errores en la clase que hereda la clase abstracta y en la clase que
implementa la interfaz. Resu�lvelo.
9. Pon una funci�n constructora con un mensaje en la clase que hereda la clase abstracta y en
la propia clase abstracta. Instancia un objeto de la clase que hereda la clase abstracta y
compruebe el orden de ejecuci�n de las funciones constructoras.
10. Crea un objeto del tipo de la interfaz y, en otra instrucci�n diferente, inst�ncialo con la
propia interfaz. �Cu�l es la instrucci�n que te da error?
11.Crea un objeto del tipo de la clase abstracta y, en otra instrucci�n diferente, inst�ncialo
usando la propia clase abstracta. �Cu�l es la instrucci�n que te da error?
12.Prueba a poner un m�todo de la clase abstracta como public y en la clase que la hereda pon
dicho m�todo como protected. �Qu� sucede?
13.Crea un objeto del tipo de la clase abstracta e inst�ncialo con la clase que hereda dicha
clase abstracta. Comprueba que esto es posible; pero comprueba, tambi�n, que los m�todos
que se pueden usar son los de la clase abstracta (que es el tipo del objeto) y no los m�todos y
datos de la clase que la hereda (la que se us� para hacer la instancia).
 */
package tema7_1;

// Creo clase abtrscta vacia
abstract class ClaseAbstracta{
	// A�ado 2 datos. Deja ponerles los siguientes modificadores de visibilidad:
	// default(nada), protected, private y public. Me deja poner todos
	int num5;
	int num6;
	
	// Creo dos metodos, uno abstracto y uno no abstracto.
	// Default, public y protected funcionan en ambos. Private solo funciona en el no abstracto.
	// CONCLUSION: Los metodos abstractos no pueden ser private.
	protected void imprime () {}
	protected abstract void imprimeAbstracto();
	
	// Creamos un constructor con un mensaje aqui y en la clase que hereda
	public ClaseAbstracta() {
		System.out.println("Mensaje de la clase abstracta");
	}
	
	// Pruebo a poner un metodo en public
	public void prueba() {} // Todo bien
}
// Creo interfaz vacia
interface Interfaz{
	// A�ado 2 datos. Deja ponerles los siguientes modificadores de visibilidad:
	// default(nada) si se inicializa un valor. Public si se inicializa un valor.
	// Private no deja ni cuando se inicializa. Pasa igual con protected
	//protected int num7 = 7;
	//protected int num8;
	
	// Creo dos metodos, uno abstracto y uno no abstracto. 
	private void imprime () {} // En el no abstracto solo funciona private
	abstract void imprimeAbstracto(); // En el abstracto solo funciona el default y public
	
	// Pruebo a crear un constructor en la interfaz
	// public Interfaz(){} No deja ya que las interfaces no pueden tener constructores
}
// Creo una clase que hereda la clase abstracta
class Hereda extends ClaseAbstracta{
	// A�ado 2 datos
	int num1;
	int num2;
	
	// El metodo daba error ya que al hacer extend de una clase abstracta, hay que reemplazar sus metodos abstractos
	public void imprimeAbstracto() {}
	
	// Creamos un constructor con un mensaje aqui y en la clase abstracta
	public Hereda() {
		System.out.println("Mensaje de la clase que Hereda");
	}
	
	// Pruebo a poner el metodo public de la clase abstracta como protected
	// protected void prueba() {} // Error. No se puede REDUCIR la visibilidad
}
// Creo una clase que implementa la interfaz
class Implementa implements Interfaz{
	// A�ado 2 datos
	int num3;
	int num4;
	
	// El metodo daba error ya que al hacer extend de una clase abstracta, hay que reemplazar sus metodos abstractos
		public void imprimeAbstracto() {}
}
public class Ejercicio7{
	public static void main (String [] args) {
		// Ahora instanciamos un objeto de la clase Hereda para ver que constructor se ejecuta antes, si el
		// de la superclase (claseAbstracta) o la subclase (Hereda)
		Hereda miObjeto = new Hereda(); // Se ejecuta antes el constructor de la superclase que el de la subclase
		
		// Creo un objeto del tipo de la interfaz PARTE 10 DUDA INSTANCIAR
		//Interfaz miInterfaz = new interfaz(); //Da error
	
		// Creo un objeto de la clase abstracta PARTE 11 DUDA INSTANCIAR
		//claseAbstracta miClaseAbstracta = new claseAbstracta(); // Da error porque no se puede crear un objeto de una clase abstracta
		
		
		// DUDA PARTE 13
		
	}
}

