import java.lang.String;
import java.lang.StringBuffer;

public class Ltrim
 {
 public static void main(String... s)
 {
   StringBuffer s1=new StringBuffer("    Tanishk Gupta   ");
  
 for(int i=0;i<s1.length();i++) 
 {
   if(s1.charAt(i)!=' ')
   {
    s1=s1.delete(0,i);
    break;
   }
 } 

 System.out.println(s1);
 }  

}