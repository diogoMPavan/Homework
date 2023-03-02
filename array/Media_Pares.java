package array;

import java.util.Scanner;

public class Media_Pares {
	
	/*Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
	aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
	digitado, mostrar a mensagem "NENHUM NUMERO PAR"
	*/

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Amount of elements in the array: ");
		int n = sc.nextInt();
		
		double avg, tot = 0;
		int count = 0;
		
		int[] array = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Inform a number: ");
			array[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			if (array[i] % 2 == 0) {
				tot += array[i];
				count ++;
			}
		}
		
		avg = tot / count;
		
		if (tot != 0) {
			System.out.print("The average of the evens: " + avg);
		}
		else {
			System.out.println("No even numbers");
		}
		
		sc.close();
	}

}
