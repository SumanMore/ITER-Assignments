/*26.	Write a Java program which will take a String input and print out a number of vowels and consonants 
 * on that String. For example, if the input is "Java" then your program should print "2 vowels and 2 consonants .
 */
import java.util.*;
public class No26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	       String str=sc.nextLine();
	       int i,c=0,v=0;
	       for(i=0;i<str.length();i++)
	       {
	    	   char ch=str.charAt(i);
	    	   
	    	   if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	    		   v++;
	    	   else if(Character.isLetter(ch))
	    		   c++;
	       }
	       System.out.println(v+" vowels and "+c +" consonants");
	}

}
