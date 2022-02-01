/**
8) Diseñar la clase Cuentas para crear un vector de 100 objetos (de la clase CuentaCorriente).
Escribir un programa que utilice la clase Cuentas que permita obtener el titular y código de la
cuenta con mayor saldo. Para ello se sugiere crear un vector de saldos, ordenarlo en orden
creciente y, tomando el último valor que almacene, compararlo con el saldo de los diferentes
objetos mediante un metodo getSaldo y mostrar por pantalla los que sean iguales que el saldo
máximo.
 */
package tema6;
import java.util.Arrays;
public class Cuentas {
	// Metodo que crea un vector de 100 objectos CuentaCorriente con su resppectiva informacion
	// (Titular, Saldo y Código)
	static CuentaCorriente[] creaVector() {
		CuentaCorriente[] vector = new CuentaCorriente [100];
		for (int i = 0; i < vector.length; i++) {
			vector[i] = new CuentaCorriente();
			vector[i].setTitular("Titular");
			vector[i].setSaldo((int)(Math.random()*1000)+1);
			vector[i].setCodigo("00000000");
		}
		return vector;
	}
	
	public static void main (String [] args) {
		// Invocamos el vector del metodo creaVector
		CuentaCorriente[] vector = creaVector();
		// Creamos un nuevo vector Double para almacenar los saldos del vector anterior
		int[] vectorSaldo = new int[100];
		for(int i = 0; i < vectorSaldo.length; i++) {
			vectorSaldo[i] = (int)(vector[i].getSaldo());
		}
		// Ordenamos los elementos de vectorSaldo de manera creciente
		Arrays.sort(vectorSaldo);
		// Bucle para comparar el mayor elemento de vectorSaldo con el elemento saldo de todos los objectos de vector
		for(int i = 0; i < vectorSaldo.length; i++) {
			if (vectorSaldo[99] == vector[i].getSaldo()) {
				System.out.println(i+1 + ") Titular: " + vector[i].getTitular() + ", saldo: " + vector[i].getSaldo());
			}
		}
	}

}
