import java.util.Scanner;

public class Q6 {
	public static <T> int count(T[] Array, T item) {

		int count1 = 0;
		for (int i = 0; i < Array.length; i++) {
			if (Array[i].equals(item))
				count1++;
		}
		return count1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Double[] arr = new Double[5];
		System.out.println("enter array elements");
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextDouble();
		System.out.println("enter the elements to search ");
		double item = sc.nextDouble();
		int c = count(arr, item);
		System.out.println("number of times " + item + " present in the array is " + c);

		Integer[] arr1 = new Integer[5];
		System.out.println("enter array elements");
		for (int i = 0; i < arr1.length; i++)
			arr1[i] = sc.nextInt();
		System.out.println("enter the elements to search ");
		int item1 = sc.nextInt();
		int c1 = count(arr1, item1);
		System.out.println("number of times " + item1 + " present in the array is " + c1);

		String[] arr2 = new String[5];
		System.out.println("enter array elements");
		for (int i = 0; i < arr2.length; i++)
			arr2[i] = sc.next();
		System.out.println("enter the elements to search ");
		String item2 = sc.next();
		int c2 = count(arr2, item2);
		System.out.println("number of times " + item2 + " present in the array is " + c2);
	}

}
