import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
        System.out.println("Enter a message");
        String ms = sc.next();
        int n= Integer.parseInt(args[0]);
        int i=1;
        String s;
        while(i<=n)
        {
     	   if(i%10==1 && i%100!=11)
     		 s  = "st" ;
     	   else if(i%10==2 && i%100!=12)
     		  s =  "nd";
     	   else if(i%10==3 && i%100!=13)
     		  s = "rd";
     	   else
     		  s = "th"; 
     	  System.out.println(i + s +" " +ms);
     	  i++;
     	  sc.close();
           }
      
	}

}
