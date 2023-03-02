package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Menor_de_tres {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int v1, v2, v3;
		
		System.out.println("Type three random numbers: ");
		v1 = sc.nextInt();
		v2 = sc.nextInt();
		v3 = sc.nextInt();
		
		if (v1 < v2 && v1 < v3) {
			System.out.print("Smallest: " + v1);
		}
		else if (v2 < v1 && v2 < v3) {
			System.out.print("Smallest: " + v2);
		}
		else {
			System.out.print("Smallest: " + v3);
		}
		
		sc.close();
	}

}
