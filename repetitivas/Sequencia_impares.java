package repetitivas;

import java.util.Scanner;

public class Sequencia_impares {

	/*Leia um valor inteiro X. Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X,
se for o caso. 
	*/
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x;
		
		System.out.print("Type a random number: ");
		x = sc.nextInt();
		
		for (int i = 0; i < x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}

}
