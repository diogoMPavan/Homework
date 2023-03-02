package array;

import java.util.Locale;
import java.util.Scanner;

public class soma_vetor {
	
	/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
	- Imprimir todos os elementos do vetor
	- Mostrar na tela a soma e a média dos elementos do vetor 
	*/

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many numbers will you type?");
		int n = sc.nextInt();
		
		int[] array = new int[n];
		
		int sum, count;
		double avg;
		
		sum = 0;
		count = 0;
		for (int i = 0; i < n; i++) {
			System.out.print("Type a number: ");
			array[i] = sc.nextInt();
			sum += array[i];
			count++;
		}
		
		System.out.print("Values: ");
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
		
		avg = sum/count;
		
		System.out.print("\nSum: " + sum);
		System.out.print("\nAverage: " + avg);
		
		sc.close();
	}

}
