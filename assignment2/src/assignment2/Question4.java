package assignment2;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter one integer value.");
		int a = input.nextInt();
		int a1 = a ;
		int sum = 0;
		sum+= a % 10 ;
		a = a/10;
		sum+= a % 10 ;
		a = a/10;
		sum+= a % 10 ;
		a = a/10;
		sum+= a % 10 ;
		a = a/10;
		System.out.println("The sum of the digits of " + a1 + " is " + sum);
		input.close();
		
		
	}

}
