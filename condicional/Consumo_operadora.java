package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Consumo_operadora {
	
	public static void main (String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int min;
		double value;
		
		System.out.print("Inform the amount of minutes consumed: ");
		min = sc.nextInt();
		
		if (min < 100) {
			value = 50;
		}
		else {
			value = 50 + 2 * (min - 100);
		}
		
		System.out.println(" ");
		System.out.printf("Final value: US$%.2f%n", value);
		
		sc.close();
	}
}
