import java.util.*;
class Main 
{
  public static void main(String[] args) 
  {
   ArrayList<ArrayList<Integer>> al=new ArrayList<ArrayList<Integer>>();
     al.add(new ArrayList<Integer>(Arrays.asList(1,2,3,4)));
     al.add(new ArrayList<Integer>(Arrays.asList(5,6,7,8)));
     al.add(new ArrayList<Integer>(Arrays.asList(9,10,11,12)));
     al.add(new ArrayList<Integer>(Arrays.asList(13,14,15,16)));

     System.out.println("list is:\n "+al);
     rotateMatrix(al);
  }
  public static void rotateMatrix(ArrayList<ArrayList<Integer>> sqMatrix) 
 {
  final int size=sqMatrix.size()-1;
  for (int i = 0; i < (sqMatrix.size() / 2); ++i) 
  {
  for (int j = i; j <size - i; ++j) 
  {
  int t1 = sqMatrix.get(size - j).get(i);
  int t2 = sqMatrix.get(size - i).get(size - j);
  int t3 = sqMatrix.get(j).get(size - i);
  int t4 = sqMatrix.get(i).get(j);
sqMatrix.get(i).set(j,t1);
  sqMatrix.get(size-j).set(i,t2);
  sqMatrix.get(size-i).set(size-j,t3);
  sqMatrix.get(j).set(size-i,t4);
 }
 }
  System.out.println("new list is:\n "+sqMatrix);
}
}
