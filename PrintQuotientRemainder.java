package numerics;

import java.util.Scanner;

public class PrintQuotientRemainder {

	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);

		int dividend,divisor;

		System.out.println("Enter an DIVIDEND and DIVISOR : ");
		dividend = sc.nextInt();
		divisor = sc.nextInt();

		// Computes quotient
		int quotient = dividend / divisor;

		// Computes remainder
		int remainder = dividend % divisor;

		System.out.println("The QUOTIENT = "+quotient+"\nThe REMAINDER = "+remainder);
	}
}

/*
Output :
	Enter an DIVIDEND and DIVISOR : 
		31
		2
		The QUOTIENT = 15
		The REMAINDER = 1
*/