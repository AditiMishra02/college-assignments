import java.util.Scanner;
class Student {
	  int roll;
	  String name;
	  String course;

	  void input_Student() {
	    Scanner sc1 = new Scanner(System.in);
	    System.out.println("Enter the roll");
	    roll = sc1.nextInt();
	    sc1.nextLine(); // this is needed but why?---in order to take \n which comes by default
	            // after integer value is taken

	    System.out.println("Enter the name");
	    name = sc1.nextLine();
	    System.out.println("Enter the course name");
	    course = sc1.nextLine();
	  }

	  void display_Student() {
	    System.out.println("Name : " + name);
	    System.out.println("Roll : " + roll);
	    System.out.println("Course : " + course);

	  }
	}

	class Exam extends Student {
	  double mark1, mark2, mark3;

	  void input_Marks() {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the three marks of Student ");
	    mark1 = sc.nextDouble();
	    mark2 = sc.nextDouble();
	    mark3 = sc.nextDouble();
	  }

	  void display_Result() {
	    System.out.println("Mark 1  is :" + mark1);
	    System.out.println("Mark 2  is :" + mark2);
	    System.out.println("Mark 3  is :" + mark3);

	  }
	}

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number of students whose result you want to display.");
	    int N = sc.nextInt();
	    Exam[] ex = new Exam[N];

	    for (int i = 0; i < N; i++) {
	      ex[i] = new Exam();
	      ex[i].input_Student();
	      ex[i].input_Marks();
	      ex[i].display_Student();
	      ex[i].display_Result();
	    }

	  }

	}

           
	


