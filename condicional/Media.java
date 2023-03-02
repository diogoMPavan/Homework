package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Media {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String name;
		double g1, g2, avg;
		
		System.out.print("Inform the name of the student: ");
		name = sc.nextLine();
		System.out.print("Inform " + name + "'s first grade: ");
		g1 = sc.nextDouble();
		System.out.print("Inform " + name + "'s second grade: ");
		g2 = sc.nextDouble();
		
		avg = (g1 + g2)/2;
		
		if (avg < 60) {
			System.out.println(name + "'s average: " + avg);
			System.out.println("Reproved");
		}
		else {
			System.out.println(name + "'s average: " + avg);
			System.out.println("Approved");			
		}
		
		sc.close();
	}

}
