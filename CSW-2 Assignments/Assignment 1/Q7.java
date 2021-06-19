import java.util.Scanner;
public class ParitUsingOnlyXorAndRightOperator {

	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number whose parity is to be calculated:");
		long x=input.nextLong();
		x^=x>>32;
		x^=x>>16;
		x^=x>>8;
		x^=x>>4;
		x^=x>>2;
		x^=x>>1;
		System.out.println("Parity is:"+(x&1));
	}

}
