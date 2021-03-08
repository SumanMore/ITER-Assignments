//wap to get the number of days 

	import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.*;
	public class qno5 {
	public static void main(String []args){
	      Calendar obj = Calendar.getInstance();
	    int d = obj.getActualMaximum(Calendar.DAY_OF_MONTH);
		  
	     System.out.println("Number of days of a month : " + d); 
	       
		 
	    }
	}

