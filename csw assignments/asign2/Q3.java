import java.util.*;
// convert decimal to binary using stack collection
public class Q3 {
    public static void main (String [] args){
        Stack<Integer> stack = new Stack<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        while (num != 0){// while loop to push the number into the stack
            stack.push(num % 2);// push the remainder of the number into the stack
            num = num / 2;
        }
        while (!stack.isEmpty()){// isEmpty() method returns true if the stack is empty
            System.out.print(stack.pop());// pop() method removes and returns the top element of the stack
        }
    }
}
