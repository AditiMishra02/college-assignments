package assignment2;

public class Question22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     double P,r,t;
     P = Double.parseDouble(args[0]);
     r = Double.parseDouble(args[1]);
     t = Double.parseDouble(args[2]);
    double res = P*Math.exp(t*r);
    System.out.println(P);
    System.out.println(r);
    System.out.println(t);
    System.out.println(res);
    
    
	}

}
