
import java.util.*;
public class prg7 {
	public static void p_num(long num)
	{
	long temp=num;
	long reverse=0;
	while(temp!=0)
	{
		long d=temp%10;
		reverse=reverse*10+d;
		temp/=10;
	}
	long sum=reverse+num;
	long reverse_sum=0;
	temp=sum;
	while(temp!=0) {
		long d=temp%10;
		reverse_sum=reverse_sum*10+d;
		temp/=10;
	}
	if(reverse_sum==sum)
	{
		System.out.println("original num is "+num+" reverse "+reverse);
		System.out.println(sum+ "is pallindrome");
		
	}
	else
	{
		p_num(sum);
	}}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
long n=sc.nextLong();
p_num(n);
}}
	
	/*
	 * import java.util.Scanner;
public class prg7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n=in.nextLong();
		in.close();
		int i=1;
		while(true){
			System.out.println("Input "+n);
			long r=rev(n,0);
			System.out.println("rev "+r);
			long sum=r+n;
			long sumr=rev(sum,0);
			if(sum==sumr){
				System.out.println("Sum "+sum+" is Palindromic");
				break;
			}
			else{
				System.out.println(i++ + "-Sum "+sum+" is Not Palindromic");
				n=sum;
			}
		}
	}
	private static long rev(long n, long r){
		if(n==0)
			return r;
		else{
			r=r*10+n%10;
			return rev(n/10,r);
		}
	}
}
	 */
	
	
	
	
		
	
