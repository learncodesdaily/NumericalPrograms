package numerics;

import java.util.Scanner;

public class CheckForPrime {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num,flag = 0;
		
	    System.out.println("Enter an Positive Integer : ");
	    num = sc.nextInt();
	    
	    for (int i = 2; i <= num / 2; ++i) {

	        // condition for non-prime
	        if (num % i == 0) {
	            flag = 1;
	            break;
	        }
	    }

	    if (num == 1) {
	    	System.out.println("1 is neither prime nor composite.");
	    }
	    else {
	        if (flag == 0)
	        	System.out.println(num+" is a PRIME number");
	        else
	        	System.out.println(num+" is NON-PRIME number");
	    }
	}
}

/*
Output-1 :
	Enter an Integer : 
	13
	13 is a PRIME number

Output-2 :
	Enter an Positive Integer : 
	22
	22 is NON-PRIME number

	*/