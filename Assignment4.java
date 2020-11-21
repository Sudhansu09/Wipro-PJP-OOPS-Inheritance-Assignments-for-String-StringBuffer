/*
 * A java program that will return the first half of the string, if the length
 * of the string is even.It should return null for odd length string.
 * */
import java.util.Scanner;
class Assignment4
{
	public static void main(String args[])
	{
		String str;
		String output="";
		int n;
		Scanner input=new Scanner(System.in);

		System.out.print("Enter a String :");
		str=input.nextLine();
		n=str.length();

		if(n%2==0)
		{
			output=str.substring(0,n/2);
		}
		else
		{
			output=null;
		}
		System.out.println(output);
	}
}