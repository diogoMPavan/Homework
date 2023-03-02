package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Duracao {

	/*Fazer um programa para ler uma duração de tempo em segundos, daí imprimir na tela esta duração no
	formato horas:minutos:segundos. 
	*/
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int t;
		int sec, min, hour;
		
		System.out.print("Type the time (seconds): ");
		t = sc.nextInt();
		
		hour = t / 3600;
		min = (t % 3600) / 60;
		sec = t % 60;
		
		System.out.println("\n");
		System.out.println("Time: " + hour + ":" + min + ":" + sec);
		
		sc.close();
	}

}
