import java.time.*;
import java.util.*;

public class qno9 {

	public static void main(String[] args)
	{ Scanner sc=new Scanner(System.in);
		System.out.println("enter the year");
		
	Year year = Year.of(sc.nextInt());
    System.out.println("Current Year:" + year);  
     boolean obj = year.isLeap();
     if(obj==true)
        System.out.println("the current year "+year+  " is a leap year  has " +year.length()+" days");
    	
     else
    	 System.out.println("the current year "+year+  " is not a leap year has " +year.length()+" days"); 
    	 
	}
}
/*
 * import java.time.*;
 * import java.util.*;
 * public class qno9
 * {
 * public static void main(String args[])
 * {
 * Scanner sc=new Scanner(System.in);
 * LocalDate dt1=LocalDate.parse(sc.next());
 * System.out.println(dt1.isLeapYear());}}
 * 
 */


/*
 * import java.util.*;
 * public class qno9
 * {
 * public static void main(String args[])
 * {
 * Scanner sc=new Scanner (System.in);
 * int year=sc.nextInt();
 * if((year%4==0)&& year%100!=0))|| (year%400==0))
 *  System.out.println("leap year");
 * else
 *  System.out.println(" not a leap year");
 */


