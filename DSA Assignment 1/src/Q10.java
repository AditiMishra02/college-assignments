import java.util.Scanner;
class Student1 {
 String name ;
 int roll;
 double mark;
 
 void Setdata(String n , int r, double m ) {
	 name = n;
	 roll= r;
	 mark= m;
 }

 void display() {
	   System.out.println(" the name is " + name);
	   System.out.println(" the roll is " + roll);
	   System.out.println(" the mark is " + mark);
 }
}
public class Q10 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the name");
            String  n = sc.next();
            System.out.println("Enter the roll");
      	    int r = sc.nextInt();
      	     System.out.println("Enter the mark"); 
      	     double m = sc.nextDouble();
      	    Student1 S1 = new Student1();
 		     S1.Setdata(n,r,m);
 		     S1.display();
	}

}
