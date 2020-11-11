

	import java.util.Scanner;


public class No27 {
		static boolean shuffleCheck(String s1, String s2, String s3) {

		   
		    if(s1.length() + s2.length() != s3.length()) {
		      return false;
		    }
		    
		    int i = 0, j = 0, k = 0;

		    
		    while (k != s3.length()) {

		      if (i < s1.length() && s1.charAt(i) == s3.charAt(k))
		        i++;

		      else if (j < s2.length() && s2.charAt(j) == s3.charAt(k))
		        j++;

		      else {
		        return false;
		      }
		      k++;
		    }
		    if(i < s1.length() || j < s2.length()) {
		      return false;
		    }

		    return true;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner in = new Scanner(System.in);
			System.out.println("Enter first String.");
			String s1 = in.next();
			System.out.println("Enter second String.");
			String s2 = in.next();
			System.out.println("Enter third String.");
			String s3 = in.next();
			
			System.out.println(shuffleCheck(s1,s2,s3));
		}

	}


