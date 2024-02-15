import java.util.Scanner;
public class Q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the marks");
		 int marks = sc.nextInt();
		 switch(marks/10)
		 {
		 case 0 : case 1: case 2: case 3:
			 System.out.println("F Grade");break;
		 case 4:
			 System.out.println("E Grade");break;
		 case 5:
			 System.out.println("D Grade");break;
		 case 6:
			 System.out.println("C Grade");break;
		 case 7:
			 System.out.println("B Grade");break;
		 case 8:
			 System.out.println("A Grade");break;
		 case 9:
		 case 10:
			 if(marks==100) {
			 System.out.println("O Grade");break;}
			 else {
				 System.out.println("WRONG INPUT");break;}
			 default:
				 System.out.println("WRONG INPUT");break;
				 }
				 sc.close();
		 
			 
			 
			 
			 
		 }
	}


