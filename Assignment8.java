/*
 * A java Program that accepts a string (with * in it). The program should return
 * anew string in which the following characters are  removed- *,the characters
 * that are to the left and right of *.
 * */
import java.util.Scanner;
class Assignment8
{
	public static void main(String args[])
	{
		String str;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a string (with * in it) :");
		str=input.nextLine();
		String[] strs = str.split(".[\\*]+.");
		
		StringBuffer sb = new StringBuffer();
		
		for (String x : strs)
			sb.append(x);
		
		System.out.println(sb);
		
	}
}