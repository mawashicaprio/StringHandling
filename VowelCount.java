import java.lang.String;
import java.lang.StringBuffer;

public class VowelCount
{
  public static void main(String... s)
  {
   String s1=" I am A rockstart ";
   int count=0;

   for(int i=0;i<s1.length();i++)
   {
   if((s1.charAt(i)=='a')||(s1.charAt(i)=='e''''''''')||(s1.charAt(i)=='i')||(s1.charAt(i)=='o')||(s1.charAt(i)=='u'))
   count++;
   }
  
  System.out.println(count);
  }

}