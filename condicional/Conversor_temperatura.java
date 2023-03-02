package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Conversor_temperatura {

	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		char scale;
		double temp, equiv;
		
		System.out.println("In wich scale will the temperature be informed?");
		scale = sc.next().charAt(0);
		System.out.print("Inform the temperature: ");
		temp = sc.nextDouble();
		
		
		System.out.println(" ");
		if (scale == 'C' || scale == 'c') {
			System.out.print("The equivalent temperature in F°: ");
			equiv = (temp * 1.8) + 32;
		}
		else {
			System.out.print("The equivalent temperature in C°: ");
			equiv = 0.55 * (temp - 32);
		}
		System.out.printf("%.2f%n", equiv);
		
		sc.close();
	}
}
