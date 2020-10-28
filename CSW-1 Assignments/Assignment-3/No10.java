
import java.util.*;
public class No10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String doc=sc.nextLine();
String target=sc.nextLine();
String replacement=sc.nextLine();
doc=doc.replaceAll(target,replacement);
System.out.println(doc);
}
}
