package assignment2;

import java.util.Scanner;
public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter weight in pounds.");
		double WT = input.nextDouble();
		System.out.println("Enter height in inches.");
		double Ht = input.nextDouble();
		WT = WT*0.45359237 ;
		Ht = Ht* 0.0254;
		double bmi = WT/Math.pow(Ht,2);
		System.out.println("BMI " +bmi);
		input.close();
		
	}

}
