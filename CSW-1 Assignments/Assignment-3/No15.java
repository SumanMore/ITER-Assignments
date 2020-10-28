import java.util.*;
public class No15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of string");
int n=sc.nextInt();
sc.nextLine();
System.out.println("enter the string");
String str[]=new String[n];
int i;

for(i=0;i<n;i++)
  str[i]=sc.nextLine();
for(i=0;i<n;i++)
{
	if(str[i].startsWith("Mr."))
	{
    System.out.println(str[i].replace("Mr.",""));		
	}
	else if(str[i].startsWith("Ms."))
	{
		System.out.println(str[i].replace("Ms.",""));		
	
	}}
	
}

}


