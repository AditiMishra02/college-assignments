import java.util.Scanner;

public class Q1 {
	static void check_Lucky_Number(int no) {
		if (no < 0)
			throw new NumberFormatException("Negative number");
		else
			System.out.println("Your lucky number " + no);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your lucky number");
		int num = sc.nextInt();
		try {
			check_Lucky_Number(num);
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
		System.out.println("Exception Handled");
	}

}
