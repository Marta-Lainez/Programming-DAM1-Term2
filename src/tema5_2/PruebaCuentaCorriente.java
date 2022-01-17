package tema5_2;

public class PruebaCuentaCorriente {

	public static void main(String[] args) {
		CuentaCorriente miCuenta = new CuentaCorriente();
		miCuenta.setSaldo(500);
		miCuenta.setCodigo("00000000");
		miCuenta.operacionDinero();
	}

}
