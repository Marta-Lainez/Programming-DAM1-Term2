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
	
	public void sumaSegundos(int extra) {
		int modulo;
		int cociente;
		if (getSegundos() + extra > 60) {
			modulo = (extra + getSegundos()) % 60;
			cociente = (extra + getSegundos()) / 60;
			setSegundos(getSegundos() + modulo);
			setMinutos(getMinutos() + cociente);
			if (getMinutos() > 60) {
				extra = getMinutos() % 60;
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
			setHora(getHora() + cociente);
			if (getHora() > 60) {
				extra = getHora() % 24;
				sumaHoras(extra);
			}
		
		}
		else 
			setMinutos(getMinutos() + extra);
	}
	
	public void sumaHoras(int extra) {
		int modulo;
		if (getHora() + extra > 24) {
			setHora((getHora() + extra) % 24);
		}
		else
			setHora(getHora() + extra);
	}
}
