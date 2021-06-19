/*Write a program to find the parity bit of a number in O(k) time, where
kis the number of set bits.*/


public class Q4 
{
public static void main(String[] args)
 {
   long x=0b11010110;
   System.out.println(parity(x));
}

public static long parity(long x)
{
int r1 = 0;
while (x != 0) 
{
r1 ^= 1;
x = x&(x-1);
}
return r1;
}}
 
      