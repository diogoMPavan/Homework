package repetitivas;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n, x, mult;
		
		System.out.println("Type a number: ");
		n = sc.nextInt();
		
		for (x = 0; x <= 10; x++) {
			mult = x * n;
			System.out.println(n + "x" + x + " = " + mult);
		}
		
		sc.close();
	}

}
