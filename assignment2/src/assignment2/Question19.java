package assignment2;

public class Question19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      double BS = Double.parseDouble(args[0]);
      double DA = 0.40*BS ;
      double HRA = 0.20 * BS ;
      double GS = BS + DA + HRA ;
      System.out.println(GS);
	}

}
