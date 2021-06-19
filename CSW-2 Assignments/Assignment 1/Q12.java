/*. Write a program to compute XXY using bit wise operator.*/


class Main {
  public static void main(String[] args)
   {
    long x=0b1101,y=0b1001;
    System.out.println(Long.toBinaryString(multiply(x,y)));
}
  public static long multiply(long x,long y)
   {
    long res =0,k=0;
    while (x !=0) 
    {
      if ((x & 1) != 0)
      {
      res = add(res , y<<k);
      }
    k=k+1;
    x>>=1;}
    return res;
    }  
    public static long add(long res,long y) 
    { 
      long carry=0;
      while(y!=0)
      {
        carry=res&y;
        res=res^y;
        y=carry<<1;
      }
return res;
    }}
