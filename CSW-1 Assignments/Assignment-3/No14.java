/*14.	Write a Java program to find first non repeating character in a string . 
 * Example: The given string is: gibblegabbler
The first non repeated character in String is: i
*/



import java.util.*;
public class No14 {

	public static void main(String[] args) {
		
				Scanner sc=new Scanner(System.in);
				String str=sc.nextLine();
				 for (int i=0;i<str.length();i++) {
					 char ch=str.charAt(i);
					 if(str.indexOf(ch)==str.lastIndexOf(ch)) {
						 System.out.println(ch);
						 break;
					 }
				}
			}
		}


