import java.util.*;
public class q1 {

	public static void main(String args[])
	{
		String s="56.79";
		String s1=s.substring(0,s.indexOf("."));
		String s2=s.substring(0,s.indexOf(".")+1);
		double wp=Double.parseDouble(s1);
		double fp=Double.parseDouble(s2);
		System.out.println("sum =" +(fp+wp));
		
	}}
		

/*
 * import java.util.*;
 * public class q1 {

	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	for(String s1: s.split("\\."))
	{
	int num=Integer.parseInt(s1);
	int sum=0;
	for(int i=num;i>0;i=i/10)
	  sum=sum+i%10;
	System.out.println(sum);
	}}
	*/  
	
