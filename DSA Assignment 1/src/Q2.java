import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Check obj = new Check();
		obj.getdata();
		System.out.println("The number of time we need to divide the number by 2 to get a number lesser than 2 is"
				+ obj.calculate());
	}
}

class Check {
	int a;

	void getdata() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		a = sc.nextInt();
		if (a < 2)
			System.exit(0);

	}

	int calculate() {
		int i = 0;
		while (a >= 2) {
			a = a / 2;
			i++;
		}

		return i - 1;

	}
}
