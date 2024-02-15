import java.util.Scanner;

class Node {
	int info;
	Node link;
}

public class CLL {
	Scanner sc = new Scanner(System.in);
	Node head = null;
	Node tail = null;

	public void Create() {
		// Adding first Node
		Node temp = new Node();
		System.out.println("Input Info");
		temp.info = sc.nextInt();
		temp.link = null;
		head = tail = temp;

		// Adding remaining nodes
		Node newNode;
		System.out.println("Do you want more nodes (y/n)");
		char ch = sc.next().charAt(0);
		while (ch != 'n') {
			newNode = new Node();
			System.out.println("Input Info");
			newNode.info = sc.nextInt();
			newNode.link = null;
			tail.link = newNode;
			newNode.link = head;
			tail = newNode;
			System.out.println("Do you want more nodes (y/n)");
			ch = sc.next().charAt(0);
		}
	}

	public void display() {
		Node temp = head;
		if (temp == null)
			System.out.println("The circular linked list is empty");
		else {
			System.out.println("The circular linked list is :");
			System.out.println("head = " + head);
		}
		do {
			System.out.println(temp.info + "" + temp.link);
			temp = temp.link;
		} while (temp != tail.link);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          CLL obj = new CLL() ;
          char option;
          Scanner sc = new Scanner(System.in);
          do {
        	  System.out.println("Displaying the menu");
        	  System.out.println("1. create ");
        	  System.out.println("2. display ");
        	int ch = sc.nextInt();
        	switch(ch)  {
        	case 1 :
        		obj.Create();
        		break;
        	case 2 :
        		obj.display();
        		break;
        		default :
        			 System.out.println("wrong choice");	
        	}
        	 System.out.println("Do you want to continue (y/n) ");
        	 
          }
	}

}
