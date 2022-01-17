/**
3) Cada trabajador tiene un numero identificativo que va de 1 a 100, adem�s se
controla su nombre, estado civil (S/C), turno (D/N), titulaci�n (0 a 4) y a�os en la
empresa.
Escribir el c�digo para definir la clase Trabajador y desarrollar los m�todos para:
� Constructor con par�metros fijos para un trabajador nuevo
� Modificar cualquier dato menos el identificador
� Visualizar los datos de un trabajador dado
� Calcular la n�mina de un trabajador teniendo en cuenta que:
	� El salario base es de 425 euros para todos
	� Se paga 100 euros extra en turno N
	� Se paga 75 euros por a�o de antig�edad
	� La titulaci�n se paga 250,500,1000,1250,1500 seg�n sea de 0 a 4
	� Se efect�a una retenci�n de impuestos de la n�mina del 12% a todos salvo a
	los casados que se les retiene el 10%
Declarar los atributos y m�todos correspondientes, desarrollarlos y probarlos en un
programa
 */
package tema5_2;

public class PruebaTrabajador {

	public static void main(String[] args) {
		double nomina;
		Trabajador miTrabajador = new Trabajador();
		
		// Le asigno datos a los atributos de la clase Trabajador
		miTrabajador.setNombre("Roberto");
		miTrabajador.setEstadoCivil('S');
		miTrabajador.setTurno('D');
		miTrabajador.setTitulacion(2);
		miTrabajador.setAntiguedad(5);
		
		// Leemos el metodo leerDatos y si el booleano dice que los datos son correctos, calculamos la nomina e imprimimos
		miTrabajador.leerDatos();
		if(miTrabajador.correcto == true) {
		nomina = miTrabajador.nomina();
		System.out.println("Nomina de " + miTrabajador.getNombre() + ": " + nomina);
		}
	
	}

}
