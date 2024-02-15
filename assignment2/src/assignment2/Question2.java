package assignment2;

import java.util.Scanner;
  
 public class Question2 {

	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number for radius and length");
		double radius = input.nextDouble();
		double length = input.nextDouble();
		double area = radius* radius* 3.14159;
		double volume = area*length;
		System.out.println("Area of the circle is " + area);
		System.out.println("volume of the circle is " + volume);
		input.close();
		
		

	}

}
