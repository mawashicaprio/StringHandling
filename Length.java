import java.lang.String;
import java.lang.StringBuffer;

public class Length
{
 public static void main(String... s)
 {
  String s1=" I am A rockstar ";
  int count=0;
  int i=0;
 try{

  while(s1.charAt(i)!='%')
  {
   count++;
   i++;
  }
System.out.println(count);
   }catch(Exception e){System.out.println(e);}  
 }
}
