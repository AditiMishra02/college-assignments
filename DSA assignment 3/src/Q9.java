import java.util.Scanner;

public class Q9 {
	public static void reverseNumber(int number) {
		if (number < 10) {
			System.out.println(number);
			return;
		} else {
			System.out.println(number % 10);
			reverseNumber(number / 10);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			System.out.println("enter the number to reverse:");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			System.out.println("reverse of the no is:");
			reverseNumber(num);
			sc.close();
		}
	}

}
