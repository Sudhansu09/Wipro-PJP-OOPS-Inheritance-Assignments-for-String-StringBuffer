/*
 * Given a String and an integer n, print a new string made of n repetitions of the
 * last n characters of the string.Assuming that n is between 0 and the length of the
 * string,inclusive.
 * */
import java.util.Scanner;
class Assignment10
{
	public static void main(String args[])
	{
		String str;
		int n;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a String :");
		str=input.nextLine();
		System.out.print("Enter a number :");
		n=input.nextInt();
		StringBuffer sb = new StringBuffer();
		if(n>=0 && n<=str.length())
		{
			for (int i = 0; i < n; i++)
			{
				sb.append(str.substring(str.length() - n));
			}
			System.out.println(sb);
		}
		else
		{
			System.out.print("Entered number is Invalid.");
		}
	}
}