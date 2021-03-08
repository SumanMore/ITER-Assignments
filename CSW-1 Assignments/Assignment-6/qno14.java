

	import java.time.*;
	import java.time.temporal.*;
	public class qno14 {
	   public static void main(String[] args)
	    {
	    LocalDate localdate = LocalDate.now();    
	    System.out.println("previous Friday: "+localdate.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY)));;
	    System.out.println("next Friday: "+localdate.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)));
	    }
	}

