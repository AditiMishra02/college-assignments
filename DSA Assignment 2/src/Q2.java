import java.util.Scanner;
class Complex{
	int real ,img;
	void setdata() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of real");
		real = sc.nextInt();
		System.out.println("Enter the value of imaginary");
	    img = sc.nextInt();
	}
	void display() {
		System.out.println("the complex number is" +real+ "+" +img+"i");
		
	}
	public Complex add (Complex C1,Complex C2) {
		Complex C3 = new Complex ();
		C3.real = C1.real + C2.real;
		C3.img = C1.img + C2.img;
		return C3;
	}
}
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex obj1 = new Complex ();
		obj1.setdata();
		obj1.display();
		Complex obj2 = new Complex ();
		obj2.setdata();
		obj2.display();
		Complex obj3 = new Complex ();
		obj3.setdata();
		obj3.display();
	}

}
