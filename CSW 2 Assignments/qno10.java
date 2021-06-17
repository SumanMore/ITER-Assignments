import java.util.*;

class Main {
  public static void main(String[] args) {
     List<Integer> ob=new ArrayList<Integer>();
    Collections.addAll(ob,3,7,5,11);
    randomsampling(3,ob);
   
  
}
public static void randomsampling(int k, List<Integer> A)
 {
Random gen = new Random ();
for (int i = 0; i < k; ++i) 
{
// Generate a random int in [i, A.size() - 1].
Collections. swap (A , i, i + gen.nextInt(A .size () -i));
}
System.out.println(A);
}
}