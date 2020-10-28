/*	Design and write a Java program that searches for single- digit numbers in a text 
 *    and changes them to their corresponding words.
 *  For ex- ample, the string "4 score and 7 years ago" would be converted into 'four score and seven years ago 
 */


import java.util.Scanner;
public class No111 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
int j;
String a[]= {"zero","one","two","three","four","five","six","seven","eight","nine"};
char chr;
String s2="";
	for(j=0;j<=9;j++)
	{
		s2=Integer.toString(j);
		str=str.replace(s2,a[j]);
	}
	System.out.println(str);
	}
}