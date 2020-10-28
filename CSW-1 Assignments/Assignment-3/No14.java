/*14.	Write a Java program to find first non repeating character in a string . 
 * Example: The given string is: gibblegabbler
The first non repeated character in String is: i
*/

import java.util.*;
public class No14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String str=sc.next();
str=str.toLowerCase();
int i,j,c=0;

	for(i=0;i<str.length();i++)
	{  c=0;
		
		for(j=0;j<str.length();j++)
		{
			if(str.charAt(j)==str.charAt(i))
				c++;
		}
	if(c==1)
	{
		System.out.println(str.charAt(i));
		break;
	}
	
}

	}

}
