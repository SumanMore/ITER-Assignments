/*5.	Write a program to enter a string and print the string in a format which says that 1st letter of 
 * each word present in the string must be printed in capital letters
 */
import java.util.*;
public class No5 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String str=sc.nextLine();
	int i;
	str=' '+str;
	String str1="";
	char ch,chr1;
	for(i=0;i<str.length();i++)
	{
	
		ch=str.charAt(i);

	if(ch!=' ')             
		str1=str1+ch; 
	               
	else {
		chr1=str.charAt(i+1);
		str1=str1+' '+Character.toUpperCase(chr1);
		i=i+1;
		
}}
System.out.println(str1);
}
}