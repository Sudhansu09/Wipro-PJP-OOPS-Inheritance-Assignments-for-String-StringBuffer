/*
 * Given two strings, a and b, print a new string which is made of the following
 * combination-first character of a, the first charactr of b, second character 
 * of b and so on.Any character left, will go to the end of the result.
 * */
import java.util.Scanner;
class Assignment9
{
	public static void main(String args[])
	{
		String a;
		String b;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter first String :");
		a=input.nextLine();
		System.out.print("Enter second String :");
		b=input.nextLine();
		
		String bigger = a.length() > b.length() ? a : b;
		String smaller = a.length() < b.length() ? a : b;

		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < smaller.length(); i++)
		{
			sb.append(a.charAt(i)).append(b.charAt(i));
		}		
		sb.append(bigger.substring(smaller.length(), bigger.length()));		
		System.out.println(sb);
	}
}