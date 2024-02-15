import java.util.Scanner;
public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter the ages of Rahul, Ayush, Ajay :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b)
		{
			if(a>c)
				System.out.println("Rahul is elder");
			else
				System.out.println("Ajay is elder");
		}
		else
		{
			if(b>c)
				System.out.println("Ayush is elder");
			else
				System.out.println("Ajay is elder");
			sc.close();
		}
		
	


	}

}
