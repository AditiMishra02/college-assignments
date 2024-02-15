import java.util.Scanner;
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the x and y coordinate ");
		double x=sc.nextDouble();
	    double y=sc.nextDouble();
		if(x==0 && y!=0)
		System.out.println("The point lies on the y-axis");
		else if(y==0 && x!=0)
		System.out.println(" The point lies on the x-axis");
		else if(x>0 && y>0)
		System.out.println("The point lies in the 1st quadrant");
		else if(x<0 && y>0)
		System.out.println("The point lies in the 2nd quadrant");
		else if(x<0 && y<0)
		System.out.println("The point lies in the 3rd quadrant");
		else if(x>0 && y<0)
		System.out.println("The point lies in the 4th quadrant");
		else
		System.out.println("The point lies in the origin.");
		sc.close();
	}

}
