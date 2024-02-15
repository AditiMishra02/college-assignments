import java.util.Scanner;

class Student {
 String name ;
 int roll;
 double mark;
 
 void setdata() {
	 Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the name");
	  name = sc.next();
	  System.out.println("Enter the roll");
	  roll = sc.nextInt();
	  System.out.println("Enter the mark"); 
	  mark = sc.nextInt();
 }
 


   void display() {
	   System.out.println("Enter the name is " + name);
	   System.out.println("Enter the roll is " + roll);
	   System.out.println("Enter the mark is " + mark);
   }
}
   public class StudentDetails {
	   public static void main(String[] args) {
			// TODO Auto-generated method stub
		   Student S1 = new Student();
		   S1.setdata();
		   S1.display();
		   Student S2 = new Student();
		   S2.setdata();
		   S2.display();
		   Student S3 = new Student();
		   S3.setdata();
		   S3.display();

}
  }