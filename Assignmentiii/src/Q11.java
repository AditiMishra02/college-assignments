import java.util.Scanner;
public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the weight and height ");
		double wt=sc.nextDouble();
		double ht=sc.nextDouble();
		double BMI=wt/(ht*ht);
		System.out.println("BMI= "+BMI);
		
		if(BMI<18.5) {
		System.out.println("Under weight");}
		else if(BMI>=18.5 && BMI<24.9) {
		System.out.println("Normal weight");}
		else if(BMI>=25.0 && BMI<29.9) {
		System.out.println("Over weight");}
		else {
		System.out.println("obese");}
		sc.close();
	}

}
