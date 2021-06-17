import java.util.*;
class Main {
  public static void main(String[] args) {
    List<Integer> ob=new  ArrayList<Integer> ();
    Collections.addAll(ob,310,315, 275, 295, 260, 270, 290, 230, 255, 250);
    computeMaxProfit(ob);}

    
  
public static void computeMaxProfit(List<Integer> prices) {
int  minPrice = Integer.MAX_VALUE , maxProfit = 0;
for (int p : prices) {
  minPrice = Math.min(minPrice , p);
maxProfit = Math.max(maxProfit , p-minPrice);

}


System.out.println(maxProfit);
}}