
public class Q18 {
	public static void move(int n, int start, int end, int intermediate) {
		if (n == 0) {
			return;
		}

		move(n - 1, start, intermediate, end);
		System.out.println("move" + n + "from" + start + "to" + end);
		move(n - 1, intermediate, end, start);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		move(5, 1, 3, 2);
	}

}
