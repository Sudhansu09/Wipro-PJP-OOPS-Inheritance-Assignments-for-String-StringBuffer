/*
 * A java program that accepts a string and returns a new string without the
 * first and last character of the input string
**/
import java.util.Scanner;
class Assignment5
{
	public static void main(String args[])
	{
		String str;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a String :");
		str=input.nextLine();
		System.out.println(str.substring(1,str.length()-1));
	}
}