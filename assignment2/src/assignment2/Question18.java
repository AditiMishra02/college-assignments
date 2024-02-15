package assignment2;

public class Question18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       double x = Double.parseDouble(args [0]);
       double y = Double.parseDouble(args [1]);
       double z = Double.parseDouble(args [2]);
       boolean res = (x < y) && ( y < z)  ||( y > z ) && (x > z) ;
       System.out.println(res);
	}

}
