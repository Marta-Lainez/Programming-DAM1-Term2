/*
2. Escribe un programa que controle los datos de todas las personas que trabajan en una
empresa. De todas ellas, nos interesa: nombre, sueldo base (el mismo para todos) y
edad. Entre los empleados que trabajan en la empresa, hay dos grupos de personas de
las que nos interesa algún dato más:
· Los administrativos: de los cuales, nos interesan estudios académicos y
número de ordenador asignado.
· Los maquinistas: de los cuales nos interesan número de máquina asignada y la
cantidad de años que lleva con dicha máquina.
Es obligatorio usar constructores en cada una de las clases que se encarguen de pedir
los datos de dichos empleados. El método “visualizarTodosDatos()” estará en todas las
clases y se encargará de visualizar todos los datos de la clase donde está.
El programa pedirá que el usuario indique el número de empleados que pertenecen al
grupo de los administrativos, al grupo de los maquinistas y número de empleados que
no están en ninguno de estos dos grupos. Posteriormente se pedirán los datos de cada
uno de ellos.
Visualiza los datos de cada uno de ellos (por grupos). Para ello se usará un único
método preparado para recibir los datos de un grupo de trabajadores con el fin de
visualizar sus datos.
 */
package tema7_2;

import java.util.Scanner;
/*
interface InterfazTrabajador{
	public abstract void pedirTodosDatos();
	public abstract void visualizarTodosDatos();
	
}*/
class Trabajador /*implements InterfazTrabajador*/{
	private String nombre;
	private final int sueldo;
	private int edad;
	// Constructor de trabajador
	public Trabajador() {
		sueldo = 1000;
		pedirTodosDatos();
	}
	// Metodo que pide los datos para luego insertarlos en el constructor
	public void pedirTodosDatos(){
		Scanner teclado = new Scanner (System.in);
		System.out.println("\tNuevo empleado");
		System.out.println("Nombre del empleado:");
		setNombre(teclado.nextLine());
		System.out.println("Edad del empleado:");
		setEdad(teclado.nextInt());
	}
	// Metodo que imprime todos los datos
	public void visualizarTodosDatos() {
		System.out.println();
		System.out.println("\tNombre del empleadoa: " + getNombre() + "\n\tEdad del empleado: " + getEdad() + "\n\tSueldo base: " + sueldo);
	}	
	// setter de nombre
	public void setNombre(String newNombre) {
		this.nombre = newNombre;
	}
	// getter de nombre
	public String getNombre() {
		return nombre;
	}
	// setter de edad
	public void setEdad (int newEdad) {
		this.edad = newEdad;
	}
	// getter de edad
	public int getEdad() {
		return edad;
	}
}
// Los administrativos: de los cuales, nos interesan estudios académicos y número de ordenador asignado.
class Administrativo extends Trabajador{
	private String estudiosAcademicos;
	private int numeroPc;
	public Administrativo(){
		pedirTodosDatos();
	}
	// Metodo que pide los datos para luego insertarlos en el constructor
	public void pedirTodosDatos(){
		Scanner teclado = new Scanner (System.in);
		System.out.println("Estudios Academicos:");
		setEstudiosAcademicos(teclado.nextLine());
		System.out.println("Numero de su ordenador:");
		setNumeroPc(teclado.nextInt());	
	}	
	// Metodo que imprime todos los datos
	public void visualizarTodosDatos() {
		System.out.println("Administrativo:");
		super.visualizarTodosDatos();
		System.out.println("\tEstudios academicos: " + getEstudiosAcademicos() + "\n\tNumero de su ordenador: " + getNumeroPc());
	}		
	// getters y setters autogenerados con "source"
	public String getEstudiosAcademicos() {
		return estudiosAcademicos;
	}
	public void setEstudiosAcademicos(String estudiosAcademicos) {
		this.estudiosAcademicos = estudiosAcademicos;
	}
	public int getNumeroPc() {
		return numeroPc;
	}
	public void setNumeroPc(int numeroPc) {
		this.numeroPc = numeroPc;
	}
}
// Los maquinistas: de los cuales nos interesan número de máquina asignada y la cantidad de años que lleva con dicha máquina.
class Maquinista extends Trabajador{
	private int numeroMaquina;
	private int añosMaquina;
	public Maquinista(){
		pedirTodosDatos();
	}
	// Metodo que pide los datos para luego insertarlos en el constructor
	public void pedirTodosDatos(){
		Scanner teclado = new Scanner (System.in);
		System.out.println("Numero de su maquina:");
		setNumeroMaquina(teclado.nextInt());
		System.out.println("Años usando esa maquina:");
		setAñosMaquina(teclado.nextInt());	
	}	
	// Metodo que imprime todos los datos
	public void visualizarTodosDatos() {
		System.out.println("Maquinista: ");
		super.visualizarTodosDatos();
		System.out.println("\t:Numero de su maquina: " + getNumeroMaquina() + "\n\tAños usando esa maquina: " + getAñosMaquina());
	}		
	// getters y setters autogenerados con "source"
	public int getNumeroMaquina() {
		return numeroMaquina;
	}
	public void setNumeroMaquina(int numeroMaquina) {
		this.numeroMaquina = numeroMaquina;
	}
	public int getAñosMaquina() {
		return añosMaquina;
	}
	public void setAñosMaquina(int añosMaquina) {
		this.añosMaquina = añosMaquina;
	}
	
}
public class Ejercicio2 {
	public static void main (String[]args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Cuantos administrativos hay?");
		int numAdmin = teclado.nextInt();
		System.out.println("¿Cuantos maquinistas hay?");
		int numMaqui = teclado.nextInt();
		System.out.println("¿Cuantos trabajadores de otro tipo hay?");
		int numOtros = teclado.nextInt();
		
		// Creo los vectores maquinistas, administrativos y otros
		Administrativo[] miVectorAdmin = new Administrativo[numAdmin];
		Maquinista[] miVectorMaqui = new Maquinista[numMaqui];
		Trabajador[] miVectorOtros = new Trabajador[numOtros];
		
		// NO SE POR QUE ME PIDE LOS DATOS DE CADA UNO 2 VECES CUANDO LE DIGO QUE HAY 1 DE CADA
		// SI NO LES PONGO SUPER.VISUALIZARTODOSDATOS NO ME IMPRIME LOS DATOS BASE DE EMPLEADOS POR QUE?
		// Lleno mi vector de administrativos
		for (int i = 0; i < miVectorAdmin.length; i++) {
			miVectorAdmin[i] = new Administrativo();
		}
		// Lleno mi vector de maquinistas
		for (int i = 0; i < miVectorMaqui.length; i++) {
			miVectorMaqui[i] = new Maquinista();
		}
		// Lleno mi vector de otros
		for (int i = 0; i < miVectorOtros.length; i++) {
			miVectorOtros[i] = new Trabajador();
		}
		// Imprimo todo administrativos
		for (int i = 0; i < miVectorAdmin.length; i++) {
			miVectorAdmin[i].visualizarTodosDatos();
		}
		// Imprimo todo maquinistas
		for (int i = 0; i < miVectorMaqui.length; i++) {
			miVectorMaqui[i].visualizarTodosDatos();
		}
		// Imprimo todo Otros
		for (int i = 0; i < miVectorOtros.length; i++) {
			System.out.println("Otro tipo de trabajador:");
			miVectorOtros[i].visualizarTodosDatos();
		}	
	}
}
