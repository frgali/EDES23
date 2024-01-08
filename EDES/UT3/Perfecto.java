/**
* Clase que pide entero positivo e indica si es perfecto o no
* 
* Un número es perfecto si es igual a la suma de us divisores propios.
* Un divisor propio es un enero positivo distino del número y que divide, 
* de forma exacta al número.  
* 
* @author      Fernando Galindo
* @version     1.0 EDES - Enero 2024
*/
import java.util.Scanner;

public class Perfecto {

	public static void main(String[] args) {
		int num, divisor, sumadivisores;
		divisor=1;
		sumadivisores=0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce número mayor que 0");
		num=teclado.nextInt();
		
		while (divisor<=num/2) {
			if (num % divisor ==0)
				sumadivisores+=divisor;
			divisor++;
		}
		if (num==sumadivisores)
			System.out.println("El número "+num+ " es perfecto");
		else
			System.out.println("El número "+num+ " no es perfecto");
	}

}
