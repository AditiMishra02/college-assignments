//search an element using binary search

public class Q4 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int key = 5;
        int low = 0;
        int high = arr.length - 1; // 9
        int mid = (low + high) / 2; // 4`
        while (low <= high) {
            if (key == arr[mid]) {
                System.out.println("Element found at index " + mid);
                break;
            } else if (key < arr[mid]) {
                high = mid - 1; // search in the left half
            } else {
                low = mid + 1;
            }
            mid = (low + high) / 2;
        }
        if (low > high) {
            System.out.println("Element not found");
        }
    }

}
