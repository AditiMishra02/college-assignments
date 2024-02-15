package assignment2;

public class Question16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a= Integer.parseInt(args[0]);
	     int b= Integer.parseInt(args[1]);
	     int num1 = a+ (int) (Math.random()*(b-a+1));
	     int num2 = b+(int) (Math.random()*(b-a+1));
	     int res = num1+num2 ;
	     System.out.println(res);
			
	}

}
