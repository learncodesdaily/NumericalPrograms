package numerics;

import java.util.Scanner;

public class CheckForLeapYear {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int year;
		
	    System.out.println("Enter an Integer : ");
	    year = sc.nextInt();
	    
	    // leap year if perfectly visible by 400
	    if (year % 400 == 0) {
	    	System.out.println(year+" is a leap year");
	    }
	    // not a leap year if visible by 100
	    // but not divisible by 400
	    else if (year % 100 == 0) {
	    	System.out.println(year+" is not a leap year.");
	    }
	    // leap year if not divisible by 100
	    // but divisible by 4
	    else if (year % 4 == 0) {
	    	System.out.println(year+" is a leap year.");
	    }
	    // all other years are not leap year
	    else {
	    	System.out.println(year+" is not a leap year.");
	    }
	}
}

/*
Output-1 :
	Enter an Integer : 
		2001
		2001 is not a leap year.
Output-2 :
	Enter an Integer : 
		2020
		2020 is a leap year.
*/