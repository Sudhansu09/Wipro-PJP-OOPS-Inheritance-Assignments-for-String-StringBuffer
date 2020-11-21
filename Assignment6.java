/*
 * Given 2 strings, a and b, return a new string of the form short+long+short,
 * with the shorter string on the outside and the longer string on the inside.
 * */
import java.util.Scanner;
class Assignment6
{
	public static void main(String aargs[])
	{
		String a;
		String b;
		String output="";
		Scanner input=new Scanner(System.in);

		System.out.print("Enter first String :");
		a=input.nextLine();
		System.out.print("Enter second String :");
		b=input.nextLine();

		if(a.length()==b.length())
		{
			System.out.print("Please enter a long and a short String.");
		}
		else
		{
			if(a.length()>b.length())
			{
				output=b+a+b;
			}
			else
			{
				output=a+b+a;
			}
			System.out.print(output);
		}
	}
}