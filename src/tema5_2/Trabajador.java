/**
3) Cada trabajador tiene un numero identificativo que va de 1 a 100, además se
controla su nombre, estado civil (S/C), turno (D/N), titulación (0 a 4) y años en la
empresa.
Escribir el código para definir la clase Trabajador y desarrollar los métodos para:
· Constructor con parámetros fijos para un trabajador nuevo
· Modificar cualquier dato menos el identificador
· Visualizar los datos de un trabajador dado
· Calcular la nómina de un trabajador teniendo en cuenta que:
	· El salario base es de 425 euros para todos
	· Se paga 100 euros extra en turno N
	· Se paga 75 euros por año de antigüedad
	· La titulación se paga 250,500,1000,1250,1500 según sea de 0 a 4
	· Se efectúa una retención de impuestos de la nómina del 12% a todos salvo a
	los casados que se les retiene el 10%
Declarar los atributos y métodos correspondientes, desarrollarlos y probarlos en un
programa
 */
package tema5_2;

public class Trabajador {

	private int id;
	private String nombre;
	private char estadoCivil;
	private char turno;
	private int titulacion;
	private int antiguedad;
	boolean correcto = true;
	
	// Constructor con parámetros fijos para un trabajador nuevo
	public Trabajador() {
		id = 0;
		nombre = "Smith";
		estadoCivil = 'S';
		turno = 'D';
		titulacion = 0;
		antiguedad = 0;
	}
	
	// Modificar cualquier dato menos el identificador
	public void setNombre (String newNombre) {
		this.nombre = newNombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setEstadoCivil (char newEstadoCivil) {
		this.estadoCivil = newEstadoCivil;
	}
	public char getEstadoCivil() {
		return estadoCivil;
	}
	public void setTurno (char newTurno) {
		this.turno = newTurno;
	}
	public char getTurno() {
		return turno;
	}
	public void setTitulacion (int newTitulacion) {
		this.titulacion = newTitulacion;
	}
	public int getTitulacion() {
		return titulacion;
	}
	public void setAntiguedad (int newAntiguedad) {
		this.antiguedad = newAntiguedad;
	}
	public int getAntiguedad() {
		return antiguedad;
	}
	
	// Visualizar los datos de un trabajador dado
	public void leerDatos() {
		if (id < 0 || id > 100 || (getEstadoCivil() != 'S' && getEstadoCivil() != 'C')
				|| (getTurno() != 'D' && getTurno() != 'N') || getTitulacion() < 0 || getTitulacion() > 4) {
			correcto = false;
			System.out.println("Datos introducidos no validos.");
		}
		else {
			System.out.println("ID: " + id + "\r\n" + "Nombre: " + getNombre() + "\r\n" + "Estado civil: " + getEstadoCivil()
		+ "\r\n" + "Turno: " + getTurno() + "\r\n" + "Titulacion: " + getTitulacion() + "\r\n" + "Antiguedad: " + getAntiguedad());
		}
	}
	
	/**
	Calcular la nómina de un trabajador teniendo en cuenta que:
	· El salario base es de 425 euros para todos
	· Se paga 100 euros extra en turno N
	· Se paga 75 euros por año de antigüedad
	· La titulación se paga 250,500,1000,1250,1500 según sea de 0 a 4
	· Se efectúa una retención de impuestos de la nómina del 12% a todos salvo a
	los casados que se les retiene el 10%
	 */
	public double nomina() {
		double nomina = 425 + 75*getAntiguedad();
		if (getTurno() == 'N') {
			nomina += 100;
		}
		switch (getTitulacion()) {
		case 0:
			nomina += 250;
			break;
		case 1:
			nomina += 500;
			break;
		case 2:
			nomina += 1000;
			break;
		case 3:
			nomina += 1250;
			break;
		default:
			nomina += 1500;
		}
		
		if (getEstadoCivil() == 'S') {
			nomina = nomina*0.88;
		}
		else {
			nomina = nomina*0.9;
		}
			
		return nomina;
	}
}
