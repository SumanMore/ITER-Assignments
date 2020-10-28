/*17.	Write a java code to remove all occurrences of a given character from an input String?
 */

import java.util.Scanner;
public class No17 {

	public static void main(String[] args) {
		String st,st1="";
		int i;
		char ch,ch1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		st=sc.nextLine();
		st=st.toLowerCase();
		System.out.println("enter the character to be removed in lower case");
		ch=sc.next().charAt(0);
		for(i=0;i<st.length();i++)
		{
			ch1=st.charAt(i);
			if(ch!=ch1)
				st1=st1+ch1;}
		System.out.println(st1);
		}}