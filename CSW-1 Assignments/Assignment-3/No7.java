/*7.	Write a program to enter a name as string and print the name in shorter manner.
Ex: Ram Chandra Dash will become R.C.Dash
*/
import java.util.*;
public class No7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		String st1="";
		str=' '+str;
		int i;
		int ld=str.lastIndexOf(' ');
		String sn=str.substring(ld);
		for(i=0;i<ld;i++)
		{
			char ch=str.charAt(i);
			if(ch==' ')
				st1=st1+str.charAt(i+1)+".";
		}
		
		System.out.println(st1+sn);
	}

}
