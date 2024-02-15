import java.util.Scanner;
class Flower {
	String name;
	int petals;
	double price;
	
	Flower(){
		name = "rose";
		petals = 5;
		price = 20;
	}
	  void getdata() {
		  Scanner sc= new Scanner(System.in);
		  System.out.println("Enter the name of the flower");
		  name = sc.next();
		  System.out.println("Enter the number of petals of the flower");
		  petals = sc.nextInt();
		  System.out.println("Enter the price of the flower");
		  price = sc.nextDouble();
	  }

	   void showdata() {
		   System.out.println("Name of the flower:" +name);
		   System.out.println("Number of petals of the flower:" +petals);
		   System.out.println("price of the flower:" +price);
	   }
}
public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Flower obj = new Flower();
       obj.showdata();
       Flower obj1 = new Flower();
       obj1.showdata();
       obj1.getdata();
	}

}
