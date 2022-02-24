/*
4. Se sabe que en un instituto trabajan profesores y estudiantes. De todos ellos, nos
interesa: nombre y edad. De los profesores, además, nos interesa: nombre del
departamento al que pertenece, cantidad de pluses que tiene su nómina y lo que
cobra en cada uno de esos pluses.
De los estudiantes nos interesa, además de su nombre y edad: nombre del cursos
donde está matriculado, en cuántas asignaturas está matriculado y la nota obtenida en
cada una de ellas.
Queremos crear una clase que gestione los datos comunes que nos interesa de los
profesores y estudiantes, pero que no permita crear un objeto con este tipo de clase,
ya que nunca nos va a interesar de una persona del instituto esos datos tan exclusivos.
Dicha clase tendrá los métodos necesarios para pedir y visualizar los datos que
contiene: dichas funciones no se podrán sobrescribir por las clases que la hereden.
Además, esta clase estará diseñada de tal forma que cualquier clase que la herede
tenga la obligación de implementar estos dos métodos:
· DevolverMasAlto: de una serie de valores que tenga el objeto, devolver el más
alto.
· VisualListaValores: de una será de valores que tenga el objeto, visualizarlos
todos.
Las clases Profesor y Estudiante no se podrán heredar.
Se deben pedir los datos de un profesor y de un estudiante a través de los
constructores. Sabemos que la edad del profesor y estudiante es la misma, por ello,
este dato se pedirá solamente una vez y es el único dato que puede no pedirse desde
el constructor.
Una vez insertados los datos, el programa debe visualizar los datos de cada uno de
ellos, cuál es la nota más alta obtenida por el alumno y cuál es el plus más alto que
cobra el profesor.
 */
package tema7_2;

import java.util.Scanner;

abstract class Usuario{
	private String nombre;
	private int edad;
	public Usuario() {
		
	}
	public abstract int devolverMasAlto();
	public abstract String visualListaValores();
	public abstract void pedirTodosDatos();
	// getters y setters de nombre y edad
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
}

class Profesor extends Usuario{
	private String departamento;
	private int numPlus;
	private int[] dineroPlus;
	
	// Metodo que pide los datos para luego insertarlos en el constructor
	public void pedirTodosDatos(){
		Scanner teclado = new Scanner (System.in);
		System.out.println("\tNuevo empleado");
		System.out.println("Nombre del empleado:");
		setNombre(teclado.nextLine());
		System.out.println("Edad del empleado:");
		setEdad(teclado.nextInt());
		//cuidado nextint antes de nextline 
		System.out.println("Departamento:");
		setDepartamento(teclado.nextLine());
		System.out.println("Pluses:");
		setNumPlus(teclado.nextInt());
		for (int i = 0; i < getNumPlus(); i++) {
			System.out.println("Cantidad plus " + i + ": ");
			setDineroPlus(teclado.nextInt()[i]);
		}
	}
	public int devolverMasAlto() {
		int edadMasAlta = 0;
		
		return edadMasAlta;
	}
	
	public String visualListaValores() {
		
		return "hola";
	}
	// getters y setters de departamento, numero de plues y dinero por pluses
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public int getNumPlus() {
		return numPlus;
	}
	public void setNumPlus(int numPlus) {
		this.numPlus = numPlus;
	}
	public int[] getDineroPlus() {
		return dineroPlus;
	}
	public void setDineroPlus(int[] newDineroPlus) {
		newDineroPlus = new int [getNumPlus()];
		this.dineroPlus = dineroPlus;
	}
	
}

class Alumno extends Usuario{
	private String curso;
	private int numAsignaturas;
	private int[] notas;
	// getters y sertters de curso y numero de asignaturas
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public int getNumAsignaturas() {
		return numAsignaturas;
	}
	public void setNumAsignaturas(int numAsignaturas) {
		this.numAsignaturas = numAsignaturas;
	}
	
	
}
	
public class Ejercicio4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
