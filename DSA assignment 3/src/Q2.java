import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = new String[4];
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter four colours");
			for (int i = 0; i < 4; i++) {
				str[i] = sc.next();
			}

			try {
				System.out.println("Convert string to integer ");
				int n = Integer.parseInt(str[0]);
				System.out.println(n);
			} catch (NumberFormatException e) {
				System.out.println(e);
			}
			try {
				System.out.println("Enter one more colours");
				str[5] = sc.next();
			} catch (StringIndexOutOfBoundsException e) {
				System.out.println(e);
			}
		} catch (Exception e) {
			System.out.println(e);

		} finally {
			System.out.println("The colours entered are");
			for (int i = 0; i < 4; i++) {
				System.out.println(str[i]);
				sc.close();
			}
		}

	}

}
