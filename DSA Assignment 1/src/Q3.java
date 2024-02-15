
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      char[] alpha = {'C','A','R','B','O','N'};
      int i,j,k,l,m,n,count = 0;
      for (i=0; i< alpha.length; i++) {
    	  for (j=0; i< alpha.length; j++) {
    		  for (k=0; i< alpha.length; k++) {
    			  for (l=0; i< alpha.length; l++) {
    				  for (m=0; i< alpha.length; m++) {
    					  for (n=0; i< alpha.length; n++) {
    						  if(i!=j && i!=k && i!=l && i!=m && i!=n && j!=k && j!=l && j!=m && j!=n && k!=l && k!=m && k!=n && l!=m && l!=n && m!=n );
    						  String str = ("")+ alpha[i] + alpha[j] + alpha[k]+alpha[l]+alpha[m]+alpha[n];
    						    System.out.println(str) ;
    						    count+=1;
    						  
    					  }
    				  }
    			  }
    		  }
    	  }
      }
    	  
	}

}
