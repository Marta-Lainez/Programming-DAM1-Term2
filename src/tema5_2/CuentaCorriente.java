
/**
4) Sea la clase CuentaCorriente, cuyos atributos son, al menos: titular (string), saldo
(float) y codigo (único para cada cuenta, string de 8 dígitos numéricos, filtrado).
Diseñar la clase para poder realizar las siguientes operaciones:
· IngresarDinero, actualizando el saldo.
· RetiraDinero, actualizando el saldo siempre que sea posible; para ello habrá otro
método llamado PuedoSacar que devolverá true si hay saldo suficiente y false si
no lo hay. En caso de no haber saldo se avisará con un mensaje indicando el
hecho y un "pulse return".
 */
package tema5_2;

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

	public void operacionDinero() {
		boolean posible = PuedoSacar();
		float resultado;
		char letra;
		if (getCodigo().length() <= 8) {
			for (int posicion = 0; posicion < 8; posicion++) {
				letra = getCodigo().charAt(posicion);
				if (letra < '0' || letra > '9') {
					posible = false;
				}

			}

			switch (operacion) {
			case 1:
				resultado = getSaldo() + getDinero();
				System.out.println("Operacion valida. Saldo actual: " + resultado);
				break;
			case 2:
				if (posible == true) {
					resultado = getSaldo() - getDinero();
				System.out.println("Operacion valida. Saldo actual: " + resultado);
				}
				else System.out.println("Saldo insuficiente.");
				break;
			default:
				System.out.println("Opcion no valida.");
			}

		} else
			System.out.println("Contraseña no valida.");
	}

	public boolean PuedoSacar() {
		boolean posible = true;
		System.out.println("Quiere ingresar o retirar dinero? Para ingresar pulse 1, para retirar pulse 2.");
		setOperacion(teclado.nextInt());

		if (getOperacion() == 1 || getOperacion() == 2) {
			System.out.println("Cuanto dinero?");
			setDinero(teclado.nextFloat());

			if (getSaldo() - dinero < 0) {
				posible = false;

			} else
				posible = true;
		}

		else {
			posible = false;
		}
		return posible;
	}

}
