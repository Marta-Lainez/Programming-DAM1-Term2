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
 * @see Ejercicio10
 * @author Marta Lainez
 * @Date 12/02/2022
 * @version 1.0
 */
public class TresEnRaya {
	protected static String[][] tablero = { {" "," "," "}, {" "," "," "}, {" "," "," "} };
	protected static int turno;
	protected static int contadorVictoriasX;
	protected static int contadorVictoriasO;
	protected static int contadorEmpates;
	protected static String jugar;
	protected static boolean victoria;
	/**
	 * Constructor de la clase TresEnRaya
	 * @since 1.0
	 */
	public TresEnRaya() {
		turno = 1;
		contadorVictoriasX = 0;
		contadorVictoriasO = 0;
		contadorEmpates = 0;
		jugar = "Si";
		victoria = false;
	}
	/**
	 * Comprueba si en el tablero hay alguna fila, columna o diagonal que contenga 3 veces X o O. Si es el caso, devuelve si es la X o la O quien lo ha conseguido
	 * @param tablero importa la matriz tablero sobre la que jugaremos el 3 en raya
	 * @param victoria importa el booleano victoria para que una vez detecte que se ha completado una fila, ponga victoria a true
	 * @return devuelve el estado boolean victoria que puede ser true o false
	 * @since 1.0
	 */
	static String victoria(String[][] tablero, boolean victoria) {
		
		char ganador = ' ';
		
		// Mira 1 a 1 si alguna fila tiene el mismo elemento en las 3 casillas. Ejemplo: OOO
		for (int fila = 0; fila < 3; fila++) {
			if (tablero[fila][0].equals(tablero[fila][1]) && tablero [fila][1].equals(tablero [fila][2])) {
				if (tablero[fila][0].equals("X") || tablero[fila][0].equals("O")) {
					victoria = true;
					if (tablero[fila][0].equals("X")) {
						ganador = 'X';
					}
					else
						ganador = 'O';
				}
			}	
		}
		// Mira 1 a 1 si alguna columna de la matriz tiene el mismo elemento en las 3 casillas
		if (victoria == false) {
			for (int columna = 0; columna < 3; columna++) {
				if (tablero[0][columna].equals(tablero [1][columna]) && tablero [1][columna].equals(tablero [2][columna])) {
					if (tablero[0][columna].equals("X") || tablero[0][columna].equals("O")) {
						victoria = true;
						if (tablero[0][columna].equals("X")) {
							ganador = 'X';
						}
						else
							ganador = 'O';
					}	
				}
			}
		}
		
		// Mira si la primera diagonal de la matriz contiene el mismo elemento en las 3 casillas
		if (victoria == false && tablero [0][0].equals(tablero[1][1]) && tablero[1][1].equals(tablero[2][2])) {
			if (tablero[0][0].equals("X") || tablero[0][0].equals("O")) {
				victoria = true;
				if (tablero[0][0].equals("X")) {
					ganador = 'X';
				}
				else
					ganador = 'O';
			}
		}
		// Si no, mira si la segunda diagonal de la matriz contiene el mismo elemento en las 3 casillas
		else if (victoria == false && tablero [0][2].equals(tablero[1][1]) && tablero[1][1].equals(tablero[2][0])) {
			if (tablero[0][2].equals("X") || tablero[0][2].equals("O")) {
				victoria = true;
				if (tablero[0][2].equals("X")) {
					ganador = 'X';
				}
				else
					ganador = 'O';
			}
		}
		if (victoria == true) {
			return "Victoria: " + ganador;
		}
		else
			return "";
	}
	/**
	 * Este metodo imprime una matriz / tablero de nuestro juego para que los jugadors vean su progreso
	 * @param tablero importa la matriz que se imprimira en el metodo
	 * @since 1.0
	 */
	static void imprimeTablero(String[][] tablero) {
		for (int fila = 0; fila < 3; fila++) {
			System.out.print("|");
			for (int columna = 0; columna < 3; columna++) {
				System.out.print(tablero[fila][columna] + "|");
			}
			System.out.println("");
		}
		System.out.println("*******");
	}
	/**
	 * Este metodo crea una nueva matriz / tablero para que cada vez que se comience un juego se haga sobre un tablero limpio
	 * @param tablero
	 * @since 1.0
	 */
	static void creaTablero(String[][] tablero) {
		for (int fila = 0; fila < 3; fila++) {
			System.out.print("|");
			for (int columna = 0; columna < 3; columna++) {
				tablero[fila][columna] = " ";
				System.out.print(tablero[fila][columna] + "|");
			}
			System.out.println("");
		}
		System.out.println("*******");
	}
	/**
	 * Este metodo crea una partida entera del 3 en raya. Utiliza todos los metodos anteriores para conseguirlo.
	 * @param tablero Sobre el jugamos la partida al 3 en raya
	 * @param turno Indica a que jugador le toca jugar, X o O
	 * @since 1.0
	 */
	static void juego(String[][] tablero, int turno) {
		Scanner teclado = new Scanner (System.in);
		turno = 1; // Lo inicializo a 1 en el constructor pero si no pongo esta linea sale como 0. Puede ser
		// por no haber creado un objeto? En ese caso el constructor es inutil?
		int posicionFicha;
		boolean terminar = false;
		creaTablero(tablero);
		//turno imparares juega con X, turno pares juega con O
		do {
			System.out.println();
			posicionFicha = teclado.nextInt();
			
			switch (posicionFicha) {
			case 7:
				if (turno % 2 != 0) {
					tablero[0][0] = "X";
				}
				else
					tablero[0][0] = "O";
				break;
			case 8:
				if (turno % 2 != 0) {
					tablero[0][1] = "X";
				}
				else
					tablero[0][1] = "O";
				break;
			case 9:
				if (turno % 2 != 0) {
					tablero[0][2] = "X";
				}
				else
					tablero[0][2] = "O";
				break;
			case 4:
				if (turno % 2 != 0) {
					tablero[1][0] = "X";
				}
				else
					tablero[1][0] = "O";
				break;
			case 5:
				if (turno % 2 != 0) {
					tablero[1][1] = "X";
				}
				else
					tablero[1][1] = "O";
				break;
			case 6:
				if (turno % 2 != 0) {
					tablero[1][2] = "X";
				}
				else
					tablero[1][2] = "O";
				break;
			case 1:
				if (turno % 2 != 0) {
					tablero[2][0] = "X";
				}
				else
					tablero[2][0] = "O";
				break;
			case 2:
				if (turno % 2 != 0) {
					tablero[2][1] = "X";
				}
				else
					tablero[2][1] = "O";
				break;
			case 3:
				if (turno % 2 != 0) {
					tablero[2][2] = "X";
				}
				else
					tablero[2][2] = "O";
				break;
			}
			turno++;
			imprimeTablero(tablero);
			String ganador = victoria(tablero, victoria);
			if (ganador.length() > 1) {
				terminar = true;
			}
			if (terminar == true) {
				System.out.println(ganador);
				if (ganador.charAt(10) == 'X') {
					contadorVictoriasX++;
				}
				else
					contadorVictoriasO++;
			}
			if (turno == 9 && terminar == false) {
				System.out.println("Empate");
				contadorEmpates++;
				terminar = true;
			}
		}while (terminar == false);
		turno = 1;
	}
}
