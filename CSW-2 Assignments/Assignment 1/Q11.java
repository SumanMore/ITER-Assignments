//Write a program to find the closest integer with the same weights

class Main {
  public static void main(String[] args)
   {
    long  x=0b0111;
    System.out.println(closestinteger(x));
    }
public static long closestinteger(long x) {
int n=4;
for (int i = 0; i < n- 1; ++i) {
if ((((x >> i) & 1) != ((x >> (i + 1)) & 1))) 
{
x ^= (1 << i) | (1 << (i + 1)); 
}}
return x;
}
}
