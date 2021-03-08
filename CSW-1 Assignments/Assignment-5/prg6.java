/*import java.text.DecimalFormat;
import java.util.*;
public class prg6 {
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
	
	
	System.out.println("enter the number of input ");
	int n=sc.nextInt();
	double f[]=new double[n];
	for (int i=0;i<n;i++)
		f[i]=sc.nextDouble();
	DecimalFormat ob=new DecimalFormat("0.00");
	System.out.println("fahrehnite   " +   "  celsius");
	for (int i=0;i<n;i++) {
		double c= 5*(f[i]-32)/9;
		System.out.println(f[i]+"f    "+ob.format(c)+"c");
	}
	
}
}*/
//or

/*import java.text.DecimalFormat;
import java.text.NumberFormat;
public class prg6 {
public static void main(String args[])
{
	for (double c=0;c<=100;c++) {
		NumberFormat f=new DecimalFormat("0.00");
	double d=(c*9.0/5.0)+32;
	System.out.println(c+" = "+f.format(d)+"\t");
	
}}
}*/
//or
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;
public class prg6 {
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
	
	
	System.out.println("enter the fahrehheit temp");
	double inp=sc.nextDouble();
	double c=(5.0/9.0)*(inp-32);
	NumberFormat nf=NumberFormat.getInstance();
	nf.setMaximumFractionDigits(2);
	System.out.println("the temp is "+nf.format(c)+"celsius");
}
}
	
/*import java.text.DecimalFormat;
import java.text.NumberFormat;

public class prg6 {
	public static void main(String[] args) {
        for (double c=0;c<=100;c++){
        	NumberFormat nf=new DecimalFormat("0.00");
    		double d=(c*9.0/5.0)+32 ;
            System.out.println(c+" = "+nf.format(d)+"\t");
            }
	}


	}*/












