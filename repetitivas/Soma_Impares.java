package repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Soma_Impares {

	/*
	 * Leia 2 valores inteiros X e Y (em qualquer ordem). A seguir, calcule e mostre a soma dos números
		impares entre eles. 
	 */
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, x, sum;
		
		System.out.println("Type two numbers: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		if (n2 < n1) {
			int a = n1;
			n1 = n2;
			n2 = a;
		}
		
		sum = 0;
		for (x = n1; x < n2; x++) {
			if (x % 2 != 0) {
				sum += x;
			}
		}
		
		System.out.print("Soma dos impares: " + sum);
		
		sc.close();
	}

}
