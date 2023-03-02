package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Par_impar {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int n;
		
		System.out.print("Type a random number: ");
		n = sc.nextInt();
		
		if (n % 2 == 0) {
			System.out.println("That number is even");
		}
		else {
			System.out.println("That number is odd");
		}
		
		sc.close();
	}
}
