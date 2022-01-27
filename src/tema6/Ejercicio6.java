/**
6) Escribe un programa que utilice la clase Empleado, creando un vector de objetos de la clase
Empleado y luego lo llene con datos correspondientes a 50 empleados (utilizar una tabla de
nombres para rellenar con un random). Una vez rellenado, visualizar los datos de todos los
empleados
 */
package tema6;

public class Ejercicio6 {
	
	static String[] listaNombres () {
		String[] lista = new String [5];
		for (int i = 0; i < 5; i++) {
			if (i < 1) {
				lista[i] = "Miguel";
			}
			else if (i < 2) {
				lista[i] = "Álvaro";
			}
			else if (i < 3) {
				lista[i] = "Eric";
			}
			else if (i < 4) {
				lista[i] = "Marta";
			}
			else if (i < 5) {
				lista[i] = "Samu";
			}
		}
		return lista;
	}
	static Empleado[] listaEmpleados(String[] listaLlena) {
		Empleado[] lista = new Empleado[50];
		for (int i = 0; i < 50; i++) {
			lista[i] = new Empleado();
			lista[i].setNombre(listaLlena[(int)(Math.random()*4)+1]);
			lista[i].setNumero(i+1);
		}
		return lista;
	}
	
	public static void main(String[] args) {

		String[] listaLlena = listaNombres();
		Empleado[] listaDatos = listaEmpleados(listaLlena);
		for (int i = 0; i < 50; i++) {
		System.out.println("Número empleado: " + listaDatos[i].getNumero() + " Nombre Empleado: " + listaDatos[i].getNombre());	
		}
		
		
	}

}
