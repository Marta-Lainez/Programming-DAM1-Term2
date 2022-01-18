/**
5) Desarrollar un programa en Java que utilice una clase que se llame Indicador que
sea la representación de un indicador de la vida real (indicadores de nivel, de
velocidad, tacómetros, etc.). Deberá tener los mínimos elementos para representar
valores, ajustarlos con un valor de inicio, imprimir el valor, modificarlos a un valor
determinado e incrementar y disminuir el valor con el que cuentan.
 */
package tema5_2;

public class Indicador {
	private int valor;
	
	public void setValor (int newValor) {
		this.valor = newValor;
	}
	public int getValor() {
		return valor;
	}
	
	// Constructor que da valores iniciales a los atributos de Indicador
	public Indicador(){
		valor = 0;
	}
	// Metodo que cambia el valor de ese atributo a otro valor
	
	public int modificarValor() {
		setValor(60);
		return getValor();
	}
	// Metodo que añade al valor, otro (sumandolos)
	public void incrementoValor(int incremento) {
		setValor(getValor()+ incremento);
	}
	// Metodo que resta un valor a nuestro valor
	public void decrementoValor(int decremento) {
		setValor(getValor()-decremento);
	}
}
