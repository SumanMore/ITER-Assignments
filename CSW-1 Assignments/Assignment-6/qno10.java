

	import java.time.*;
	public class qno10 {
	   public static void main(String[] args)
	    {
	     
	LocalDate date=LocalDate.now();
	System.out.println(date);
	LocalDate obj1=date.minusDays(10);
	System.out.println("before "+obj1);
	LocalDate obj2 =date.plusDays(10);
	System.out.println("after "+obj2);
	}}