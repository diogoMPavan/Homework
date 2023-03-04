package array;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.print("How many students will be typed? ");
		int n = sc.nextInt();
		
		String[] name = new String[n];
		double[] n1 = new double[n];
		double[] n2 = new double[n];
		double[] avg = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Type the " + (i+1) + " student's name and both grades: ");
			sc.nextLine();
			name[i] = sc.nextLine();
			n1[i] = sc.nextDouble();
			n2[i] = sc.nextDouble();
			avg[i] = (n1[i] + n2[i])/2;
		}
		
		System.out.println("Approved:");
		for (int i = 0; i < n; i++) {
			if (avg[i] >= 6.0) {
				System.out.println(name[i]);
			}
		}
		
		sc.close();
	}

}
