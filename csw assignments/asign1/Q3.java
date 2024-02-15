// reverse a number
import java.util.Scanner;
public class Q3 {
    public static void main (String []args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int num = sc.nextInt();
    int r,rev=0;
    while(num>0){
        r = num%10;
        rev = rev*10 + r;
        num = num/10;
    }
    System.out.println("The reverse of the number is "+rev);
}
}
