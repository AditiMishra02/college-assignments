package assignment2;
import java.util.Scanner;
public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the side");
		double side = input.nextDouble();
		double area = (3 * Math.sqrt(3) * side * side/2 );
		System.out.println("Area of the hexagon is " + area );
		input.close();
	}

}
