// to check a number is prime or not
import java .util.Scanner; 
public class Q1 {
  public static void main (String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int flag = 0;
        for(int i=2;i<num;i++){
            if(num%i==0){
                flag = 1;
                break;
            }
        }
        if(flag==0){
            System.out.println("The number is prime");
        }
        else{
            System.out.println("The number is not prime");
        }
    }
}


