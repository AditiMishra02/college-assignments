import java.util.Scanner;

public class Q8 {
	public static int power(int x, int n) {
		if (n == 0)
			return 1;
		else
			return x * power(x, n - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int x = sc.nextInt();
		int n = sc.nextInt();
		int res = power(x, n);
		System.out.println(res);
		sc.close();
	}

}
