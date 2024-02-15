package assignment2;
import java.util.Scanner;
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the degree in Celsius: ");
	      double celsius = sc.nextDouble();
	      double Fahrenheit = (9.0/5*celsius)+32;
	      System.out.println( celsius + " celsius is " + Fahrenheit + " Fahrenheit "); 
	      sc.close();

	}

}
