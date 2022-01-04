/**
7) Escribir un método al que se le dé como parámetro un valor r, que representa el radio
de una figura, una opción: un dato entero que será 1, 2 ó 3. El método debe devolver:
 · En el caso opción 1, la longitud del circulo de radio r dada por la expresión 2*PI*r
 · En el caso opción 2, la superficie del circulo dada por la expresión PI*r2
 · En el caso opción 3, el volumen de una esfera de radio r dada por la expresión
   4/3*PI*r3
NOTA: PI es la constante 3,14159
 */
package tema5;
import java.util.Scanner;
public class RadioAFigura {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Deme un radio siendo este un numero positivo:");
		double radio = teclado.nextDouble();
		System.out.println(radio);
	
		// Validamos que radio sea positivo. Si lo es, ejecutamos el metodo
		if (radio > 0) {
			deRadioAFigura(radio);
		}
		else System.out.println("Error: Radio negativo.");
	}
	static void deRadioAFigura (double radio) {
		Scanner teclado = new Scanner (System.in);
		double resultado = 0;
		System.out.println("Dame una de las siguientes opciones:" + "\r\n" + "1: Longitud del circulo dado el radio (Perimetro)"
						  + "\r\n" + "2: Superficie del circulo (Area)" + "\r\n" + "3: Volumen de la esfera");
		int opcion = teclado.nextInt();
		
		//Switch con las 3 opciones. Si las opciones no son ni 1 ni 2 ni 3, sale un mensaje por pantalla indicando que no es valido
		switch(opcion) {
		case 1:
			resultado = 2*Math.PI*radio;
			System.out.println("El resultado es: " + resultado);
			break;
		case 2:
			resultado = Math.PI*radio*radio;
			System.out.println("El resultado es: " + resultado);
			break;
		case 3:
			resultado = (4/3)*Math.PI*radio*radio*radio;
			System.out.println("El resultado es: " + resultado);
			break;
		default: System.out.println("Esa no es una opcion valida.");
		}
	}
}
