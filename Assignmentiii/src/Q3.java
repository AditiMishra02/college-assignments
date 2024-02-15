import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer.");
		int num = sc.nextInt();
		if(num%2==0) 
		System.out.println("It is an even number.");
		else
	    System.out.println("It is an odd number.");	
		sc.close();
		
	}

}
