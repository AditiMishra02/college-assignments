import java.util.Scanner;

public class Q5 {
	public static <E> void printArray(E[] inputArray) {
		for (E element : inputArray) {
			System.out.println(element);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Integer[] arr = new Integer[5];
		System.out.println("enter arry elements");
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		System.out.println("integer array contains:");
		printArray(arr);

		Double doublearr[] = new Double[5];
		System.out.println("enter arry elements");
		for (int i = 0; i < arr.length; i++)
			doublearr[i] = sc.nextDouble();
		System.out.println("double array contains:");
		printArray(doublearr);
	}

}
