package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Bhaskhara {
	
	public static void main (String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x1, x2, a, b, c, delta;
		
		System.out.print("Type the value of A: ");
		a = sc.nextDouble();
		System.out.print("Now, inform the value of B: ");
		b = sc.nextDouble();
		System.out.print("Finally, type the value of C: ");
		c = sc.nextDouble();
		
		delta = ((b*b) - 4*a*c)/2*a;
		
		if (delta < 0) {
			System.out.println("This equation does not have real roots");
		}
		else {
			x1 = -b + Math.sqrt(delta);
			x2 = -b - Math.sqrt(delta);
			System.out.printf("x1 = %.4f%n", x1);
			System.out.printf("x2 = %.4f%n", x2);
		}
		
		
		sc.close();
	}
}
