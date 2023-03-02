package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Negativo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Type a number: ");
		n = sc.nextInt();
		
		if (n < 0) {
			System.out.println("Negative");
		}
		else {
			System.out.println("Non negative");
		}
		
		sc.close();
	}
}
