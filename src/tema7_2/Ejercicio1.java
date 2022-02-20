/*
Ejercicio 1
En todos estos ejercicios, lo datos de las clases deben ser privados e intentar al máximo que no
haya código repetido.
1. Diseña una interface y llámala Persona, con el fin de establecer los datos y funciones
mínimas que tiene que tener cualquier clase de un proyecto que implemente la
misma.
Los métodos mínimos son:
· pedirTodosDatos();
· visualizarTodosDatos();
Los atributos mínimos son:
· Nombre de la empresa. (Dale un valor).
Diseña dos clases, Cliente y Empleado, que implemente dicha interface (establece qué
datos deben de tener). Pide los datos de un cliente y de un empleado y visualízalos.
Cambia al cliente el nombre de la empresa por “editorial”. ¿Qué ocurre?
 */
package tema7_2;
import java.util.Scanner;
interface Persona{
	public abstract void pedirTodosDatos();
	public abstract void visualizarTodosDatos();
}

class Cliente implements Persona{
	private String nombreEmpresa = "iesPabloSerrano";
	private String nombreCliente;
	private int idCliente;
	
	public Cliente(){
		pedirTodosDatos();
	}
	// setter de nombre cliente
	public void setNombreCliente(String newNombreCliente) {
		this.nombreCliente = newNombreCliente;
	}
	// getter de nombre cliente
	public String getNombreCliente () {
		return nombreCliente;
	}
	// setter de id cliente
	public void setIdCliente(int newIdCliente) {
		this.idCliente = newIdCliente;
	}
	// getter de id cliente
	public int getIdCliente () {
		return idCliente;
	}
	// Metodo que pide los datos para luego insertarlos en el constructor
	public void pedirTodosDatos(){
		Scanner teclado = new Scanner (System.in);
		System.out.println("Nombre del cliente:");
		setNombreCliente(teclado.nextLine());
		System.out.println("ID del cliente:");
		setIdCliente(teclado.nextInt());	
	}
	// Metodo que imprimira todos los datos
	public void visualizarTodosDatos() {
		System.out.println("\tNombre de la empresa: " + nombreEmpresa + "\n\tNombre del cliente: " + getNombreCliente()
		+ "\n\tID del cliente: " + getIdCliente());
		System.out.println();
	}
}
class Empleado implements Persona{
	private String nombreEmpresa = "iesPabloSerrano";
	private String nombreEmpleado;
	private int idEmpleado;
	private String departamento;
	
	public Empleado(){
		pedirTodosDatos();
	}
	// setter de nombre empleado
	public void setNombreEmpleado(String newNombreEmpleado) {
		this.nombreEmpleado = newNombreEmpleado;
	}
	// getter de nombre empleado
	public String getNombreEmpleado () {
		return nombreEmpleado;
	}
	// setter de id empleado
	public void setIdEmpleado(int newIdEmpleado) {
		this.idEmpleado = newIdEmpleado;
	}
	// getter de id empleado
	public int getIdEmpleado () {
		return idEmpleado;
	}
	// setter de departamento
	public void setDepartamento (String newDepartamento) {
		this.departamento = newDepartamento;
	}
	// getter de departamento
	public String getDepartamento () {
		return departamento;
	}
	// Metodo que pide los datos para luego insertarlos en el constructor
	public void pedirTodosDatos(){
		Scanner teclado = new Scanner (System.in);
		System.out.println("Nombre del empleado:");
		setNombreEmpleado(teclado.nextLine());
		System.out.println("ID del empleado:");
		setIdEmpleado(teclado.nextInt());
		teclado.nextLine(); // Para que el nextLine del departamento no coja el salto de linea del nextInt de ID
		System.out.println("Departamento:");
		setDepartamento(teclado.nextLine());
	}
	// Metodo que imprimira todos los datos
	public void visualizarTodosDatos() {
		System.out.println("\tNombre de la empresa: " + nombreEmpresa + "\n\tNombre del empleado: " + getNombreEmpleado()
		+ "\n\tID del empleado: " + getIdEmpleado() + "\n\tDepartamento del empleado: " + getDepartamento());
		System.out.println();
	}
}
public class Ejercicio1{
	public static void main (String[]args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Cuantos clientes hay?");
		int numClientes = teclado.nextInt();
		System.out.println("¿Cuantos empleados hay?");
		int numEmpleados = teclado.nextInt();
		
		// Creo los vectores clientes y empleados
		Cliente[] miVectorClientes = new Cliente[numClientes];
		Empleado[] miVectorEmpleados = new Empleado[numEmpleados];
		
		// Lleno mi vector de clientes de objetos cliente
		for (int i = 0; i < miVectorClientes.length; i++) {
			miVectorClientes[i] = new Cliente();
		}
		// Lleno mi vector de empleados de objetos empleado
		for (int i = 0; i < miVectorEmpleados.length; i++) {
			miVectorEmpleados[i] = new Empleado();
		}
		// Imprimo todo el contenido del vector clientes
		for (int i = 0; i < miVectorClientes.length; i++) {
			miVectorClientes[i].visualizarTodosDatos();
		}
		// Imprimo todo el contenido del vector Empleados
		for (int i = 0; i < miVectorEmpleados.length; i++) {
			miVectorEmpleados[i].visualizarTodosDatos();
		}		
	}
}