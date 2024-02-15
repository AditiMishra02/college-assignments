import java.util.Scanner;
public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter today’s day: ");
		int day = sc.nextInt();
		System.out.print("Enter the number of days elapsed since today: ");
		int Elapsed = sc.nextInt();
		int futureDay = (day + Elapsed) % 7;
		String dayoftheweek = "";
		
		switch (day)
		{
		case 0: dayoftheweek = "Sunday"; break;
		case 1: dayoftheweek ="Monday"; break;
		case 2: dayoftheweek ="Tuesday"; break;
		case 3: dayoftheweek ="Wednesday"; break;
		case 4: dayoftheweek ="Thursday"; break;
		case 5: dayoftheweek ="Friday"; break;
		case 6: dayoftheweek ="Saturday";break;
		
		}
		if(futureDay==0)
		{
			System.out.println("Today is " + dayoftheweek + " and the future day is Sunday");
		}
		else if (futureDay==1)
		{
			System.out.println("Today is " + dayoftheweek + " and the future day is Monday");
		}
		else if (futureDay==2)
		{
			System.out.println("Today is " + dayoftheweek + " and the future day is Tuesday");
		}
		else if (futureDay==3)
		{
			System.out.println("Today is " + dayoftheweek + " and the future day is Wednesday");
		}
		else if (futureDay==4)
		{
			System.out.println("Today is " + dayoftheweek + " and the future day is Thursday");
		}
		else if (futureDay==5)
		{
			System.out.println("Today is " + dayoftheweek + " and the future day is Friday");
		}
		else if (futureDay==6)
		{
			System.out.println("Today is " + dayoftheweek + " and the future day is Saturday");
		}
		sc.close();
	}

}
