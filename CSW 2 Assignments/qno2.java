import java.util.*;
class Main 
{
  public static List<Integer> plusOne(List<Integer> A)
  {
    int n=A.size()-1;
    A.set(n,A.get(n)+1);
    for(int i=n;i>0 && A.get(i)==10;i--)
    {
      A.set(i,0);
      A.set(i-1,A.get(i-1)+1);

    }
    if(A.get(0)==10)
    {
      A.set(0,0);
      A.add(0,1);
    }
    return A;
  }
  public static void main(String[] args)
   {
   List<Integer> A=new ArrayList<Integer>();
   
   Collections.addAll(A,9,9,9);
   List<Integer> B;
   B=plusOne(A);
   System.out.println(B);
  }
}