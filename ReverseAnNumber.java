package numerics;

import java.util.Scanner;

public class ReverseAnNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num,temp,remainder,rev = 0;
		
	    System.out.println("Enter an Integer : ");
	    num = sc.nextInt();
	    temp = num;
	    
	    while (num != 0) {
	        remainder = num % 10;
	        rev = rev * 10 + remainder;
	        num = num / 10;
	    }
	    
	    System.out.println("The Reverse of an Number "+temp+" is :"+rev);
	}
}

/*
Output :
	Enter an Integer : 
		12345
		The Reverse of an Number 12345 is :54321
*/