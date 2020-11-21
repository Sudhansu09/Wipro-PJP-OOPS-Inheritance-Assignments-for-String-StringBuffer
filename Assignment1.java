/*
 *  Write a Program that will check whether a given String is Palindrome or not
 * */
import java.util.*;
class Assignment1
{
	static boolean checkPalindrome(String str)
	{
		StringBuffer sb=new StringBuffer();
		sb.append(str);
		sb.reverse();
		if(str.equals(sb.toString()))
			return true;
		else
			return false;
	}
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a String :");
		System.out.print(checkPalindrome(input.nextLine()));
	}
}
