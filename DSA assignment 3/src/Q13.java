import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			int n;
			String x;
			Scanner s = new Scanner(System.in);
			System.out.println("enter any decimal number");
			n = s.nextInt();
			x = binary(n);
			System.out.println("binary number:" + x);

		}
	}

	public static String binary(int y) {
		int a;
		if (y > 0) {
			a = y % 2;
			return (binary(y / 2) + " " + a);
		}
		return " ";
	}
}
