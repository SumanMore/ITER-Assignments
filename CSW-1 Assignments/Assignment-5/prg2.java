import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.util.*;
public class prg2 {
public static double difValue(double n,double x)
{
	return (Math.pow(x, n-1)*n);
}
public static double funValue( double c,double n,double x)
{
	return (Math.pow(x, n)-c);
}
public static double calculate(double n,double c)
{
	int f=1;
	double x1=c/2;
	double x2=0.0;
	while(f<=100)
	{
	x2=x1-funValue(c,n,x1)/difValue(n,x1);
	x1=x2;
	f++;
	System.out.println(x1);
}
	return x1;
}
public static void main(String args[])
{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number.");
		double c=sc.nextDouble();
		System.out.println("Enter number of n.");
		double n=sc.nextDouble();
		NumberFormat nf=new DecimalFormat("#.000000");
		System.out.println(n+ " th root of "+c+ " is "+nf.format(calculate(n,c)));
		
}}



//or
/*
 
import java.text.DecimalFormat;
import java.util.*;
public class prg2 {
public static  void main(String args[])
{
double number;//c
int n;//nth root
double initial_guess;
double next_guess=0;
int i;
System.out.println("Enter number.");
 Scanner sc=new Scanner(System.in);
 number=sc.nextDouble();
 initial_guess=number/2.0;
 System.out.println("enter the nth root you want");
 n=sc.nextInt();
 for(i=1;i<=100;i++)
 next_guess=initial_guess-f(number,n,initial_guess)/df(n,initial_guess);
 initial_guess=next_guess;
 }
 System.out.printf("%f\n",next_guess);}
 public static double f(double c,int n,double i_guess)
 {
 return(Math.pow(i_guess,n)-c);
 }
 public static double df(int n,double i_guess)
 {
 return(n*Math.pow(i_guess,n-1));
 }
}*/