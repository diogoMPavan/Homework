package array;

import java.util.Locale;
import java.util.Scanner;

public class Comerciante {
	
	/*Um comerciante deseja fazer o levantamento do lucro das mercadorias que ele comercializa. Para isto,
	mandou digitar um conjunto de N mercadorias, cada uma contendo nome, preço de compra e preço de
	venda das mesmas. Fazer um programa que leia tais dados e determine e escreva quantas mercadorias
	proporcionaram:
	 lucro < 10%
	 10% ≤ lucro ≤ 20%
	 lucro > 20%
	Determine e escreva também o valor total de compra e de venda de todas as mercadorias, assim como
	o lucro total. 
	*/

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many products will be accounted for? ");
		int n = sc.nextInt();
		
		String[] name = new String[n];
		double[] buy = new double[n];
		double[] sell = new double[n];
		double[] profit = new double[n];
		
		int below = 0, between = 0, above = 0;
		double totalbuy = 0, totalsell = 0, totalprofit;
		
		for (int i = 0; i < n; i++) {
			System.out.println("Product " + (i+1));
			System.out.print("Name: ");
			sc.nextLine();
			name[i] = sc.nextLine();
			System.out.print("Buy price: ");
			buy[i] = sc.nextDouble();
			System.out.print("Sell price: ");
			sell[i] = sc.nextDouble();
			profit[i] = sell[i] - buy[i];
			totalbuy += buy[i];
			totalsell += sell[i];
		}
		
		totalprofit = totalsell - totalbuy;
		
		for (int i = 0; i < n; i++) {
			if (profit[i] < (buy[i]/10)) {
				below++;
			}
			else if(profit[i] >= (buy[i]/10) && profit[i] <= (buy[i]/5)) {
				between++;
			}
			else {
				above++;
			}
		}
		
		System.out.println("\nREPORT:");
		System.out.println("Amount of products with profit below 10%: " + below);
		System.out.println("Amount of products with profit between 10% and 20%: " + between);
		System.out.println("Amount of products with profit above 20%: " + above);
		System.out.println("Total buy value: " + totalbuy);
		System.out.println("Total sell value: " + totalsell);
		System.out.println("Total profit: " + totalprofit);
		
		sc.close();
	}

}
