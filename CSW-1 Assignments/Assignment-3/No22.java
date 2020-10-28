//Write a java code to swap two string variables without using third or temp variable..
import java.util.*;
public class No22 {
   public static void main(String args[]){
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter 1st String");
	   String str1 =sc.nextLine();
	   System.out.println("Enter 2nd String");
	   String str2=sc.nextLine();
      int p= str1.length();
      str1 = str1+str2;
      str2 = str1.substring(0,p);
      str1 = str1.substring(p);
      System.out.println("after swapping first string:"+str1);
      System.out.println("after swapping second string:"+str2);
   }
}