

	import java.util.*;
	import java.time.*;
import java.time.temporal.TemporalAdjusters;
import java.text.*;

	public class qno4 {

	public static void main(String []args){
	     YearMonth ym = YearMonth.of(2020,11);

		 String firstDay = ym.atDay(1).getDayOfWeek().name();
		 String lastDay = ym.atEndOfMonth().getDayOfWeek().name();
		
		 System.out.println(firstDay);
	 	 System.out.println(lastDay);
		
	     }
	}
/*
 * import java.time.*;
	import java.time.temporal.*;
	import java.util.*;
	public class qno4
	{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	LocalDate date2=LocalDate.parse(sc.next());
	System.out.println(localDate.with(TemporalAdjusters.firstDayOfMonth()).getDayOfWeek().name()));
	System.out.println(localDate.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek().name()));
	}}
	*/	
