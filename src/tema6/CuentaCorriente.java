/**
8) Diseñar la clase Cuentas para crear un vector de 100 objetos (de la clase CuentaCorriente).
Escribir un programa que utilice la clase Cuentas que permita obtener el titular y código de la
cuenta con mayor saldo. Para ello se sugiere crear un vector de saldos, ordenarlo en orden
creciente y, tomando el último valor que almacene, compararlo con el saldo de los diferentes
objetos mediante un metodo getSaldo y mostrar por pantalla los que sean iguales que el saldo
máximo.
 */
package tema6;

import java.util.Scanner;

public class CuentaCorriente {
	Scanner teclado = new Scanner(System.in);
	private String titular;
	private float saldo;
	private String codigo;

	private float dinero;
	private int operacion;

	// Setters y getters de todos los atributos
	public void setTitular(String newTitular) {
		this.titular = newTitular;
	}

	public String getTitular() {
		return titular;
	}

	public void setSaldo(float newSaldo) {
		this.saldo = newSaldo;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setCodigo(String newCodigo) {
		this.codigo = newCodigo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setDinero(float newDinero) {
		this.dinero = newDinero;
	}

	public float getDinero() {
		return dinero;
	}

	public void setOperacion(int newOperacion) {
		this.operacion = newOperacion;
	}

	public int getOperacion() {
		return operacion;
	}

	

}