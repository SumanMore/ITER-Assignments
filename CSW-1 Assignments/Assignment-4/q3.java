//Write a program to Check if given email or URL (both) addresses are valid or not.
 

import java.util.*;
import java.util.regex.*;
public class q3 {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 String str=sc.nextLine();
		 if(str.contains("@")) {
		 Pattern p = Pattern.compile("\\A([a-z0-9])[\\w\\.]*@[a-z0-9]+([.][a-z]+)+",Pattern.CASE_INSENSITIVE);
		 Matcher m = p.matcher(str);
		 if(m.matches()) {
			 System.out.println("Valid");
		 }
		 else {
			 System.out.println("InValid");
		 }
		 }
		 else {
			 Pattern p = Pattern.compile("(((http|https)://)(www.))?[a-z0-9]+([.][a-z]+)+",Pattern.CASE_INSENSITIVE);
			 Matcher m = p.matcher(str);
			 if(m.matches()) {
				 System.out.println("Valid");
			 }
			 else {
				 System.out.println("InValid");
			 }
		 }
	}
}