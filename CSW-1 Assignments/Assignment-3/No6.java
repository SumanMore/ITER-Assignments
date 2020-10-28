//6.	Write a program to enter N number of strings arrange them in ascending order.
import java.util.Scanner;
public class No6 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int N=sc.nextInt();
	
	System.out.println("enter the string");
	String str[]=new String [N];
	for(int k=0;k<N;k++) {
	str[k]=sc.next();}
	int i,j;
	String 	temp;
	for(i=0;i<str.length;i++)
	{
		for(j=0;j<str.length-1;j++)
		{
			if(str[j].compareTo(str[j+1])>0)
			{
				temp=str[j];
				str[j]=str[j+1];
				str[j+1]=temp;
			}
		}}
	for(int l=0;l<N;l++)
		System.out.println(str[l]);}
	}