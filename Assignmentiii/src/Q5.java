import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a,b,c : ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		if(a!=0)
		{
			double d = b*b-4*a*c;
			if(d>0)
			{
			   double r1= (-b + Math.sqrt(d))/(2*a);
			   double r2= (-b - Math.sqrt(d))/(2*a);
			   System.out.println("The equation has two real roots " +r1+ "and" +r2);
			   }
			else if (d==0)
			{
				double r3 = (-b + Math.pow(d, 0.5)) / (2 * a);
				System.out.println("The equation has one root " + r3);
				}
			else
				
				{
				System.out.println("The equation has no real roots ");
				}
			sc.close();
			}
		}
		
	}


