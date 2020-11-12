//Write a program in Java to remove whitespaces from a string.


import java.util.Scanner;
import java.util.regex.*;

	public class q1 { 
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the String");
			String s=sc.nextLine();
			String regex="[\\s]";
			Pattern p=Pattern.compile(regex);
			Matcher m=p.matcher(s);
			System.out.println(m.replaceAll(""));
			
		}
}
	//OR
	/*
	 * import java.util.Scanner;
import java.util.regex.*;

	    public class q1 { 
		public static void main(String args[])
		{ Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	String s=sc.nextLine();
	String regex="\\S";
	Pattern p=Pattern.compile(regex);
	Matcher m=p.matcher(s);
	while(m.find())
	System.out.println(m.group());
*/
