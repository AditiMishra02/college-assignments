package assignment2;

public class Question24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a =Math.random();
		double b =Math.random();
		double c =Math.random();
		double d =Math.random();
		double e =Math.random();
		double max = Math.max(a,Math.max(c,Math.max(d, e)));
		double min =Math.min(a,Math.min(c,Math.min(d, e)));
        double avg = (a+b+c+d+e)/5;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println("maximum value = " + max);
        System.out.println( "minimum value = " + min);
        System.out.println("average = " + avg);
        
      
	}

}
