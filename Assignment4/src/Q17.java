
public class Q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			
			for(int k = 1;k<=10;k++)
			{ 
				if(k%i==0||i%k==0)
				
					System.out.print("* ");
				
				else
				System.out.print("  ");
			
				
			}
	        System.out.println(i);
          	}
	 	}
	
	}
 
