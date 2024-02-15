import java.util.*;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter the no :");
		 int n= sc.nextInt();
		 boolean p =isPalindrome(n);
		 if(p==true)
			 System.out.println("no is palindrome");
		 else
			 System.out.println("not a palindrome");
		 sc.close();
	}
		public static boolean isPalindrome (int n) {
			   int r = reverse(n);
			   return(r==n);
		}
		public static int reverse(int num) {
			int r = reverse ;
		 
	}

}
