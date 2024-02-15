import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     System.out.println("enter number of setences");
     int n = sc.nextInt();
     System.out.println("enter" +n+ "number of setences");
     sc.nextLine();
     String [] str = new String[n];
     for (int i = 0 ; i < n; i++) {
    	 str [i] = sc.nextLine();}
    	 System.out.println("reverse order"); 
    	 for(int i = n-1; i>=0;i--) {
    		 System.out.println(str[i]); 
    	 }
     }
     
	}


