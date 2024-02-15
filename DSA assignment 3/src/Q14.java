import java.util.Scanner;

public class Q14 {

	static int product(int x, int y) {
		if (x < y)
			return product(y, x);
		else if (y != 0)
			return (x + product(x, y - 1));
		else
			return 0;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter any two number");
		int x = s.nextInt();
		int y = s.nextInt();
		System.out.println("the product is : " +product(x, y));
	}

}
