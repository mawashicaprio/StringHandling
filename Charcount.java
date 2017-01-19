import java.lang.String;
import java.lang.StringBuffer;

public class Charcount
{
  public static void main(String... s)
 {
   String s1="    India is a   Good Country     ";
  
   int count=0;
 for(int i=0;i<s1.length();i++)
{  
 if(s1.charAt(i)!=' ')
   {
         count++;
   }
 
}
   System.out.println(count);

 } 

}