import java.util.ArrayList;

import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        // Ask the user to enter a number and search that number is it present in the  list or not.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to search");

        int num = sc.nextInt();
        if (list.contains(num)) {
            System.out.println("Number is present in the list");
        } else {
            System.out.println("Number is not present in the list");
        }
        // remove an element from an asked position
        list.remove (2);
        System.out.println(list);
        // check if the arraylist is empty or not
        if (list.isEmpty()) {
            System.out.println("ArrayList is empty");
        } else {
            System.out.println("ArrayList is not empty");
        }
    }
}
