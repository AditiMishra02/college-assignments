import java.util.Scanner;

public class Q12 {
	public static int BinarySearch(int arr[], int first, int last, int key) {
		if (last >= first) {
			int mid = first + (last - first) / 2;
			if (arr[mid] == key) {
				return mid;
			}
			if (arr[mid] > key) {
				return BinarySearch(arr, first, mid - 1, key);
			} else {
				return BinarySearch(arr, mid + 1, last, key);
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of elements in the array");
		int num = sc.nextInt();
		int[] arr = new int[num];
		System.out.println("enter" + num + "no of elements in ascending order");
		for (int i = 0; i < num; i++)
			arr[i] = sc.nextInt();
		System.out.println("enter the element to search");
		int item = sc.nextInt();
		int res = BinarySearch(arr, 0, num - 1, item);
		if (res != -1)
			System.out.println("the" + item + "is ptresent at index" + res);
		else
			System.out.println("item is not present in the array");

	}

}
