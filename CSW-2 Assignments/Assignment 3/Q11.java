/*Run-length encoding (RLE) compression offers a fast way to do efficient
on-the-fly compression and decompression of strings. The idea is simple
encode successive repeated characters by the repetition count and the
character. For example, the RLE of ”aaaabcccaa” is ”4alb3c2a”. The
decoding of ”3e4f2e” returns ”eeeffffee”. Implement run-length encoding
and decoding functions. Assume the string to be encoded consists of letters
of the alphabet, with no digits, and the string to be decoded is a valid
encoding.*/


class Main {
  public static void main(String[] args) {
    System.out.println(encoding("aaaabccccaa"));
    System.out.println(decoding("3e4f4e"));
  }

 public static String decoding(String s) 
 {
int count = 0;
StringBuilder result = new StringBuilder();
for (int i = 0; i < s.length(); i++)
{
char c = s.charAt(i);
if (Character . isDigit(c)) 
{
count = count * 10 + c - '0' ;
} else 
{ 
while (count >0)
{ 
result.append(c);
count--;
}
}
}
return result.toString();
}

public static String encoding(String s)
{
int count = 1;
StringBuilder ss = new StringBuilder();
for (int i = 1; i <= s.length(); ++i) 
{
if (i == s.length() || s.charAt(i) != s.charAt(i - 1))
 {

ss.append(count);
ss.append(s.charAt(i - 1));
count = 1;
} 
else
{ 
++count ;
}
}
return ss.toString();

}}