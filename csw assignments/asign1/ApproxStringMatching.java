import java.util.Scanner;

public class ApproxStringMatching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Source String");
        String s = sc.nextLine();
        System.out.println("Enter Target String");
        String t = sc.nextLine();
        int n = stringComparison(s, t, s.length(), t.length());
        System.out.println("The minimum no. of operation required to convert \"" + s + "\" to \"" + t + "\" is " + n);
    }

    public static int stringComparison(String s1, String s2, int a, int b) {
        int ar[][] = new int[a + 1][b + 1];
        for (int i = 0; i <= a; i++) {

            for (int j = 0; j <= b; j++) {
                if (i == 0)
                    ar[i][j] = j;
                else if (j == 0)
                    ar[i][j] = i;
                else if (s1.charAt(i - 1) == s2.charAt(j - 1))
                    ar[i][j] = ar[i - 1][j - 1];
                else
                    ar[i][j] = Math.min(Math.min(ar[i][j - 1], ar[i - 1][j]), ar[i - 1][j - 1]) + 1;
            }
        }
        return ar[a][b];
    }
}
