
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		double s=0,avg=0;
	     int N=Integer.parseInt(args[0]);
		for(i=1;i<=N;i++)
		{
		double r=Math.random();
		System.out.println(r);
		s+=r;
		}
		System.out.println("Sum of the random numbers = "+s);
		avg=s/N;
		System.out.println("average="+avg);
	}

}
