/*Write a program to check if a decimal number is a palindrome*/

class Main {
  public static void main(String[] args)
   {
     int x=121;
     boolean res=pallindrome(x);
     if(res==true)
        System.out.println(x +" is pallindrome no.");
     else
         System.out.println(x +" is not pallindrome no.");  
   }     
    public static boolean pallindrome (int x) 
    {
      if (x < 0) 
        {
         return false;
        }
     int num = (int) (Math .floor(Math . log10(x))) + 1;
     int msdmask = (int)Math .pow(10 , num - 1);
    for (int i = 0; i < (num / 2); ++i) 
    {
       if (x / msdmask != x % 10) 
       {
       return false ;
       }
    x %= msdmask;
    x /= 10;
    msdmask /= 100;
}
return true;
  }
}