// array in wave form
public class Q7 {
    public static void WaveArray2(int[] arr) {
        int size = arr.length;
        /* Odd elements are lesser then even elements. */
        for (int i = 1; i < size; i += 2) {
            if ((i - 1) >= 0 && arr[i] > arr[i - 1]) {
                swap(arr, i, i - 1);
            }
            if ((i + 1) < size && arr[i] > arr[i + 1]) {
                swap(arr, i, i + 1);
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 8, 1, 2, 3, 4, 5, 6, 4, 2 };
        WaveArray2(arr);
        printArray(arr, arr.length);

    }

    public static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
