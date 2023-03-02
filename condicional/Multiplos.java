package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			int n1, n2;
			
			System.out.println("Type two numbers: ");
			n1 = sc.nextInt();
			n2 = sc.nextInt();
			
			if (n1 % n2 == 0 || n2 % n1 == 0) {
				System.out.println("These numbers are multiples");
			}
			else {
				System.out.println("These numbers are not multiples");
			}
		
		sc.close();
	}

}
