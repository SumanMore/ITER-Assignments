/*
 * Write a program to get the first letter of each word in a string using regex in 
Java. For example: the input string is “This is CSE Students” and output of the program is: TiCS. 

 */
import java.util.Scanner;
import java.util.regex.*;

public class q6 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		String regex="\\b[a-zA-Z]";
        Pattern p = Pattern.compile(regex); 
        Matcher m = p.matcher(s); 
        while (m.find()) 
            System.out.print(m.group()); 
	}}
          
       
          
         
