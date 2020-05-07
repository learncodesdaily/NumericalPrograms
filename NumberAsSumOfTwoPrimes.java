package numerics;

import java.util.Scanner;

public class NumberAsSumOfTwoPrimes {
	
	private static int checkPrime(int n) {
		int i, isPrime = 1;
	    for (i = 2; i <= n / 2; ++i) {
	        if (n % i == 0) {
	            isPrime = 0;
	            break;
	        }
	    }
	    return isPrime;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num,flag = 0;
		
	    System.out.println("Enter an Integer : ");
	    num = sc.nextInt();
	    
	    System.out.println("\n"+num+" is Expressed in terms of Two Prime Numers : ");
	    for (int i = 2; i <= num / 2; ++i) 
	    {
	        // condition for i to be a prime number
	        if (checkPrime(i) == 1) 
	        {
	            // condition for n-i to be a prime number
	            if (checkPrime(num - i) == 1) 
	            {
	            	System.out.println(num+" = "+i+" + "+ (num - i));
	                flag = 1;
	            }
	        }
	    }
	    if (flag == 0)
	    	System.out.println(num+" cannot be expressed as the sum of two prime numbers.");
	}
}

/*
Output :
	Enter an Integer : 
		40

		40 is Expressed in terms of Two Prime Numers : 
		40 = 3 + 37
		40 = 11 + 29
		40 = 17 + 23
*/
