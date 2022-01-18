/**
5) Desarrollar un programa en Java que utilice una clase que se llame Indicador que
sea la representación de un indicador de la vida real (indicadores de nivel, de
velocidad, tacómetros, etc.). Deberá tener los mínimos elementos para representar
valores, ajustarlos con un valor de inicio, imprimir el valor, modificarlos a un valor
determinado e incrementar y disminuir el valor con el que cuentan.
 */
package tema5_2;

public class PruebaIndicador {

	public static void main(String[] args) {
		Indicador miIndicador = new Indicador();
		System.out.println("Valor inicial: " + miIndicador.getValor()); // Imprimo valor inicial
		System.out.println("Nuevo valor: " + miIndicador.modificarValor()); // Imprimo nuevo valor (60)
		miIndicador.incrementoValor(5); // Añado a valor 5
		System.out.println("Incremento del valor: " + miIndicador.getValor()); // Imprimo valor (60 + 5)
		miIndicador.decrementoValor(10); // Resto a valor 10
		System.out.println("Decremento del valor: " + miIndicador.getValor()); // Imprimo valor (65 - 10)
		
	}

}
