import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int n = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		int c[] = new int[n];

		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "]=");
			a[i] = sc.nextInt();

		}
		for (int i = 0; i < b.length; i++) {
			System.out.println("b[" + i + "]=");
			b[i] = sc.nextInt();

		}
		System.out.println("a[i].b[i] = c[i]");

		for (int i = 0; i < n; i++) {
			c[i] = a[i] * b[i];
			System.out.println("c[" + i + "]=" + c[i]);
		}
	}

}
