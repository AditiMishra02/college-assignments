import java.util.Scanner;
public class Q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the integer");
		 int num = sc.nextInt();
		 boolean res;
		
		 if((num%5==0)&&(num%6==0))
		    res=true;
		 else
		    res=false;
		 System.out.println("Is" +num+ "divisible by 5 and 6? " +res);
		 
		
		 if ((num%5==0)||(num%6==0))
		     res= true;
		 else
			 res=false;
		 System.out.println("Is" +num+ "divisible by 5 or 6? " +res); 
		 
		 
		 if ((num%5==0||num%6==0)||(num%5==0&&num%6==0))
			 res=true;
		 else 
			 res=false;
			 System.out.println("Is" +num+ "divisible by 5 or 6, but not both? " +res);	 
		 
		sc.close(); 
			 
		 
	}
}
