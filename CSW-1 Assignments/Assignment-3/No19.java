//Write a java program to check if a String contains only digits.

import java.util.*;
public class No19 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	String str=sc.next();
	int i,p,c=0;
	p=str.length();
	for(i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		if(Character.isDigit(ch))
			c++;
	}
	if(c==p)
	System.out.println("the given string contains only digits");
	else
		System.out.println("the given string contains does not contains only digits");
}
}
