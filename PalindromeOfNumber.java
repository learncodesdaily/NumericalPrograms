package numerics;

import java.util.Scanner;

public class PalindromeOfNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num,temp,rev = 0,remainder;

		System.out.println("Enter an Integer : ");
		num = sc.nextInt();
		temp = num;

		while (num != 0) {
			remainder = num % 10;
			rev = rev * 10 + remainder;
			num = num / 10;
		}

		if(temp == rev)
			System.out.println("The PALINDROME of an Number "+temp+" is "+rev);
		else
			System.out.println("The Number "+temp+" is not PALINDROME");
	}
}
