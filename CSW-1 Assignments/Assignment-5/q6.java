import java.util.*;
import java.text.*;
public class q6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		NumberFormat nf=new DecimalFormat("##,##.##");
		double d=sc.nextDouble();
		System.out.println(nf.format(d));
	}
}

