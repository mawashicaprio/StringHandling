import java.lang.String;
import java.lang.StringBuffer;

public class Reverse
{
  public static void main(String... s)
  {
   String s1="Tanishk Gupta";
   String s2=new String();
   for(int i=(s1.length())-1; i>=0; i--)
   {
     s2=s2.concat(String.valueOf(s1.charAt(i)));
     System.out.print(s1.charAt(i));
   }
   System.out.println("\n"+s2);
  }
}