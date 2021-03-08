import java.time.*;
public class qno13
{
	public static void main(String args[])
	{
    LocalDate obj = LocalDate.of(2001,07,25);
    LocalDate pdate = LocalDate.now();
    Period difference = Period.between(obj,pdate);

 System.out.printf("age is %d years, %d months and %d days", 
                difference.getYears(), difference.getMonths(), difference.getDays());
 //System.out.println("your age is: "+difference.getYears()+"years" +difference.getMonths()+ " months"
 //+difference.getDays() +"days");
}
}