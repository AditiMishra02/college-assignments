package assignment2;

public class Question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int num1 = Integer.parseInt(args[0]);
     int num2 = Integer.parseInt(args[1]);
     String res = num1 % num2==0 ||num2 % num1 ==0 ? "true":"";
     System.out.println(res);
	
	}
}
