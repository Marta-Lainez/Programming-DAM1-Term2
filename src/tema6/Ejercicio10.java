/*
10) Escribe una aplicaci�n que juegue tres en raya. Representa el tablero como una matriz cuadrada
de 3 caracteres. La matriz se inicializa en espacios en blanco y a cada jugador se le pregunta en
qu� posici�n quiere introducir su marca. La posici�n del primer jugador est� marcada en el
tablero con una "O" y la posici�n del segundo jugador est� marcada con una "X". Continuar el
proceso hasta que un jugador gana o el juego es un empate.
Para ganar, un jugador debe tener tres marcas en una fila, en una columna o en una diagonal.
Se produce un empate cuando el tablero est� lleno y nadie ha ganado.
La posici�n de cada jugador debe ingresarse como �ndices: es decir, un n�mero de fila, un
espacio y un n�mero de columna. Haz la aplicaci�n f�cil de usar. Despu�s de cada juego,
imprime un diagrama del tablero que muestre las posiciones finales.
Mant�n una cuenta del n�mero de juegos que cada jugador ha ganado. Antes del comienzo de
cada juego, pregunta a cada jugador si desea continuar. Si alguno de los jugadores desea
abandonar, imprime las estad�sticas y acaba.
*/
package tema6;
import java.util.Scanner;
/**
 * <h2>Programa que crea un tres en raya interactivo para 2 personas</h2>
 * @see TresEnRaya
 * @author Marta Lainez
 * @Date 12/02/2022
 * @version 1.0
 */
public class Ejercicio10 extends TresEnRaya{
	/**
	 * Importa los metodos de la clase TresEnRaya para poder jugar al juego ya sea solo o con un compa�ero
	 * @param args Main de la clase Ejercicio10
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Para jugar, observe el teclado numerico de la derecha de su teclado. "
				+ "Utilice las teclas para posicionar su figura. Ejemplo: 7 es primera fila primera columna.");
		do {
			juego(tablero, turno);
			System.out.println("�Quieren seguir jugando? Si/No");
			jugar = teclado.next();
		}while(jugar.equals("Si"));
		System.out.println("Victorias X: " + contadorVictoriasX);
		System.out.println("Victorias O: " + contadorVictoriasO);
		System.out.println("Empates: " + contadorEmpates);
		System.out.println("El juego ha terminado. Gracias por jugar.");
		
	}

}
