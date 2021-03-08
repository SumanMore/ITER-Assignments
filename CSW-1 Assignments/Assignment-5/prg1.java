
/*import java.util.*;
import java.text.NumberFormat;
import java.text.DecimalFormat;
public class prg1 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the amount borrowed");
	double amtborrowed=sc.nextDouble();
	System.out.println("enter the annual interst rate");
	double r=sc.nextDouble();
	System.out.println("enter the number of payments");
	int num=sc.nextInt();
	double mir=r/1200.0;
	double i,p,p1;
	double payment=(mir*amtborrowed)/(1-Math.pow((1+mir),-num));
	NumberFormat nf=new DecimalFormat("#.00");
	System.out.println("PaymentBalance  Interest  Principal  Principal");
	
	for(int k=1;k<=num;k++)
	{
		 i=mir*amtborrowed;
		 p=payment-i;
		 p1=amtborrowed-p;
  System.out.println(k+"                 "+nf.format(i)+"     "+nf.format(p)+"    " +nf.format(p1));
	amtborrowed=p1;
	}
	
}
}*/
import java.util.Scanner;
public class prg1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double am =sc.nextDouble();
		double air=sc.nextDouble();
		int nop=sc.nextInt();
		double mr=air/1200;
		double mp = am*mr/(1-(Math.pow(1+mr,-nop)));
		System.out.printf("Payment %-15.2f Principal %.2f\n",am,mp);
		System.out.printf("Annual Intrest %-8.2f Term %d\n",air,nop);
		double bal = am,p,ist;
		System.out.println("PaymentNumber     Interest     Principal     Balance");
		for (int i=1;i<=nop;i++) {
			ist=mr*bal;
			p=mp-ist;
			bal=bal-p;
			System.out.printf("%-20d%-13.2f%-13.2f%.2f\n", i, ist,p,bal);
		}
		System.out.printf("Final Payment%11.2f\n",mp);
	}
}

/*
 * import java.io.FileWriter;
import java.util.Scanner;
public class Q1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double am =sc.nextDouble();
		double air=sc.nextDouble();
		int nop=sc.nextInt();
		double mr=air/1200;
		double mp = am*mr/(1-(Math.pow(1+mr,-nop)));
		try {
			FileWriter fw=new FileWriter("Text.txt");
			fw.write(String.format("Payment %-15.2f Principal %.2f\n",am,mp));
			fw.write(String.format("Annual Intrest %-8.2f Term %d\n",air,nop));
		double bal = am,p,ist;
		fw.write(String.format("PaymentNumber     Interest     Principal     Balance\n"));
		for (int i=1;i<=nop;i++) {
			ist=mr*bal;
			p=mp-ist;
			bal=bal-p;
			fw.write(String.format("%-20d%-13.2f%-13.2f%.2f\n", i, ist,p,bal));
		}
		fw.write(String.format("Final Payment%11.2f\n",mp));
		fw.close();
		}
		catch (Exception e) {
			System.err.println(e);
		}
		System.out.println("Written Successfully");
	}
}
 */



