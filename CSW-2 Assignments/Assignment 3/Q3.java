/*
Implement a function that converts a spreadsheet column id to the corresponding integer, with ”A” corresponding to 1. For example, you should
return 4 for ”D”, 27 for ”AA”, 702 for ”ZZ”, etc. How would you test
your code?
*/

class Main {
  public static void main(String[] args)
   {
    int n=Decode("YZ");
    System.out.println(n);

  }
  public static int Decode(String col)
   {
int r = 0;
for (int i = 0; i < col .length() ; i++)
{
char c = col . charAt(i);
r = r* 26 + c - 'A' + 1;
}
return r;
}

}