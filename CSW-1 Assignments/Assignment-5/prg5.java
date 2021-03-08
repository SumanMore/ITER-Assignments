import java.util.*;
public class prg5 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int n=sc.nextInt();
	int d=n,rev=0;
	while(d>0)
	{
		int r=d%10;
		rev=rev*10+r;
		d/=10;
	}
	if(rev==n)
		 System.out.println("valid pallindrome no");
	else
		System.out.println("not a valid pallindrome no");
	
	
}}