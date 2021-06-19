
/*Write a java program to count the number of bits that are set 1 in an
integer. Also prove that time complexity is O(n) where n is the number
of bits*/



class Main {
  public static void main(String[] args) {
  int x=0b101100;
  int res=Approach_1(x);
  System.out.println("using first approach : "+res);
  int res1=Approach_2(x);
  System.out.println("using second approach : "+res1);
  }

public  static int Approach_1(int a)
{
  int c=0;
  while(a!=0)
  {
  c+=(a&1);
  a=a>>1;
  }
  return c;
}

public static int Approach_2(int b){
int y,c1=0;
  while(b!=0)
  {
   y=b & ~(b-1);
   b=b^y;
   ++c1;
   }
   return c1;
  }
}