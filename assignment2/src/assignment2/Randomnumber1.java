package assignment2;

public class Randomnumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      // create a random number between (0-1)
		double num1 = Math.random();
		System.out.println(num1);
		// generate a random no between (0-N) let N=50
		num1 = Math.random()*50;
		System.out.println(num1);
		//generate a random number between min and max
		int min = 1, max=4;
		num1 = min + Math.random()*(max-min);
		System.out.println(num1);
		//generate a random number integer between min and max both inclusive
		int num2 = (int) (Math.random()*(max-min+1));
		System.out.println(num2);
	}

}
