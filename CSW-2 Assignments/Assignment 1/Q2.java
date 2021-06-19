/*Write a program to find the parity bit of a number in O(n) time, where
nis the word size.*/




public class Q2 {
   public static void main(String[] args)
 {
    long x=0b11010110;
    System.out.println(parity1(x));
}
public static long parity1(long x)
{
int r = 0;
while (x != 0) 
 {
  r ^= (x & 1);
  x = x>>1;
}
return r;
}}
      