package assignment2;

public class Question20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m= Integer.parseInt(args[0]);
	    int d =Integer.parseInt(args[1]);
	    boolean res = (m==3&&d>=20&&d<=31)|| (d>=1&&m==4&&d<=30)||(m==5&&d>=1&&d<=31)||(d>=1&&m==6&&d<=20);
	     System.out.println(res); 
	}

}
