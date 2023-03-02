package repetitivas;

import java.util.Scanner;

public class Fatorial {

	/*Fazer um programa para ler um número natural N (valor máximo: 15), e depois calcular e mostrar o
	fatorial de N. 
	*/
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n, factorial;
		
		System.out.print("Type a number to know it's factorial: ");
		n = sc.nextInt();
		
		factorial = 1;
		for (int i = n; i > 0; i--) {
			factorial = factorial * i;
		}
		
		System.out.print("Factorial: " + factorial);
		
		sc.close();
	}
}
