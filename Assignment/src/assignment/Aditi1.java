package assignment;
import java.util.*;
public class Aditi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1st PART : PRINTING UNIQUE DIGITS
		
				Scanner sc=new Scanner(System.in);
			      System.out.print("Enter a large number: ");  // INPUT A LARGE NUMBER USING SCANNER CLASS
			      String n=sc.next();
			      StringBuffer nn=new StringBuffer(n);
			      String s="";
			    
			      for(int i=0;i<n.length();i++)
			      	{
			    	  for(int j=i+1;j<n.length();j++)
			    	  	{
			    		  if(n.charAt(i)==n.charAt(j))
			    		  	{
			    			  nn.setCharAt(j, '*');
			    		  	}    	
			    	  	}
			      	}
			      for(int k=0;k<nn.length();k++)
			      	{
			    	  if(nn.charAt(k)!='*')
			    	  	{
			    		  s+=nn.charAt(k);
			    		  
			    	  	}
			      	}
			      System.out.print("The unique digits present in "+n+" are ");
			      
			        
			      String lrg = "";	
					for (int j = 0; j < s.length(); j++) {
						Long max = 0L;
						for (int i = 0; i < s.length(); i++)
							{
								if (s.charAt(i) != '#')
									{
										if (max < Long.parseLong("" + s.charAt(i)))
											{
												max = Long.parseLong("" + s.charAt(i));
											}
									}
							}
						lrg += max;
						s = s.replace("" + max, "#");
					}
			      System.out.println("The largest number possible out of these unique digits is "+lrg);
			}

		

		}
		
	


