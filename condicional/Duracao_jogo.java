package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Duracao_jogo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int t1, t2, duration;
		
		System.out.print("Type the starting hour of the game: ");
		t1 = sc.nextInt();
		System.out.print("Type the ending hour of the game: ");
		t2 = sc.nextInt();
		
		if (t2 > t1) {
			duration = t2 - t1;
		}
		else if (t1 > t2) {
			duration = (24 - t1) + t2;
		}
		else{
			duration = 24;
		}
		
		System.out.println("The game lasted: " + duration + " hours");
		
		sc.close();
	}

}
