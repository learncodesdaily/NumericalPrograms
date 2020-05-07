package numerics;

import java.util.Scanner;

public class GCDOfTwoNumbers {
	
	public static void gcdUsingForLoop(int num1,int num2) 
	{
		int gcd = 0;
		
		for(int i=1; i <= num1 && i <= num2; ++i)
	    {
	        if(num1%i==0 && num2%i==0)
	           gcd = i;
	    }
		System.out.println("G.C.D of "+num1+" and "+num2+" Using FOR Loop is "+gcd);
	}

	public static void gcdUsingWhileLoop(int num1,int num2)
	{
		int num3 = num1;
		int num4 = num2;
		
		while(num1!=num2)
	    {
	        if(num1 > num2)
	            num1 -= num2;
	        else
	            num2 -= num1;
	    }
		System.out.println("\nG.C.D of "+num3+" and "+num4+" Using WHILE Loop is "+num1);
	}
	
	
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);

		int num1,num2;

		System.out.println("Enter Two Positive Integers : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		gcdUsingForLoop(num1,num2);
		gcdUsingWhileLoop(num1,num2);
	}
}

/*
Output :
	
	Enter Two Positive Integers : 
		20 12
		G.C.D of 20 and 12 Using FOR Loop is 4
		
		G.C.D of 20 and 12 Using WHILE Loop is 4

*/