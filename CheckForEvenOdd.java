package numerics;

import java.util.Scanner;

public class CheckForEvenOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
	    System.out.println("Enter an Integer : ");
	    num = sc.nextInt();
	    
	    if(num % 2 == 0)
	    	System.out.println(num+" is EVEN Number ");
	    else
	    	System.out.println(num+" is ODD Number");
	}
}

/*
Output-1 :
	Enter an Integer : 
		42
		42 is EVEN Number 

Output-2 :
	Enter an Integer : 
		37
		37 is ODD Number
*/