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


abstract class Usuario{
	private String nombre;
	private int edad;
	public Usuario() {
		
	}
	public abstract int devolverMasAlto();
	public abstract String visualListaValores();
	
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
	private int[] diperoPlus;
	final int devolverMasAlto() {
		int edadMasAlta = 0;
		
		return edadMasAlta;
	}
	final String vusialListaValores() {
		String lista;
		return lista;
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
	public int[] getDiperoPlus() {
		return diperoPlus;
	}
	public void setDiperoPlus(int[] diperoPlus) {
		this.diperoPlus = diperoPlus;
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
