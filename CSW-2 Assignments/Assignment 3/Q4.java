/*
Write a program which takes as input an array of characters, and removes
each ’b’ and replaces each ’a’ by two ’d’s. Specifically, along with the
array, you are provided an integer-valued size. Size denotes the number
of entries of the array that the operation is to be applied to. You do not
have to worry preserving about subsequent entries. For example, if the
array is ¡a, b, a,c,J¿ and the size is 4, then you can return ¡d, d,d,d, c¿.
You can assume there is enough space in the array to hold the final result.
*/

/*
import java.util.*;
class Main
 {
  public static void main(String[] args) 
  {
  ArrayList<Character> ob= new ArrayList<Character>();
  ArrayList<Character> ob1= new ArrayList<Character>();
   Collections.addAll(ob,'a','c','d','b','b','c','a');
     //Collections.addAll(ob,'a','c','a','a');
      int j=0;
      for(int i=0;i<ob.size();i++)
      { 
         if(ob.get(i)== 'a')
          {  
            ob1.add(j++,'d');
            ob1.add(j++,'d');
          }
        else if(ob.get(i)!='b')
          {
          ob1.add(j++,ob.get(i));
          }
   }
System.out.print(ob1);
}
}*/

public class Main {

	public static void main(String args[])
  {
		char ch[]= {'a','c','d','b','b','c','a'};
		int size=ch.length;
		replaceAndRemove(size,ch);
	}
	public static void replaceAndRemove (int size, char[] s) {
		int idx =0, aCount = 0;
		for (int i = 0; i < size; ++i){
			if (s[i] != 'b') {
				s[idx++] = s[i];
			}
			if (s[i] == 'a') {
				++aCount ;
			}
		}
		int cidx = idx - 1;
		idx = idx + aCount - 1;
		final int finalSize = idx + 1;
		while (idx >= 0) {
		if (s[cidx] == 'a') {
			s[idx--]='d';
			s[idx--]='d';
			} 
		else {
			s[idx--] = s[cidx];
		}
		--cidx ;
		}
		for(int k=0;k<size;k++) {
			System.out.print(s[k]+" ");
		}
	}

}
