package array;

import java.util.Locale;
import java.util.Scanner;

public class Abaixo_Da_Media {
	
	/*Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
	mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
	os elementos do vetor que estejam abaixo da média, com uma casa decimal cada. 
	*/

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Amount of elements in the array: ");
		int n = sc.nextInt();
		
		double[] array = new double[n];
		double sum = 0, avg;
		int count = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.print("Type a number: ");
			array[i] = sc.nextDouble();
			sum += array[i];
			count ++;
		}

		avg = sum / count;
		
		System.out.printf("Average: %.3f%n", avg);
		System.out.println("\nElements below average: ");
		for (int i = 0; i < n; i++) {
			if (array[i] < avg) {
				System.out.println(array[i]);
			}
		}
		sc.close();
	}

}
