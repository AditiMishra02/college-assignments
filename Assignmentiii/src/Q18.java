import java.util.Scanner;
public class Q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 System.out.println("What is your gender (M or F):");
		 char gender= sc.next().charAt(0);
		 System.out.println("First name:");
		 String FN = sc.next();
		 System.out.println("Last name:"); 
		 String LN = sc.next();
		 System.out.println("Age:"); 
		 int age = sc.nextInt();
		 
		 if(gender =='F')
		 {
			 if(age>=20)
			 {
				 System.out.println("Are you married,"+FN+ "(y or n)? "); 
				 char M = sc.next().charAt(0);
				 if(M =='y')
				 {
					 System.out.println("Then I shall call you Mrs." +FN+""+LN); 
				 }
				 
			 }
			 else
				 {
					 System.out.println ("Then I shall call you Ms. " +FN+""+LN); 
				 }
		 }
		 else
		 {
			 if(gender=='M')
			 {
				 System.out.println ("Then I shall call you Mr." +FN+""+LN);  
			 }
			 else
			 {
				 System.out.println ("Then I shall call you " +FN+""+LN); 
			 }
		 sc.close();
		 }
		
		 }
     }

		 
		 
		 
	


