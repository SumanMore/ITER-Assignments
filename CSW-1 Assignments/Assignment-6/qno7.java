//To get date after 2 weeks
import java.time.*;
public class qno7 {
	public static void main(String[] args) {
		LocalDate obj=LocalDate.now();
		LocalDate ob=obj.plusDays(14);
		//LocalDate ob=obj.plusWeeks(2);
		System.out.println(ob);
		
	}

}
