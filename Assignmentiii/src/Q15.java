import java.util.Scanner;
public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a point with two coordinates." );
		 double x = sc.nextDouble();
		 double y = sc.nextDouble();
		 double distance = Math.pow(Math.pow(x, 2)+ Math.pow(y, 2), 0.5);
		 
		 if (distance<=10)
		 {
			 System.out.println("Point is in the circle." ); 
		 }
		 else
		 {
			 System.out.println("Point is not in the circle." );
		 }
		 sc.close();
		 }
		 
	}


