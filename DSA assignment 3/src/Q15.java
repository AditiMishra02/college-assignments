import java.util.*;

class StringReverse {
	void reverse(String s) {
		if ((s == null) || (s.length() <= 1)) {
			System.out.print(s);
		} else {

			System.out.print(s.charAt(s.length() - 1));
			reverse(s.substring(0, s.length() - 1));
		}
	}
}

public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");
		String s = sc.next();
		StringReverse obj = new StringReverse();
		obj.reverse(s);

	}

}
