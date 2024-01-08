/**
* Clase que pide números enteros al usuario 
* hasta que se introduzca el número 0
* 
* Los números enteros serán positivos o negativos
* 
* El resultado será la media de los enteros y la media de los negativos
* 
* 
* @author      Fernando Galindo
* @version     1.0 EDES - Enero 2024
*/

import java.util.Scanner;

public class Enteros {

	public static void main(String[] args) {
		int num=0, cont_pos=0, cont_neg=0, suma_pos=0,suma_neg=0;
		double media_pos=0, media_neg=0;
		Scanner sn = new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		num = sn.nextInt();
		
		while (num!=0) {
			if (num>0) {
				cont_pos++;
				suma_pos+=num;
			}else {
				cont_neg++;
				suma_neg+=num;
			}
			System.out.println("Introduce un numero");
			num = sn.nextInt();
		}
		if (cont_pos!=0) {
			media_pos = (double) suma_pos/cont_pos;
			System.out.println("Media de los positivos "+ media_pos);
		}
		if (cont_neg!=0) {
			media_neg = (double) suma_neg/cont_neg;
			System.out.println("Media de los positivos "+ media_neg);
		}
	}
}
