import java.util.Scanner;

public class Q16 {
	static boolean checkPalindrome(String str, int s, int e) 
    { 
        if (s == e)// If there is only one character 
            return true;  
        if ((str.charAt(s)) != (str.charAt(e))) // If first and last characters do not match 
            return false;   
         //If there are multiple characters, check if 
        //middle substring is also palindrome or not. 
        if (s < e + 1) 
            return checkPalindrome(str, s + 1, e - 1);   
        return true; 
    }   
    static boolean isPalindrome(String str) 
    { 
        int n = str.length();   
    //If string is empty,then it is palindrome 
        if (n == 0) 
            return true;   
        return checkPalindrome(str, 0, n - 1); 
    }   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  //Take input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.next();
        //Check whether palindrome or not
        if (isPalindrome(str)) 
            System.out.println(str+" is palindrome"); 
        else
            System.out.println(str+ " is not a palindrome"); 
    }   
	}


