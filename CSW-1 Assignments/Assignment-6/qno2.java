
import java.time.*;


public class qno2 {
	 public static void main(String[] args)
	 {
		 LocalDate dNow = LocalDate.now(); // to print current date
		 System.out.println(dNow);
		 LocalTime tNow = LocalTime.now(); // to print current time
		 System.out.println(tNow);
		 LocalDateTime now = LocalDateTime.now();// to print current date and time
		 System.out.println(now);
		
	 }
	 }
/*import java.time.*;
import java.time.format.*;
public class qno2 {
	public static void main(String[] args) {
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
		   System.out.println(dtf.format(now));
	}

}
*/
