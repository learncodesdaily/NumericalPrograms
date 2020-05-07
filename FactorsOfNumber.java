package numerics;

import java.util.Scanner;

public class FactorsOfNumber {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num;

		System.out.println("Enter an Positive Integer : ");
		num = sc.nextInt();

		System.out.println("Factors of "+num+" are: ");
		for (int i = 1; i <= num; ++i) 
		{
			if (num % i == 0) 
			{
				System.out.print(i+" ");
			}
		}
	}
}

/*
Output :
	Enter an Positive Integer : 
		30
		Factors of 30 are: 
		1 2 3 5 6 10
 */
