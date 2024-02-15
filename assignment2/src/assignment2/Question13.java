package assignment2;
import java .util.Scanner;
public class Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of minutes:");
	    int minutes = input.nextInt();
	    int year = minutes / 525600;
	    int day = (minutes % 525600)/1440;
	    System.out.println(minutes + " minutes is approximately " + year + " years and "  +  day + " days ");
	    input.close();	   
	}

}
