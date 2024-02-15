package assignment2;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter the value in feet");
		double F = input.nextDouble();
		double M = F * 0.305;
		System.out.println( F + " feet is " + M + " meters. ");
		input.close();
	}

}
