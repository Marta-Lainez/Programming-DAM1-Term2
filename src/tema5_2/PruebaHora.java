/**
6) Desarrollar un programa en Java que utilice una clase que se llame Hora con
miembros de tipo int para hora, minutos y segundos. Deber� tener un constructor
para inicializar la hora a 0 o a una hora determinada (hora, minutos, segundos).Se
deber� poder sumar y restar horas, as� como imprimir y leer una hora. El formato de
impresi�n y lectura ser� hh:mm:ss, todo en modo 24 horas.
 */
package tema5_2;

public class PruebaHora {

	public static void main(String[] args) {
		Hora miHora = new Hora();
		
		//Probamos las sumas
		miHora.sumaSegundos(0);
		miHora.sumaMinutos(0);
		miHora.sumaHoras(25);
		System.out.println(miHora.getHora() + ":" + miHora.getMinutos() + ":" + miHora.getSegundos());
	}

}
