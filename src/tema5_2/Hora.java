/**
6) Desarrollar un programa en Java que utilice una clase que se llame Hora con
miembros de tipo int para hora, minutos y segundos. Deberá tener un constructor
para inicializar la hora a 0 o a una hora determinada (hora, minutos, segundos).Se
deberá poder sumar y restar horas, así como imprimir y leer una hora. El formato de
impresión y lectura será hh:mm:ss, todo en modo 24 horas.
 */
package tema5_2;

public class Hora {
	private int hora;
	private int minutos;
	private int segundos;
	
	//int [] vector = new int [4];
	//int [][] matriz = new int [3][4];
	
	public void setHora (int newHora) {
		this.hora = newHora;
	}
	public int getHora() {
		return hora;
	}
	public int getMinutos() {
		return minutos;
	}
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	public int getSegundos() {
		return segundos;
	}
	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}
	
	public Hora() {
		hora = 0;
		minutos = 0;
		segundos = 0;
	}
	
	// Metodo para sumar segundos de forma eficiente. Si desbordan los minutos y las horas, hace los modulos
	// y las sumas correspondientes para que la hora sea correcta
	public void sumaSegundos(int extra) {
		int modulo;
		int cociente;
		if (getSegundos() + extra > 60) {
			modulo = (extra + getSegundos()) % 60;
			cociente = (extra + getSegundos()) / 60;
			setSegundos(getSegundos() + modulo);
			//setMinutos(getMinutos() + cociente);
			if (cociente > 60) {
				extra = cociente;
				sumaMinutos(extra);
			}
		}
		else 
			setSegundos(getSegundos() + extra);
	}
	
	public void sumaMinutos(int extra) {
		int modulo;
		int cociente;
		if (getMinutos() + extra > 60) {
			modulo = (extra + getMinutos()) % 60;
			cociente = (extra + getMinutos()) / 60;
			setMinutos(getMinutos() + modulo);
			//setHora(getHora() + cociente);
			if (cociente > 24) {
				extra = cociente;
				sumaHoras(extra);
			}
			else 
				setHora(getHora() + cociente);
		
		}
		else 
			setMinutos(getMinutos() + extra);
	}
	
	public void sumaHoras(int extra) {
		if (getHora() + extra > 24) {
			setHora((getHora() + extra) % 24);
		}
		else
			setHora(getHora() + extra);
	}
}
