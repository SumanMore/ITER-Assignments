/* Write a program to extract maximum numeric value from a given string. For ex 
ample: this is “There is 60 students in csed section, 40 in cseb, and 55 in csea”
 input string and output is 60. 
 */


import java.util.Scanner;
import java.util.regex.*;
public class q4 {
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the string with numeric value ");
			String s =sc.nextLine();
			String regex = "\\d{1,}"; //"\\d+"
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(s);
			int max_no= 0;
			while(m.find()) 
			{
				String s1=m.group();
				int n = Integer.valueOf(s1);
				if(n > max_no)
					max_no=n;
			}
			System.out.println(max_no);
		}
	}


