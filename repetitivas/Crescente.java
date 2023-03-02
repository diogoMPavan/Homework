package repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Crescente {
	
	/*
	 * Leia uma quantidade indeterminada de duplas de valores inteiros X e Y. Escreva para cada X e Y uma
mensagem que indique se estes valores foram digitados em ordem crescente ou decrescente. O
programa deve finalizar quando forem digitados dois valores iguais. 
	 */

	public static void main (String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc=  new Scanner(System.in);
		
		double n1, n2;
		
		System.out.println("Type two numbers: ");
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		
		while (n1 != n2) {
			if (n1 > n2) {
				System.out.println("Descending");
			}
			else {
				System.out.println("Ascending");
			}
			System.out.println("Type other two numbers: ");
			n1 = sc.nextDouble();
			n2 = sc.nextDouble();
		}
		
		System.out.println("The numbers typed are equal. Interaction ended.");
		
		sc.close();
	}
}
