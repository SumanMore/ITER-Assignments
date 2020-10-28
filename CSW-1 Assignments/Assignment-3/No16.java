//16.	Write a java program to read two string as user input and check if first contains
import java.util.Scanner;

public class No16 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter 1st String");
		String s1=in.nextLine();
		System.out.println("Enter 2nd String");
		String s2=in.nextLine();
        System.out.println(s1.contains(s2));
       
        
}}