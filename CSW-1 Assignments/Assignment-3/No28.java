/*28.	Write a function to search for the existence of a string (target) in another string  source .
 *  The function takes two strings as the input and returns the index where the second string is found. 
 *  If the target string cannot be found, then return -1. If you are a Java developer, then you can relate 
 *  its behavior to indexOf() method from java.lang.String class. This question is also asked as Code and
 *   algorithm to check if a given short string is a substring of the main string. Can you get a linear solution (O(n)) if possible?
 */
import java.util.*;
public class No28 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	String str1=sc.nextLine();
	String str2=sc.nextLine();
	int res=search(str1,str2);
	System.out.println(res);
}
	public static int search(String str1,String str2) {
		if(str1.contains(str2))
		{
			int n=str1.indexOf(str2);
			return  n;
		}
		else
		return -1;
	}
	
	}

