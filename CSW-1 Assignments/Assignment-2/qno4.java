//WAP to read and display all the environment variable.
import java.util.Map;
public class qno4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> env=System.getenv();
		for(Map.Entry<String,String>entry:env.entrySet())
		{
			System.out.println(entry.getKey()+ ":" +entry.getValue());
		}

	}

}
