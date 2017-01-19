import java.lang.String;
import java.lang.StringBuffer;

public class Rtrim
{
 public static void main(String... s)
  {
    
    StringBuffer s1=new StringBuffer("    Tanishk Gupta_____");
   int len=s1.length(); 
   for(int i=len-1;i>0;i--)
    {
     if(s1.charAt(i)!='_')
     {
     s1=s1.delete(i+1,len);
     break;
    }    
  } 
  System.out.println(s1);
  }
}