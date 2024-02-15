// Rotating an array by k positions
public class Q5 {
    public static void rotateArray(int[] a, int n, int k) {
        reverseArray(a, 0, k - 1);
        reverseArray(a, k, n - 1);
        reverseArray(a, 0, n - 1);
    }
    public static void reverseArray(int[] a, int start, int end) {
        for (int i = start, j = end; i < j; i++, j--) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        }
        }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int n = a.length;
        int k = 3;
        rotateArray(a, n, k);
        for (int i = 0; i < n; i++) {
        System.out.print(a[i] + " ");
        }
    }

}
