package array;

import java.util.Scanner;

public class Mais_velho {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many people will be accounted for? ");
		int n = sc.nextInt();
		
		String[] name = new String[n];
		int[] age = new int[n];
		
		int old = 0;
		String oldest = "a";
		
		for (int i = 0; i < n; i++) {
			System.out.println("Info on person number " + (i + 1));
			System.out.print("Name: ");
			sc.nextLine();
			name[i] = sc.nextLine();
			System.out.print("Age: ");
			age[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			if (age[i] > old) {
				old = age[i];
				oldest = name[i];
			}
		}


		System.out.print("Oldest: " + oldest);
		
		sc.close();
	}

}
