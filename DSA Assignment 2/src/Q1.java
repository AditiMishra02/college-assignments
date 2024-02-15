import java.util.Scanner;
   class Comission {
	 double sale,x;
	    Comission (double s){
	    	sale = s;
	    }
	    double getComission() {
	    	if(sale < 500)
	    		x = 0.02 * sale;
	    	else if (sale > 500 && sale < 5000)
	    		x = 0.05 * sale;
	    	else if (sale >= 5000)
	    		x = 0.08 * sale;
	    	return x;
	    	
	    }
}
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc= new Scanner(System.in);
		  System.out.println("Enter the sale amount");
		  double s = sc.nextDouble();
		  if(s<0)
			  System.out.println("invalid input"); 
		  else {
			  Comission obj =new Comission(s);
			  double res = obj.getComission();
			  System.out.println("Comission value = " +res); 
		  }
	}

}
