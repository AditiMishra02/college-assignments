import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a,b,c,d,e,f:");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double d = sc.nextDouble();
		double e = sc.nextDouble();
		double f = sc.nextDouble();
		if(a*d-b*c==0)
		{
		System.out.println("the equation has no solution");}
		else
		{
	    double x = (e*d-b*f)/(a*d-b*c);
		double y = (a*f-e*c)/(a*d-b*c);
		System.out.println("x is "+x+"and y is "+y);}
		
		sc.close();
	}

}
