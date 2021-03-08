
import java.time.*;
import java.util.*;
public class qno11 {
public static void main(String[] args) {
	
	/*LocalDate dt1=LocalDate.now();
	System.out.println("Current Year: " + dt1.getYear());  

	System.out.println("Is current year leap year? " +dt1.isLeapYear());
	int length=dt1.lengthOfYear();
	System.out.println("Length of the year:" + length+" days"); }}
	*/
/*int y=sc.nextInt();

//Year year = Year.now();
 
 Year year = Year.of(y);
 System.out.println("Current Year: " + year);  
 boolean checkLeap = year.isLeap();
 System.out.println("Is current year leap year? " +checkLeap);  
 int length = year.length();
 System.out.println("Length of the year:" + length+" days"); 
}
}
*/

Scanner sc=new Scanner(System.in);
System.out.println("enter date in format(yyyy-mm-dd) ");
String d=sc.next();
LocalDate date = LocalDate.parse(d);
System.out.println("Current Year: "+date.getYear());
System.out.println("Is the current year leap year? "+date.isLeapYear());
System.out.println("Length of the year: "+date.lengthOfYear());


}}
