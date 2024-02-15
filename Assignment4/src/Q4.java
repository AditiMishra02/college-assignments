import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the count from :");
	    int cf=sc.nextInt();
		System.out.print("Enter the count to :");
	    int ct=sc.nextInt();
		System.out.print("Enter the count by :");
		int cb=sc.nextInt();
		for(i=cf;i<=ct;i+=cb)
		{
		System.out.print(i+" ");
		 sc.close();
	}
       
}
}