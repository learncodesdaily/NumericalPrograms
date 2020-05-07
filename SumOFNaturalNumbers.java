package numerics;

import java.util.Scanner;

public class SumOFNaturalNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num,i = 1,sum = 0;
		
	    System.out.println("Enter an Positive Integer : ");
	    num = sc.nextInt();
	    
	    while (i <= num) {
	        sum += i;
	        ++i;
	    }
	    
	    System.out.println("The Sum of "+num+" Natural Numbers is : "+sum);
	}
}

/*
Output: 
	Enter an Positive Integer : 
		20
		The Sum of 20 Natural Numbers is : 210

*/