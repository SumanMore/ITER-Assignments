

	import java.time.*;
	import java.util.*;

	public class qno12 { 
	   public static void main(String[] args)
	    {
		  /* LocalDateTime obj1 = LocalDateTime.parse("2020-07-26T20:45:20");
		   LocalDateTime obj2 = LocalDateTime.parse("2020-07-25T22:40:24");

		  Duration duration = Duration.between(obj2,obj1);
         System.out.println(duration.toHours());
         System.out.println(duration.toMinutes());
         System.out.println(duration.toMillis());
         System.out.println(duration.toSeconds());
         System.out.println(duration.toNanos());
         */
	LocalDate obj1=LocalDate.parse("2020-07-22");
	LocalDate obj2=LocalDate.parse("2020-07-23");
	Duration duration = Duration.between(obj2,obj1);
     System.out.println(duration.toHours());
     System.out.println(duration.toMinutes());
     System.out.println(duration.toMillis());
     System.out.println(duration.toSeconds());
     System.out.println(duration.toNanos());
	  }
	}

