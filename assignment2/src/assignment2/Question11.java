package assignment2;
import java .util.Scanner;
public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter investment amount:");
		double amount = input.nextDouble();
		System.out.println("Enter annual interest rate in percentage:");
		double interest = input.nextDouble();
		interest = interest/1200;
		System.out.println("Enter number of years:");
		double time =  input.nextDouble();
		double FutureInvestmentValue = amount* Math.pow(1+ interest,time*12);
		System.out.println("Accumulated value is " + FutureInvestmentValue);
		input.close();
	}

}
