import java.lang.String;
import java.lang.StringBuffer;

public class FreqCount
{
 public static void main(String... s)
 {
   StringBuffer s1=new StringBuffer("TheRockst");
   int count;
   for(int i=0;i<s1.length();i++)
   { 
    count=1;
    for(int j=i+1;j<s1.length();j++)
    {
      if( (s1.charAt(i)) == (s1.charAt(j)) )
      {
       s1 = s1.delete(j,j+1);
       j--;
       count++;
      }
    }
    System.out.print(String.valueOf(s1.charAt(i)) + count);
   }
   
 } 
}