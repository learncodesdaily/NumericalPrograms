package numerics;

import java.util.Scanner;

public class PowerOfAnNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int base,exp;
		double result = 1;

		System.out.println("Enter the BASE and EXPONENT values : ");
		base = sc.nextInt();
		exp = sc.nextInt();

		int tExp = exp;

		while (exp != 0) {
			result *= base;
			--exp;
		}

		System.out.println("The answer of "+base+"^"+tExp+" is : "+result);
	}
}


/*
Output :
	Enter the BASE and EXPONENT values : 
		3
		4
		The answer of 3^4 is : 81.0
 */