package numerics;

import java.util.Scanner;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num,temp,count = 0;
		
	    System.out.println("Enter an Integer : ");
	    num = sc.nextInt();
	    temp = num;
	    
	    // iterate until n becomes 0
	    // remove last digit from n in each iteration
	    // increase count by 1 in each iteration
	    while (num != 0) {
	        num = num /  10;     
	        count = count + 1;
	    }
	    
	    System.out.println("The Number of Digits in "+temp+" is :"+count);
	}
}

/*
Output :
	Enter an Integer : 
		123456789
		The Number of Digits in 123456789 is :9
*/