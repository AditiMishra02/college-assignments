// 1   sum array
public class lastMinMeKutchNaiHota {
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of the array is " + sum);
    }
}*/
// O(n) time complexity and O(1) space complexity

// 2 sequential search
public class lastMinMeKutchNaiHota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int x = sc.nextInt();
        int flag = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }
}
// time complexity O(n) and space complexity O(1)

// 3 binary search
public class lastMinMeKutchNaiHota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int x = sc.nextInt();
        int flag = 0;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                flag = 1;
                break;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (flag == 1) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }
}
// time complexity O(log n) and space complexity O(1)

// rotate array
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
// time complexity O(n) and space complexity O(1)


//stack implementation using array

