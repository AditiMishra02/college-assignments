import java.util.Scanner;
public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,s=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no. for which you want to find the multiplication table:  ");
		int num=sc.nextInt();
		for(i=1;i<=10;i++)
		{
		s=1;
		s=num*i;
		System.out.println(num+"x"+i+"="+s);
		sc.close();
	}
	}
	
}