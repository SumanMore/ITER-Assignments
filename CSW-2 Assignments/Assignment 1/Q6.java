
/*Write a program to calculate the parity bit of a 64 bit word using look up
table in O(n/L) time, where n is the word size and L is the group size.
Note: Consider group size is 16 bit for the problem.*/



    /* import java.util.Scanner;
public class ParityBitLookUpTable
{
    static void lookupcreator(int parity[])
    {
    	for(int i=0;i<65536;i++)
    	{
    		int x=i;
    		x^=x>>8;
    	     x^=x>>4;
    	     x^=x>>2;
    	     x^=x>>1;
    		parity[i]=(x&1);
    	}
    }
	public static void main(String[] args) 
	{
		 Scanner input=new Scanner(System.in);
		 int parity[]=new int[65536];
		 lookupcreator(parity);
		 System.out.println("Enter the binary word whose parity is to be calculated:");
		 long x=input.nextLong();
		 int m=0xFFFF;
		 int prt=parity[(int)(x>>48)&m]^parity[(int)(x>>32)&m]^parity[(int)(x>>16)&m]^parity[(int)x&m];
		 System.out.println("Parity of the entered number is:"+prt);
		
		 
	}

}
*/
import java.util.Scanner;
public class A1qno6 {
 public static int computepartity(int x){
 int result = 0;
while (x != 0) {
 result^= 1;
 x &= (x - 1);
}
return result;
}
public static void lookupTable(){
	int parity[] =new int[(int)Math.pow(2, 16)];
	for(int i=0;i<parity.length;i++){
	parity[i]=computepartity(i);
	}
	}
	public static long parity(long x){
	int ws = 16;
   int bm = 0xFFFF;
   return(computepartity((int)(x>>(3*ws))&bm)^compute
   partity((int)(x>>(2*ws))&bm)^computepartity((int)(x>>(w
   s))&bm)^computepartity((int)x&bm));
	}
	public static void main(String[] args) {
	lookupTable();
	Scanner sc=new Scanner(System.in);
	long x=Long.parseLong(sc.nextLine(),2);
	System.out.println(parity(x));
	sc.close();
	}
   }

