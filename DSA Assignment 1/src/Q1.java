import java.util.Scanner;
class Number {
	int a,b,c;
	void getdata() {
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a , b and c :");
		      a = sc.nextInt();
		      b = sc.nextInt();
		      c = sc.nextInt();
		     
}
	void IsArithmaticOrder() {
		if( (a+b==c)||(b-c == a)||(a*b==c))
		 System.out.println("correct arithmetic formula");	
		else
			System.out.println("Incorrect arithmetic formula");		
	}
}
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Number obj = new Number()  ;
          obj.getdata();
	      obj.IsArithmaticOrder();
	}
}
	





























































