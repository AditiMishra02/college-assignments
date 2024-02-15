import java.util.Scanner;

public class Q11 {
	public static int find_GCD(int a, int b) {
		if (b == 0)
			return a;
		else
			return find_GCD(b, a % b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int res = find_GCD(a, b);
		System.out.println("The GCD of " + a + " and " + b + " is " + res);
		sc.close();
	}

}
