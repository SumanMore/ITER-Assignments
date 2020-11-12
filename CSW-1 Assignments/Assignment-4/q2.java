/*Write a Java program to read all mobile numbers present in given file and vali 
date it on below criteria: 
- The first digit should contain number between 7 to 9. 
-The rest 9 digit can contain any number between 0 to 9.
 - The mobile number can have 11 digits also by including 0 at the starting. 
 - The mobile number can be of 12 digits also by including 91 at the starting 
 The number which satisfies the above criteria is a valid mobile Number. 
 */



import java.util.*;
import java.util.regex.*;
class q2{
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter mobile number");
    	String s=sc.nextLine();
		String r = "(0|(91))?[789][0-9]{9}";
		Pattern p = Pattern.compile(r);
		
		Matcher m = p.matcher(s);
		if(m.matches())
	      System.out.println("valid");
		else
		
		
			System.out.println("invalid");
		
	}
}
