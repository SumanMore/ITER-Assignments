//Write a java code to capitalize first alphabet of each word in a string.

import java.util.*;
import java.util.StringTokenizer;

public class No21
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.nextLine();
		StringTokenizer ob = new StringTokenizer(str);
		while(ob.hasMoreTokens())
		{
			String s=ob.nextToken();
			System.out.print(s.toUpperCase().charAt(0)+s.toLowerCase().substring(1)+" ");
		}
	}
}