
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
    for(int i = 1; i<10000; i++ ) {
    	boolean res= isPrime(i);
    	if(res)
    		System.out.println(i);
    }
	}
   public static boolean isPrime(int num) {
	   int ctr=0;
	   for(int i=1; i<=num; ++i) {
		   if(num % 1 == 0)
			   ctr++;
	   }
	   if(ctr==2)
		   return true ;
	   else
		   return false;
   }
}
