/*
10) Escribe una aplicación que juegue tres en raya. Representa el tablero como una matriz cuadrada
de 3 caracteres. La matriz se inicializa en espacios en blanco y a cada jugador se le pregunta en
qué posición quiere introducir su marca. La posición del primer jugador está marcada en el
tablero con una "O" y la posición del segundo jugador está marcada con una "X". Continuar el
proceso hasta que un jugador gana o el juego es un empate.
Para ganar, un jugador debe tener tres marcas en una fila, en una columna o en una diagonal.
Se produce un empate cuando el tablero está lleno y nadie ha ganado.
La posición de cada jugador debe ingresarse como índices: es decir, un número de fila, un
espacio y un número de columna. Haz la aplicación fácil de usar. Después de cada juego,
imprime un diagrama del tablero que muestre las posiciones finales.
Mantén una cuenta del número de juegos que cada jugador ha ganado. Antes del comienzo de
cada juego, pregunta a cada jugador si desea continuar. Si alguno de los jugadores desea
abandonar, imprime las estadísticas y acaba.
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
	 * Importa los metodos de la clase TresEnRaya para poder jugar al juego ya sea solo o con un compañero
	 * @param args Main de la clase Ejercicio10
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Para jugar, observe el teclado numerico de la derecha de su teclado. "
				+ "Utilice las teclas para posicionar su figura. Ejemplo: 7 es primera fila primera columna.");
		do {
			juego(tablero, turno);
			System.out.println("¿Quieren seguir jugando? Si/No");
			jugar = teclado.next();
		}while(jugar.equals("Si"));
		System.out.println("Victorias X: " + contadorVictoriasX);
		System.out.println("Victorias O: " + contadorVictoriasO);
		System.out.println("Empates: " + contadorEmpates);
		System.out.println("El juego ha terminado. Gracias por jugar.");
		
	}

}
