import java.util.Scanner;

public class Q7 {
	public static int fact(int num) {
		if (num == 0)
			return 1;
		else
			return num * fact(num - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		int res = fact(num);
		System.out.println("the factorial of " + num + "is" + res);
	}

}
