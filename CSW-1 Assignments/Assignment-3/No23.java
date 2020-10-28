//Write a java code to move all uppercase characters to the end of string.


import java.util.*;
public class No23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
int i;
String str1="",str2="";
for(i=0;i<str.length();i++)
{
	   char ch=str.charAt(i);
	   if(Character.isUpperCase(ch))
	   str2=str2+ch;
	   else 
		   str1=str1+ch;
	}
System.out.println(str1+str2);}
}
