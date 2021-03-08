import java.text.NumberFormat;

public class prg4 {
	
		public static void main(String args[]) {
		float sum=0.0f;
			for(String s:args)
			{
				
				sum+=Float.parseFloat(s);
			
			}
			NumberFormat ob=NumberFormat.getInstance();
			ob.setMaximumFractionDigits(2);
			System.out.println("Sum= "+ob.format(sum) );
			
		//	System.out.printf("%8.2f",1234.2366);
			
}
}