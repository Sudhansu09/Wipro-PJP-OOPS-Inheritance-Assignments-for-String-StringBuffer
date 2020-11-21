/*
 * Given a string, return a new string made of n copies of the first 2 chars
 * of the original string where n is the length of the string.
 * */
import java.util.Scanner;
class Assignment3
{
	public static void main(String args[])
	{
		String str;
		String temp="";
		String output="";
		int n;
		Scanner input=new Scanner(System.in);

		System.out.print("Enter a String :");
		str=input.nextLine();
		n=str.length();

		if(n<2)
		{
			temp=str;
		}
		else
		{
			temp=str.substring(0,2);
		}
		for(int i=1;i<=n;i++)
		{
			output=output+temp;
		}
		System.out.println(output);

	}
}