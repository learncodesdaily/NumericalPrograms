package numerics;

import java.util.Scanner;

public class LCMOfTwoNumbers {

	public static void lcmUsingGCD(int num1,int num2)
	{
		int gcd = 0,lcm;
		for (int i = 1; i <= num1 && i <= num2; ++i) {

			
			if (num1 % i == 0 && num2 % i == 0)
				gcd = i;
		}

		lcm = (num1 * num2) / gcd;

		System.out.println("The LCM of "+num1+" and "+num2+" Using GCD is :"+ lcm);
	}


	public static void lcmUsingWhileLoop(int num1,int num2)
	{

		int min = (num1 > num2) ? num1 : num2;

		while (true) {
			if (min % num1 == 0 && min % num2 == 0) {
				System.out.println("\nThe LCM of "+num1+" and "+num2+" Using WHILE Loop is :"+ min);
				break;
			}
			++min;
		}
	}

	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);

		int num1,num2;

		System.out.println("Enter Two Positive Integers : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		lcmUsingGCD(num1,num2);
		lcmUsingWhileLoop(num1,num2);
	}
}

/*
Output :
	Enter Two Positive Integers : 
		72
		120
		The LCM of 72 and 120 Using GCD is :360

		The LCM of 72 and 120 Using WHILE Loop is :360
*/
