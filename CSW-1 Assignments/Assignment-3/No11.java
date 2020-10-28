/*11.	Design and write a Java program that searches for single- digit numbers in a text and changes
 *  them to their corresponding words. For ex- ample, the string "4 score and 7 years ago" would be 
 *  converted into 'four score and seven years ago 
 */
import java.util.*;
public class No11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
int i,j;int x;
String a[]= {"zero","one","two","three","four","five","six","seven","eight","nine"};
char chr;
String s1="",s2="";

	for(j=0;j<str.length();j++)
	{
		chr=str.charAt(j);
		if(Character.isDigit(chr)) 
		{
			s2=Character.toString(chr);
			int ar= Integer.parseInt(s2);
			
			s1=s1+a[ar];
		}
			else
			{
				s1=s1+chr;
			}
	}
	System.out.println(s1);
	}
}
 