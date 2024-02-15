public class Stack {
    private int capacity = 1000;// capacity of the stack
    private int[] data;// array to store the stack elements
    private int top = -1;// top of the stack

    public Stack() {
        data = new int[capacity];// initialize the array
    }

    public Stack(int size) { // constructor to initialize the stack with the given size
        ;

        data = new int[size];// initialize the array

        capacity = size;// initialize the capacity of the stack
    }

    /* Other Methods */
    public boolean isEmpty() {// isEmpty() method returns true if the stack is empty
        return (top == -1);
    }

    public int size() {
        return (top + 1);
    }

    public void print() {
        for (int i = top; i > -1; i--) {
            System.out.print(" " + data[i]);
        }
    }

    public void push(int value) throws IllegalStateException {
        if (size() == data.length) {
            throw new IllegalStateException("StackOvarflowException");
        }
        top++;
        data[top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("StackEmptyException");
        }
        int topVal = data[top];
        top--;
        return topVal;
    }

    public int top() throws IllegalStateException {
        if (isEmpty()) {
            throw new IllegalStateException("StackEmptyException");
        }
        return data[top];
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.print();
        System.out.println(s.pop());
        System.out.println(s.pop());
        s.print();
    }

}