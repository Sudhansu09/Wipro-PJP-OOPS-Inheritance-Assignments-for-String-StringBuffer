/*
 * Given a string, if the first or last chars are 'x', return the string without
 * those 'x' chars,otherwise return the string unchanged.
 * */
import java.util.Scanner;
class Assignment7
{
	public static void main(String args[])
	{
		String str;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a String :");
		str=input.nextLine();

		if (str.charAt(0) == 'x')
		{
			str = str.substring(1, str.length());
		}		
		if (str.charAt(str.length()-1) == 'x')
		{
			str = str.substring(0, str.length() - 1);
		}		
		System.out.println(str);
	}
}