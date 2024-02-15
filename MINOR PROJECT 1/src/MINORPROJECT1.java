/* 
 * NAME : ADITI MISHRA
 * REG
 */

import java.util.Scanner;

public class MINORPROJECT1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1ST PART: UNIQUE DIGITS PRESENT IN GIVEN LARGE NUMBER
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A LARGE NUMBER = "); // ENTERING A LARGE NUMBER AS STRING
		String n = sc.next();
		
	      StringBuffer s = new StringBuffer(n);
	      String str="";
	    
	      for(int i=0;i<n.length();i++)
	      	{
	    	  for(int j=i+1;j<n.length();j++)
	    	  	{
	    		  if( n.charAt(i) == n.charAt(j) ) // REPLACING DUPLICATE ELEMENT WITH '*'
	    		  	{
	    			  s.setCharAt(j, '*');   
	    		  	}    	
	    	  	}
	      	}
	      for(int k=0;k<s.length();k++)
	      	{
	    	  if(s.charAt(k)!='*')
	    	  	{
	    		 str+= s.charAt(k);  //  STORING UNIQUE DIGITS AS STRING IN STR
	    		  
	    	  	}
	      	}
	   
	      System.out.println("The unique digits present in "+n+" are : " +str);  // PRINTING UNIQUE DIGITS
	      
	     
	     // 2ND PART : LARGEST NUMBER POSSIBLE USING UNIQUE DIGITS FOUND IN THE FIRST PART
	  
	        String lrg = "";	
			for (int j = 0; j < str.length(); j++) 
			{
				Long num = 0L; 
				for (int i = 0; i < str.length(); i++)
					{
						if (str.charAt(i) != '#')
							{
								if (num < Long.parseLong("" + str.charAt(i)))
									{
										num = Long.parseLong("" + str.charAt(i));// CONVERT INTO LONG
									}
							}
					}
				lrg += num;
				str= str.replace("" +num, "#"); // REPLACING WITH #
			}
			
	            System.out.println("The largest number possible using unique digits is: "+lrg); // PRINTING LARGEST POSSIBLE NUMBER
	            sc.close();
	}
}


         