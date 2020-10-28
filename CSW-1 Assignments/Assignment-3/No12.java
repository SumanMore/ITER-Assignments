/*12.	Write a method that converts its String parameter so that letters are written in blocks five characters 
 * long. For example, consider the following two versions of the same sentence:
Plain : This i s how we would o r d i n a r i I y w r i t ea s e n t e n c e .
Blocked : T h i s i showw ewoul dordi n a r i I ywrit easen t e n c e .
*/


import java.util.*;
public class No12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
str=str.replaceAll(" ","");
int i;
for(i=0;i<str.length();i++)
{
	if(i%5==0 && i!=0)
		System.out.print(" ");
	System.out.print(str.charAt(i));
}
	
	
	
	}

}
