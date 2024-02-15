package assignment2;
import java .util.Scanner;
public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("No. of eggs: ");
	   int num=input.nextInt();
	    int a = num/144;
	    int b = num%144;
	    int c = b/12;
	    int d = b%12;
	    System.out.println("Your number of eggs is "+a+" gross, "+c+" dozen and "+d+" remaining eggs");
	    input.close();		
	}

}
