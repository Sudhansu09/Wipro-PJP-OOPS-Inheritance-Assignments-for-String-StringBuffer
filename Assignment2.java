/*
 * Program that will concatenate 2 string and return the result.The result
 * should be in lowercase.If the concatenation create a double-char, then
 * one of the characters need to be omitted.
 * */
import java.util.*;
class Assignment2
{
	static String removeDuplicate(char str[], int n) 
    { 
        int index = 0; 
        for (int i = 0; i < n; i++) 
        { 
            int j; 
            for (j = 0; j < i; j++)  
            { 
                if (str[i] == str[j]) 
                { 
                    break; 
                } 
            }
            if (j == i)  
            { 
                str[index++] = str[i]; 
            } 
        } 
        return String.valueOf(Arrays.copyOf(str, index)); 
    } 
	public static void main(String args[])
	{
		String str1;
		String str2;
		int length;

		Scanner input=new Scanner(System.in);		
		System.out.print("Enter first String :");
		str1=input.nextLine();
		System.out.print("Enter second String :");
		str2=input.nextLine();

		char ch[]=((str1.toLowerCase()).concat(str2.toLowerCase())).toCharArray();

		System.out.print(removeDuplicate(ch,ch.length));
	}
}