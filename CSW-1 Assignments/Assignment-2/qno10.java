
//Print all system properties.
import java.util.Properties;
public class qno10 {

	public static void main(String[] args) {
		
		System.out.println("print all system prperties: ");
		
		
		Properties ob=System.getProperties(); 
		ob.list(System.out);}}