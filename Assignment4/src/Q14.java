import java .util.Scanner;
public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int p=0,c=0;
		System.out.println("Enter a number ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			p=(int)Math.pow(2, i);
			if(p<=n)
				c=p;
		}
		System.out.println("The power is: " +c);
		sc.close();
	}

}
