/**
7) Escribir un m�todo al que se le d� como par�metro un valor r, que representa el radio
de una figura, una opci�n: un dato entero que ser� 1, 2 � 3. El m�todo debe devolver:
 � En el caso opci�n 1, la longitud del circulo de radio r dada por la expresi�n 2*PI*r
 � En el caso opci�n 2, la superficie del circulo dada por la expresi�n PI*r2
 � En el caso opci�n 3, el volumen de una esfera de radio r dada por la expresi�n
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
