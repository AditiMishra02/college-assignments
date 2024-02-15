import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      int computer = (int)(Math.random()*3);
      System.out.println("scissor (0), rock (1), paper (2):");
      int user = sc.nextInt();
      
      System.out.println("Computer is ");
      switch(computer) 
      {
      case 0 :
    	  System.out.println("Scissor");break;
      case 1 :
    	  System.out.println("Rock");break;
      case 2 :
    	  System.out.println("Paper");break;
      }
      
      System.out.println("User is ");
      
      switch (user)
      {
      case 0 :
    	  System.out.println("Scissor");break;
      case 1 :
    	  System.out.println("Rock");break;
      case 2 :
    	  System.out.println("Paper");break;
      }
      
     
       
      if(computer==user) {
    	  System.out.println("It is a draw "); } 
    	  else 
    	  {
    		boolean win = (user == 0 && computer == 2) || (user == 1 && computer==0) || (user == 2 && computer == 1);
    		
    		if(win) 
    			System.out.println("you won"); 
    			 else 
    				System.out.println("you lose");
    		 sc.close();
    	  }
    	  }
            
	}


